package Enteties;

import java.util.Date;

public class Customer {
	private int id;
	private String firsName;
	private String lastName;
	private Date DateofBirh;
	private String TcNo;
	
	public Customer(int id, String firsName, String lastName, Date dateofBirh, String tcNo) {
		super();
		this.id = id;
		this.firsName = firsName;
		this.lastName = lastName;
		DateofBirh = dateofBirh;
		TcNo = tcNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateofBirh() {
		return DateofBirh;
	}
	public void setDateofBirh(Date dateofBirh) {
		DateofBirh = dateofBirh;
	}
	public String getTcNo() {
		return TcNo;
	}
	public void setTcNo(String tcNo) {
		TcNo = tcNo;
	}
	
	

	

}
