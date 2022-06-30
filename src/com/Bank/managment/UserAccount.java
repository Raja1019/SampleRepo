package com.Bank.managment;

public class UserAccount {
	
	
	private long userId;
	private long accountId;
	private String userName;
	private double userBalance;
    private String userAddress;
    private long contactNumber;
    private String password;
	
    public UserAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public UserAccount(long userId, long accountId, String userName, double userBalance, String userAddress,
			long contactNumber,String password) {
		super();
		this.userId = userId;
		this.accountId = accountId;
		this.userName = userName;
		this.userBalance = userBalance;
		this.userAddress = userAddress;
		this.contactNumber = contactNumber;
		this.password=password;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getUserBalance() {
		return userBalance;
	}
	public void setUserBalance(double userBalance) {
		this.userBalance = userBalance;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "UserAccount [userId=" + userId + ", accountId=" + accountId + ", userName=" + userName
				+ ", userBalance=" + userBalance + ", userAddress=" + userAddress + ", contactNumber=" + contactNumber
				+ ", password=" + password + "]";
	}
	
     
}
