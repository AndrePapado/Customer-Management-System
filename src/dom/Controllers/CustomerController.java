package dom.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dom.entity.Customer;
import dom.services.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// service 
	@Autowired
	private CustomerService customerService;
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		List<Customer> NewCust = customerService.getCustomers();
		theModel.addAttribute("customers",NewCust);
		
		return "list-customers";
	}

	@GetMapping("/showform")
	public String showform(Model theModel) {
		
		Customer nCustomer =new Customer();
		theModel.addAttribute("customer", nCustomer);
		
		return "customer-form";
	
}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer nCustomer) {
		
		customerService.saveCustomer(nCustomer);
	return "redirect:/customer/list";
}
	@GetMapping("/showUpdateform")
public String updateCustomer(@RequestParam("customerID") int cid, Model theModel) {
		Customer nCustomer = customerService.getCustomer(cid);
		theModel.addAttribute("customer", nCustomer);
		
	return "customer-form";
}
	@GetMapping("/delete")
	public String DeleteCustomer(@RequestParam("customerID") int cid) {
		customerService.deleteCustomer(cid);
		return "redirect:/customer/list";
	}
	
}
