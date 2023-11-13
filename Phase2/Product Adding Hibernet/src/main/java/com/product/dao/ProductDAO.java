package com.product.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.product.hibernateutil.HibernateUtil;
import com.product.pojo.Product;

public class ProductDAO {

    public void addProduct(Product product) {
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(product);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    public List<Product> getAllProducts() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Product> query = session.createQuery("FROM Product", Product.class);
            List<Product> productList = query.list();
            System.out.println("Retrieved products: " + productList.size());
            return productList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}