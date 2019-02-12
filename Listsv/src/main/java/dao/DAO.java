package dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ha Trung
 */
public class DAO {
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction transaction = session.beginTransaction();
    public ArrayList<sinhvien> getListsinhvien(){
        ArrayList<sinhvien> listSinhVien = new ArrayList<>();
        try {
            String hql = "FROM sinhvien";
            Query query = session.createQuery(hql);
            listSinhVien = (ArrayList<sinhvien>) query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSinhVien;
    }
    public boolean addSinhvien(sinhvien s){
    try {
        sinhvien s1 = new sinhvien();
        s1.setName(s.getName());
        s1.setAge(s.getAge());
        s1.setMsv(s.getMsv());
        session.save(s1);
        transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean editSinhvien(sinhvien s, String idRow){
    try {
        String hql ="UPDATE sinhvien set msv=:msv,name=:name,age=:age"+" WHERE id=:idRow";
        Query query = session.createQuery(hql);
        query.setParameter("idRow",parseInt(idRow));
        query.setParameter("msv",s.getMsv());
        query.setParameter("name",s.getName());
        query.setParameter("age",s.getAge());
        query.executeUpdate();
        transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean deleteSinhvien(String idRow){
    try {
        String hql ="DELETE from sinhvien WHERE id=:idRow";
        Query query = session.createQuery(hql);
        query.setParameter("idRow",parseInt(idRow));
        query.executeUpdate();
        transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<sinhvien> returnSinhvien(String msvRow){
        ArrayList<sinhvien> listSinhVien = new ArrayList<>();
        try {
            String hql = "FROM sinhvien s Where s.msv=:msvRow";
            Query query = session.createQuery(hql);
            query.setParameter("msvRow",Integer.parseInt(msvRow));
            listSinhVien = (ArrayList<sinhvien>) query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSinhVien;
    }
    
}
