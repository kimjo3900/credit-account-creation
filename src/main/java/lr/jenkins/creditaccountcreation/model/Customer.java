package lr.jenkins.creditaccountcreation.model;

import javax.persistence.*;
import java.io.Serializable;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Customer implements Serializable {
	@Id
	@GeneratedValue(generator = MyGenerator.generatorName)
    @GenericGenerator(name = MyGenerator.generatorName, strategy = "lr.jenkins.creditaccountcreation.model.MyGenerator")
	@Column(nullable = false, updatable = false)
	private Long id;
	private String fname;
	private String lname;
	private String ssn;
	private String bday;
	private String address;
	private String city;
	private String state;
	private String zip;
	private Double balance;
	private Double remainingCredit;
	private String username;
	@Column(nullable = false, updatable = false)
	private String customerCode;

	public Customer() {}

	public Customer(String fname, String lname, String ssn, String bday, String address, String city, String state, String zip, Double balance, Double remainingCredit, String username, String customerCode) {
		this.fname = fname;
		this.lname = lname;
		this.ssn = ssn;
		this.bday = bday;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.balance = balance;
		this.remainingCredit = remainingCredit;
		this.username = username;
		this.customerCode = customerCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getBday() {
		return bday;
	}

	public void setBday(String bday) {
		this.bday = bday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getRemainingCredit() {
		return remainingCredit;
	}

	public void setRemainingCredit(Double remainingCredit) {
		this.remainingCredit = remainingCredit;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"First Name='" + fname + '\'' +
				", Last Name='" + lname + '\'' +
				", accountNumber=" + id +
				", ssn=" + ssn + '\'' +
				", bday=" + bday + '\'' +
				", address=" + address + '\'' +
				", city=" + city + '\'' +
				", state=" + state + '\'' +
				", zip=" + zip + '\'' +
				", balance=" + balance +
				", remainingCredit=" + remainingCredit +
				", username=" + username + '\'' +
				'}';
	}
}