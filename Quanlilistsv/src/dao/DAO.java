package dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Ha Trung
 */
public abstract class DAO <T> {
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction transaction = session.beginTransaction();
    public List<T> finAll(String table){
        List<T> list=new ArrayList<T>();
        try {
            String hql = "FROM "+table;
            Query query = session.createQuery(hql);
//            query.setParameter("a",parseInt(table));
            list=query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }     
        return list;
    }
    public List<T> finId(String table,String id){
        List<T> list=new ArrayList<T>();
        try {
            String hql = "FROM "+table + " where id=:id";
            Query query = session.createQuery(hql);
            query.setParameter("id",parseInt(id));
            list= (ArrayList<T>) query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public void saveT(T object){
        try {
            session.save(object);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }     
    }
    public void updateT(T object){
        try {
            session.update(object);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }     
    }
    public void delete(String id){
        try {
        String hql ="DELETE from lophoc WHERE id=:idRow";
        Query query = session.createQuery(hql);
        query.setParameter("idRow",parseInt(id));
        query.executeUpdate();
        transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
