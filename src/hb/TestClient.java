/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hb;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author TATARAO
 */
public class TestClient {
    
    public static void main(String[] args) {
        try {
            Session session=new Configuration().configure().buildSessionFactory().openSession();
            Transaction tx=session.beginTransaction();
            
            UserTable u1=new UserTable();
            u1.setUserid(101);
            u1.setFirstname("raja");
            
            PhoneNumber ph1=new PhoneNumber();
            ph1.setNumbertype("residence");
            ph1.setPhonenum(650056);
            
            PhoneNumber ph2=new PhoneNumber();
            ph1.setNumbertype("office");
            ph1.setPhonenum(656356);
            
            Set s1=new HashSet();
            s1.add(ph1);
            s1.add(ph2);
            
            u1.setPhones(s1);
            session.save(u1);
  /** User 2 */
            UserTable u2=new UserTable();
            u2.setUserid(102);
            u2.setFirstname("ravi");
            
            PhoneNumber ph3=new PhoneNumber();
            ph3.setNumbertype("college");
            ph3.setPhonenum(750056);
            
            PhoneNumber ph4=new PhoneNumber();
            ph4.setNumbertype("canteen");
            ph4.setPhonenum(856356);
            
            Set s2=new HashSet();
            s2.add(ph3);
            s2.add(ph4);
            
            u2.setPhones(s2);
            session.save(u2);
            
            tx.commit();
            session.close();
            
        } catch (Exception e) {
            e.printStackTrace();
             System.out.println(e.getClass());
        }
    }
    
}
