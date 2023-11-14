package com.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class AuthorbookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//loads the hibernate.cfg.xml file
				StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
				//in the file start reading the tags 		
				Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();	
				//go to session factory and read the tags 		
				SessionFactory sf=md.getSessionFactoryBuilder().build();
				//all the crud operations need to be done in session 
				Session s=sf.openSession();
				//what ever the operation of crud happening it need to get saved 
				Transaction t=s.beginTransaction();
				Author au=new Author();
//				au.setName("Gaurav");
//				au.setEmail("g@c.c");
//				s.save(au);   //inserted 
//				
//				Book book=new Book();
//				book.setTitle("Java FSD");
//				book.setAuthor(au);
//				s.save(book);
			
				//HQL to get data
					
				//HQL 
				//select * from employee-sql
//						Query q=s.createQuery("from Employee");
				
				t.commit();
				s.close();
				sf.close();

	}

}

