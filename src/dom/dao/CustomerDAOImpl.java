package dom.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dom.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	//inject session factory
	@Autowired
	private SessionFactory sessionFactory;
 
	@Override
	public List<Customer> getCustomers() {
		
		
		Session currentSession=sessionFactory.getCurrentSession();
	
		Query<Customer> newQuery = currentSession.createQuery("from Customer",Customer.class);
		
		List<Customer> customers =newQuery.getResultList();
		return customers;
	}

	@Override
	public void saveCustomer(Customer nCustomer) {
		Session currentSession =sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(nCustomer);
		
	}

	@Override
		public Customer getCustomer(int cid) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Customer nCustomer= currentSession.get(Customer.class,cid);
		return nCustomer;
	}

	@Override
	public void deleteCustomer(int cid) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from Customer where id=:customerID");
		theQuery.setParameter("customerID", cid);
		theQuery.executeUpdate();
	}

}
