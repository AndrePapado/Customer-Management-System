package dom.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="First_name")
	private String Fname;
	@Column(name="Last_name")
	private String Lname;
	@Column(name="email")
	private String email;
	@Column(name="address")
	private String address;

	//default constructor
	public Customer() {
		
	}
//getters and setters
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return Fname;
	}


	public void setFname(String fname) {
		Fname = fname;
	}


	public String getLname() {
		return Lname;
	}


	public void setLname(String lname) {
		Lname = lname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

//toString
	@Override
	public String toString() {
		return "Customer [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + ", email=" + email + ", address="
				+ address + "]";
	}

	
	
	
}
