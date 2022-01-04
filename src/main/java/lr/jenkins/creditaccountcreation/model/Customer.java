package lr.jenkins.creditaccountcreation.model;

import java.util.Date;
import java.math.BigDecimal;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Customer implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long accountNumber;
	private String username;
	private String password;
	private Date birthdate;
	private int ssn;
	private BigDecimal balance;
	private BigDecimal remainingCredit;

	public Customer() {}

	public Customer(String username, String password, long accountNumber, Date birthdate, int ssn, BigDecimal balance, BigDecimal remainingCredit) {
		this.username = username;
		this.password = password;
		this.accountNumber = accountNumber;
		this.birthdate = birthdate;
		this.ssn = ssn;
		this.balance = balance;
		this.remainingCredit = remainingCredit;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public int getSSN() {
		return ssn;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public BigDecimal getRemainingCredit() {
		return remainingCredit;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				", accountNumber=" + accountNumber +
				", birthdate=" + birthdate.toString() +
				", ssn=" + ssn +
				", balance=" + balance +
				", remainingCredit=" + remainingCredit +
				'}';
	}
}