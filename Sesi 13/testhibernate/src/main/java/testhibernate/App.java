package testhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();	
		Transaction tx = session.beginTransaction();

		AddressBook emp = new AddressBook();

		emp.setId(1);
		emp.setName("Arif");
		emp.setAddress("Depok");

		session.save(emp);

		tx.commit();
	}

}
