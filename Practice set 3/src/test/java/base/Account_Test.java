package base;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Account_Test extends Account {

	public Account_Test(double annualInterestRate, Date dateCreated, double balance, int id) {
		super(annualInterestRate, dateCreated, balance, id);

	}

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
	public void testWithdraw(){
	Account instance = new Account(1122,20000,4.5, getDateCreated());
	double bExpectedResult= 17500;
	double bAcutualResult= withdraw(instance.getBalance(),2500 );}
	
	@Test 
	public void testDeposit(){
	Account instance = new Account(1122,20000,4.5, getDateCreated());
	double bExpectedResult= 23000;
	double bAcutualResult= deposit(instance.getBalance(),3000 );}
	}
	
