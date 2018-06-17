package py.com.gestion.bibliografia.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class DBTransactions<T> {

    static Session session;
    static SessionFactory sessionFactory;

    private static SessionFactory buildSessionFactory() {
        // Creating Configuration Instance & Passing Hibernate Configuration File
        Configuration configObj = new Configuration();
        configObj.configure("hibernate.cfg.xml");

        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build();
        // Creating Hibernate SessionFactory Instance
        sessionFactory = configObj.buildSessionFactory(serviceRegistryObj);

        return sessionFactory;
    }

    public void insert(T object) {
        try {
            session = buildSessionFactory().openSession();
            session.beginTransaction();
            session.save(object);
        } catch (Exception e) {
            e.printStackTrace();
            if (null != session.getTransaction()) {
                System.out.println("\n.......Se ha realizado un RollBack de la Transaccion.......");
                session.getTransaction().rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public void update(T object) {
        try {
            session = buildSessionFactory().openSession();
            session.beginTransaction();
            session.update(object);
        } catch (Exception e) {
            e.printStackTrace();
            if (null != session.getTransaction()) {
                System.out.println("\n.......Se ha realizado un RollBack de la Transaccion.......");
                session.getTransaction().rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public void delete(T object) {
        try {
            session = buildSessionFactory().openSession();
            session.beginTransaction();
            session.delete(object);
        } catch (Exception e) {
            e.printStackTrace();
            if (null != session.getTransaction()) {
                System.out.println("\n.......Se ha realizado un RollBack de la Transaccion.......");
                session.getTransaction().rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public void select(T object) {
        try {
            session = buildSessionFactory().openSession();
            session.beginTransaction();
//            session.load(object,);
        } catch (Exception e) {
            e.printStackTrace();
            if (null != session.getTransaction()) {
                System.out.println("\n.......Se ha realizado un RollBack de la Transaccion.......");
                session.getTransaction().rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
