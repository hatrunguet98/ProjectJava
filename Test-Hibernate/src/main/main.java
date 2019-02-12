/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.List;
import model.user;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Ha Trung
 */
public class main {
    public static void main(String[] args){
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction transaction = session.getTransaction();
            user user1 = (user) session.get(user.class, 1);
            transaction.commit();
            System.out.println("user");
        } catch (HibernateException h) {
        }
    }
}
