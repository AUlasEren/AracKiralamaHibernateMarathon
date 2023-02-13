package com.ulas.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
    private static final SessionFactory SESSION_FACTORY;
    static {
        try{
            // CreateSessionFactory default olarak resources altında hibernate.cfg.xml i ara
            // ancak siz bir adreste Url ya da farklı bir isimle farklı bir klasörde dosyayı saklıyorsanız bunu ayrıca belirtmelisiniz.
            SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
        }catch (Exception exception){
            System.out.println("Hibernate işlem hatası...: "+ exception.toString());
            throw new ExceptionInInitializerError(exception);
        }

    }
    public static SessionFactory getSessionFactory(){
        return SESSION_FACTORY;
    }

}
