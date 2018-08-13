package con.anil.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.hql.internal.ast.tree.SelectExpression;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        
        AddMe obj = new AddMe();
        obj.setId(3);
        obj.setName("lalit");
        obj.setRoll_no(63);
        
        
        Configuration conf = new Configuration().configure().addAnnotatedClass(AddMe.class);
        
        ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
        SessionFactory sf  = conf.buildSessionFactory(sr);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(obj);
        tx.commit();
        //System.out.println( "Hello World2" );
    }
}
