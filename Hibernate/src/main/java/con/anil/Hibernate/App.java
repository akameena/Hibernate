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
        Name name  = new Name();
        name.setFname("harish");
        name.setLname("kaa");
        name.setMname("mea");
        
        AddMe addme = new AddMe();
        addme.setId(3);
        addme.setName(name);
        addme.setRoll_no(63);
        
        Laptop lp = new Laptop();
        lp.setId(101);
        lp.setPname("Dell");
        
        
        
        Student stu = new Student();
        stu.setName("ak");
        stu.setRoll_no(59);
        stu.getLaptop().add(lp);
        lp.getStudent().add(stu);
        
        
        //Configuration conf = new Configuration().configure().addAnnotatedClass(AddMe.class);
        Configuration conf = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
        SessionFactory sf  = conf.buildSessionFactory(sr);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(lp);
        session.save(stu);
        //session.get(AddMe.class, 1); // use for fetch data from database
        tx.commit();
        //System.out.println( "Hello World2" );
    }
}
