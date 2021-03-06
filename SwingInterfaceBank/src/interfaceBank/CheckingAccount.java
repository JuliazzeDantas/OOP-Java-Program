package interfaceBank;

import javax.swing.JOptionPane;

public class CheckingAccount {
	
	private String bankName;
	private String bankCode; // I used String instead of int because "0001" != 0001 and 0001 == 1
	private String account; // I used String instead of int because "051484-8" != 0514848
	
	private float creditLimit;
	private float credit;
	private float balance;
	private String bankStatement;
	
	public CheckingAccount(float creditLimit, String bankName, String bankCode, String account) {
		this.balance = 0.0f;
		this.credit = 0.0f;
		this.creditLimit = creditLimit;
		this.bankStatement = "";
		this.bankName = bankName;
		this.bankCode = bankCode;
		this.account = account;
	}
	
	// BANK STATEMENT
	public String getBankStatement() {
		return bankStatement;
	}

	public void setBankStatement(String bankStatement) {
		this.bankStatement +=  bankStatement + "\n";
	}
	
	// DEBIT
	private void useDebit(float value) {
		if(0 <= (balance - value)) {
			setBalance(-value);
			setBankStatement("U$ -" + value);
		}
		else
			erroMessageInsufficientFunds();
	}

	private void erroMessageInsufficientFunds() {
		System.out.println("ERROR! Insufficient funds!");
		JOptionPane.showMessageDialog(null, "ERROR! Insufficient funds!");
	}
	
	public float getBalance() {
		return balance;
	}

	private void setBalance(float balance) {
		this.balance += balance;
	}
	
	// CREDIT
	private void useCredit(float value) {
		if((getCreditLimit() - (getCredit() + value)) >= 0) {
			setCredit(value);
			setBankStatement("U$ -" + value);
		}
		else
			erroMessageLimitexceeded();
	}
	
	private void erroMessageLimitexceeded() {
		System.out.println("ERROR! Credit limit was exceeded!");
		JOptionPane.showMessageDialog(null, "ERROR! Credit limit was exceeded!");
	}

	public float getCredit() {
		return credit;
	}

	private void setCredit(float credit) {
		this.credit += credit;
	}
	
	// CREDIT LIMIT
	public float getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(float creditLimit) {
		this.creditLimit += creditLimit;
		setCredit(getCredit() + creditLimit);
	}
	
	// USE YOUR MANEY
	public void payYourInvoice() {
		setBankStatement("U$ -" + getCredit());
		setBalance(-getCredit());
		credit = 0.0f;
	}
	
	public void payment(float value, boolean mode) {
		if(mode == true) //true == debit
			useDebit(value);
		else { //false == credit
			useCredit(value);
		}
	}
	
	public void whithdraw(float value) {
		setBankStatement("U$ -" + value);
		useDebit(value);
	}
	
	// DEPOSIT
	public void deposit(float value) {
		setBalance(value);
		setBankStatement("U$ +" + value);
	}
	
	
	// ACCOUNT DATA
	public String getBankName() {
		return bankName;
	}

	public String getbankCode() {
		return bankCode;
	}

	public String getAccount() {
		return account;
	}
}
