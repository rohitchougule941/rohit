package com.scp.BasicHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println(".......Hibernate Maven Example.......\n");
    	
        
    	AnnotationConfiguration cfg=new AnnotationConfiguration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        User p=new User(); 

        p.setId(105);
        p.setName("java4s");
        //p.setPrice(15000);

        Transaction tx = session.beginTransaction();
        session.save(p);
        System.out.println("Object saved successfully using annotations.....!!");
        tx.commit();
        session.close();
        factory.close();
    }
    }

