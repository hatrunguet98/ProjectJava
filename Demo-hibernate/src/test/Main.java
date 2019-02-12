/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.user;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Ha Trung
 */
public class Main {
    
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        user user1 = new user();
        user1.setName("Tu1");
        user1.setId(2);
        user1.setAge(21);
        session.save(user1);
        transaction.commit();
        
    }
}
