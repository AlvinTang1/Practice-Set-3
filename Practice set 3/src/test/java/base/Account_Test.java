package base;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Account_Test extends Account {

	
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test 
	public void testWithdraw() throws InsufficientFundsException{
	Account instance = new Account(1122,20000,4.5, getDateCreated());
	double bExpectedResult= 17500;
	double bActualResult= withdraw(instance.getBalance(),2500 );
	assertEquals("testWithdraw() failed",bExpectedResult,bActualResult);}
	
	@Test 
	public void testDeposit(){
	Account instance = new Account(1122,20000,4.5, getDateCreated());
	PrintStream bExpectedResult=
			System.out.printf("Your current balance is 23000");
			System.out.printf("Your monthly interest is .375");
			System.out.printf("The date created was 3/9/16");
	PrintStream bActualResult= 
			System.out.printf("Your current balance is %.5", deposit(instance.getBalance(),3000 )
					);
	System.out.printf("Your monthly interest is %.3",getMonthlyInterestRate(instance.getAnnualInterestRate()));
	System.out.printf("The date created was 3/9/16");
	assertEquals("testDeposit() failed",bExpectedResult,bActualResult);}
	
	@Test(expected=InsufficientFundsException.class)
	public final void testWithdraw1() throws InsufficientFundsException {
		Account c = new Account (1133,0,4.5,getDateCreated());
		Account.deposit(c.getBalance(),500.00);
		assertEquals("$400 Expected, actual is $500",(long)c.getBalance(),(long)500.00);
        Account.withdraw(c.getBalance(),900);
}}

	
