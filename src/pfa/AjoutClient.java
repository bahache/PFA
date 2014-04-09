

package pfa;


import org.hibernate.Session;

public class AjoutClient {
    public void addClient()
    {
        Client c=new Client("1","1","1","1","1","1","1");
        Session session= HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(c);
        session.getTransaction().commit();
        session.close();
    }
     
    
}
