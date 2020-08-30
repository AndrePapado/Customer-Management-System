package dom.dao;

import java.util.List;

import dom.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer nCustomer);

	public Customer getCustomer(int cid);

	public void deleteCustomer(int cid);
	
	

}
