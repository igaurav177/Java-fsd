package learnhibernate;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.hibernate.query.Query;

/*StandardServiceRegistry 
Metadata
SessionFactory
Session 
Transaction 
Close the connection 
 */
public class EmployeeMain {

	public static void main(String[] args) {
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
		
		Scanner sc=new Scanner(System.in);
//		Employee e=new Employee();
//		System.out.println("enter the employee id ");
//		e.setId(sc.nextInt());
//		System.out.println("enter the employee name ");
//		e.setName(sc.next());
//		System.out.println("enter the salary ");
//		e.setSalary(sc.nextDouble());
		//insert operation
//		s.save(e);	
		// for insert and update both 
//		s.saveOrUpdate(e);
		// delete
//		s.delete(e);
		
		// retrive of a record is been done by the id 
//		System.out.println(s.get(Employee.class, 1));
		
		
		
		// HQL 
		
//		for(int i=1;i<10;i++) {
//				Employee e=new Employee();
//				e.setId(i);
//				e.setName("name"+i);
//				e.setEmail("name"+i+"@c.c");
//				e.setSalary(i*1000);
//				s.save(e);
//				}               
		/*
 	    Query interface 
		Session object 
		create Query
 */

//HQL 
//select * from employee-sql
//		Query q=s.createQuery("from Employee");
//		List<Employee> list= q.list();
//		for(Employee e:list) {
//			System.out.println(e);
//		}

		//select * from employee where salary=1000;
//		Query q=s.createQuery("from Employee where salary=1000");
//		Employee obj=(Employee) q.uniqueResult();
//		System.out.println(obj);
		
//		>1000
//		Query q=s.createQuery("from Employee where salary>1000");
//		List<Employee> list= q.list();
//		for(Employee e:list) {
//			System.out.println(e);
//		}
		
		//select name,email from employee where salary=1000	
//		Query q=s.createQuery("select name,email from Employee where salary=1000");
//		Object[] obj= (Object[]) q.uniqueResult();
//		System.out.println(obj[0]+"  "+obj[1]);		

		//>1000
//		Query q=s.createQuery("select name,email from Employee where salary>1000");
//		List<Object[]> emp=q.list();
//		for(Object obj[]:emp) {
//		System.out.println(obj[0]+"  "+obj[1]);
//		}
		
		
//if more than one column go with the object type , if only one column go with the datatype 		
//		Query q=s.createQuery("select salary from Employee where salary>1000");
//		List<Double> emp=q.list();
//		for(Double d:emp) {
//		System.out.println(d);
//		}	
		
//		Query q=s.createQuery("select sum(salary) from Employee where salary>1000");
//		double sum =(double) q.uniqueResult();
//		System.out.println(sum);
		
		//update query 
		Query q= s.createQuery("update Employee set name=:name where id=:id");
		q.setParameter("name", "Gaurav");
		q.setParameter("id", 1);
		q.executeUpdate();

	
		


		t.commit();
		s.close();
		sf.close();



	}

}
