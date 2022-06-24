package com.project.sbi.entity;

public class Sbi implements java.io.Serializable{
	private int Id;
	private String ManagerName;
	private String Place;
	private Long PhoneNumber;
	private boolean AreTheyProvideHousingLoan;
	public Sbi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sbi(int id, String managerName, String place, Long phoneNumber, boolean areTheyProvideHousingLoan) {
		super();
		Id = id;
		ManagerName = managerName;
		Place = place;
		PhoneNumber = phoneNumber;
		AreTheyProvideHousingLoan = areTheyProvideHousingLoan;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getManagerName() {
		return ManagerName;
	}
	public void setManagerName(String managerName) {
		ManagerName = managerName;
	}
	public String getPlace() {
		return Place;
	}
	public void setPlace(String place) {
		Place = place;
	}
	public Long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public boolean isAreTheyProvideHousingLoan() {
		return AreTheyProvideHousingLoan;
	}
	public void setAreTheyProvideHousingLoan(boolean areTheyProvideHousingLoan) {
		AreTheyProvideHousingLoan = areTheyProvideHousingLoan;
	}
	@Override
	public String toString() {
		return "Sbi [Id=" + Id + ", ManagerName=" + ManagerName + ", Place=" + Place + ", PhoneNumber=" + PhoneNumber
				+ ", AreTheyProvideHousingLoan=" + AreTheyProvideHousingLoan + "]";
	}
	

}
