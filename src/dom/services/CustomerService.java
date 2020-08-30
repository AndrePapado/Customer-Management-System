package dom.services;

import java.util.List;

import dom.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer nCustomer);

	public Customer getCustomer(int cid);

	public void deleteCustomer(int cid);

}
