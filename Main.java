package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      
        Student s1 = new Student();
        s1.id = 1;
        s1.firstName = "chris";
        s1.lastName = "c";
        s1.marks = (long) 89.0;

        Address a = new Address();
        a.id = 1;
        a.lineOne = "mac artur blvd";
        a.lineTwo = "cider street";
        a.zipcode = "01820";
        a.city = "irving";

        s1.address = a;
        Configuration cfg = new Configuration();
        //cfg.addAnnotatedClass(org.example.Student.class);
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

      Student retrieve =  session.get(Student.class, 1);
        System.out.println(retrieve.firstName + " " + retrieve.lastName);
        tx.commit();
        session.close();
    }
}
