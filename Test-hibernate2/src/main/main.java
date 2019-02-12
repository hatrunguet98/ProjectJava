package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import model.phuongtien;
import model.user;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ha Trung
 */
public class main {
    public static void main(String[] args){
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
//            int id=1;
//            user user1 = (user) session.get(user.class, id);
//            transaction.commit();
//            System.out.println("user"+user1.toString());
//            System.out.println("phuongtien"+user1.getListPt());
//            System.out.println("haha");
            String hql = "from user";
            Query query = session.createQuery(hql);
            List<Object[]> list = query.list();
            for(Object[] arr : list){
                System.out.println(Arrays.toString(arr));
            }
    }
}
