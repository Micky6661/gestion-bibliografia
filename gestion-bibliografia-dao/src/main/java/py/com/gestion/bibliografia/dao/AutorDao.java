package py.com.gestion.bibliografia.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import py.com.gestion.bibliografia.model.Autor;

public class AutorDao {

    static Session session;
    static SessionFactory sessionFactory;

    public Autor select(Autor autor) {
        Autor response = null;


        return response;
    }

    public void insert(Autor autor) {
        try {
            session = buildSessionFactory().openSession();
            session.beginTransaction();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            
        }
    }

    public void update(){

    }

    public void delete(){

    }

    private static SessionFactory buildSessionFactory() {
        // Creating Configuration Instance & Passing Hibernate Configuration File
        Configuration configObj = new Configuration();
        configObj.configure("hibernate.cfg.xml");

        // Since Hibernate Version 4.x, ServiceRegistry Is Being Used
        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build();
        // Creating Hibernate SessionFactory Instance
        sessionFactory = configObj.buildSessionFactory(serviceRegistryObj);

        return sessionFactory;
    }
}