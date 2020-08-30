package dom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dom.dao.CustomerDAO;
import dom.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
    public void saveCustomer(Customer nCustomer) {
		customerDAO.saveCustomer(nCustomer);
		
	}

	@Override
	@Transactional
	public Customer getCustomer(int cid) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomer(cid);
	}

	@Override
	@Transactional
	public void deleteCustomer(int cid) {
		
		customerDAO.deleteCustomer(cid);
		
	}

}
