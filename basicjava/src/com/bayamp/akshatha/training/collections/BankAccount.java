package com.bayamp.akshatha.training.collections;

public class BankAccount {
	
 private String accno;
 private String customerName;
 private int balance;
 
public String getAccno() {
	return accno;
}
public void setAccno(String accno) {
	this.accno = accno;
}

public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public int getBalance() {
	return balance;
}

@Override
public String toString() {
	return "Bank Account: [Account Number=" + accno + ", CustomerName=" + customerName + ", Balance=" + balance + "]";
}

public void setBalance(int balance) {
	this.balance = balance;
}
public BankAccount(String accno, String name, int balance) {
	super();
	this.accno = accno;
	this.customerName = name;
	this.balance = balance;
}
 
}
