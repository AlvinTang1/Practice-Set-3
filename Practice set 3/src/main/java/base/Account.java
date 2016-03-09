package base;

import java.util.Date;

public class Account {
 private int id;
 private double balance;
 private double annualInterestRate;
 private Date dateCreated;
 private double MonthlyInterestRate;
 
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public double getAnnualInterestRate() {
	return annualInterestRate;
}

public void setAnnualInterestRate(double annualInterestRate) {
	this.annualInterestRate = annualInterestRate;
}

public Date getDateCreated() {
	return dateCreated;
}

public void setDateCreated(Date dateCreated) {
	this.dateCreated = dateCreated;
}
public Account(double annualInterestRate, Date dateCreated, double balance, int id){
	id=this.id;
	balance=this.balance;
	annualInterestRate=this.annualInterestRate;
	dateCreated=this.dateCreated;
};
	
public Account(int id, double balance, double annualInterestRate, Date dateCrated){
	id=0;
	balance=0;
	annualInterestRate=0;
	dateCreated= new Date();}
public static double getMonthlyInterestRate(double annualInterestRate){
	return annualInterestRate/12;
	}
public static double withdraw(double balance, double withdraw){
	return balance - withdraw;}
public static double deposit(double balance, double deposit){
		return balance + deposit;
	}
}

