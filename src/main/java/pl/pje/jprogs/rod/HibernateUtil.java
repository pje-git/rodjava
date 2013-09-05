/*
 * =======================================================
 *        Wszystko mozna zmieniac i dystrybuowac.
 *       Licencja typu MKTK - moj kod, to Twoj kod 
 *   Dla przyzwoitosci mozesz zostawic namiary na mnie:
 * Pawel Jacon - pawel@pje.pl - www.pje.pl - +48 695758801 
 * =======================================================
 */
package pl.pje.jprogs.rod;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Pawel Jacon <pawel at pje.pl>
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
//            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
