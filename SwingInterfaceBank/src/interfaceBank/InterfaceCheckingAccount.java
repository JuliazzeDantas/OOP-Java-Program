package interfaceBank;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Label;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceCheckingAccount extends JFrame {

	private JPanel contentPane;
	private JTextField txtAccountNumber;
	private JTextField txtBankCode;
	
	CheckingAccount account1 = new CheckingAccount(1000, "Small Bank", "0001", "1");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceCheckingAccount frame = new InterfaceCheckingAccount();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfaceCheckingAccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 813, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		/*
		 		JLabel lblBankName = new JLabel("S. Bank");
				JLabel lblAccountNumber = new JLabel("Account Number:");
				JLabel lblBankCode = new JLabel("Bank Code");
				JLabel lblCurrentCredit = new JLabel("Available Credit");
				JLabel lblAveilableCredit = new JLabel("U$ " + Float.toString(account1.getCreditLimit() - account1.getCredit()));
				JLabel lblBankNameAccount = new JLabel("S. Bank");
				JLabel lblAvaiableBalance = new JLabel("U$ " + account1.getBalance());
				JLabel lblBalance = new JLabel("Balance: ");
				
				JPanel panelPayment = new JPanel();
				JPanel panelAccount = new JPanel();
				JPanel panelLogIn = new JPanel();
		 */
				JLabel lblBankName = new JLabel("S. Bank");
				JLabel lblAccountNumber = new JLabel("Account Number:");
				JLabel lblBankCode = new JLabel("Bank Code");
				JLabel lblCurrentCredit = new JLabel("Available Credit");
				JLabel lblAveilableCredit = new JLabel("U$ " + Float.toString(account1.getCreditLimit() - account1.getCredit()));
				JLabel lblBankNameAccount = new JLabel("S. Bank");
				JLabel lblAvaiableBalance = new JLabel("U$ " + account1.getBalance());
				JLabel lblBalance = new JLabel("Balance: ");
				
				JPanel panelPayment = new JPanel();
				JPanel panelAccount = new JPanel();
				JPanel panelLogIn = new JPanel();
				
				panelPayment.setBounds(0, 0, 795, 353);
				contentPane.add(panelPayment);
				panelPayment.setLayout(null);
				JLabel lblBankNameAccount_1 = new JLabel("S. Bank");
				
				lblBankNameAccount_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblBankNameAccount_1.setFont(new Font("Times New Roman", Font.ITALIC, 30));
				lblBankNameAccount_1.setBounds(318, 33, 160, 40);
				panelPayment.add(lblBankNameAccount_1);
				
				JButton btnGoBack = new JButton("Go Back");
				btnGoBack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panelPayment.setVisible(false);
						panelAccount.setVisible(true);
					}
				});
				btnGoBack.setBounds(0, 0, 97, 25);
				panelPayment.add(btnGoBack);
				
				JButton btnDebit = new JButton("Debit");
				btnDebit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						float billValue = Float.parseFloat(JOptionPane.showInputDialog("What is the value of the bill?"));
						account1.payment(billValue, true);
						lblAvaiableBalance.setText("U$ " + account1.getBalance());
						panelPayment.setVisible(false);
						panelAccount.setVisible(true);
					}
				});
				btnDebit.setBounds(190, 184, 97, 25);
				panelPayment.add(btnDebit);
				
				JButton btnCredit = new JButton("Credit");
				btnCredit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						float billValue = Float.parseFloat(JOptionPane.showInputDialog("What is the value of the bill?"));
						account1.payment(billValue, false);
						lblAveilableCredit.setText("U$ " + (account1.getCreditLimit() - account1.getCredit()));
						panelPayment.setVisible(false);
						panelAccount.setVisible(true);
					}
				});
				btnCredit.setBounds(510, 184, 97, 25);
				panelPayment.add(btnCredit);
				panelPayment.setVisible(false);
				
				panelAccount.setBounds(0, 0, 795, 353);
				contentPane.add(panelAccount);
				panelAccount.setLayout(null);
				
				lblBalance.setFont(new Font("Arial", Font.PLAIN, 15));
				lblBalance.setBounds(32, 111, 110, 20);
				panelAccount.add(lblBalance);
				
				lblAvaiableBalance.setFont(new Font("Tahoma", Font.BOLD, 17));
				lblAvaiableBalance.setBounds(32, 144, 198, 27);
				panelAccount.add(lblAvaiableBalance);
				
				lblBankNameAccount.setHorizontalAlignment(SwingConstants.CENTER);
				lblBankNameAccount.setFont(new Font("Times New Roman", Font.ITALIC, 30));
				lblBankNameAccount.setBounds(318, 33, 160, 40);
				panelAccount.add(lblBankNameAccount);
				
				lblAveilableCredit.setFont(new Font("Tahoma", Font.BOLD, 17));
				lblAveilableCredit.setBounds(32, 245, 198, 27);
				panelAccount.add(lblAveilableCredit);
				
					lblCurrentCredit.setFont(new Font("Arial", Font.PLAIN, 15));
					lblCurrentCredit.setBounds(32, 212, 110, 20);
					panelAccount.add(lblCurrentCredit);
					
					JButton btnBankStatement = new JButton("Statement");
					btnBankStatement.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							JOptionPane.showMessageDialog(null, account1.getBankStatement());
						}
					});
					btnBankStatement.setBounds(487, 182, 120, 25);
					panelAccount.add(btnBankStatement);
					
					JButton btnCreditLimit = new JButton("Credit Limit");
					btnCreditLimit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							JOptionPane.showMessageDialog(null, "You have " + account1.getCreditLimit() + " dollars of credit limit!");
							JOptionPane.showMessageDialog(null, "You spent " + account1.getCredit() + " dollars form your limit!");
						}
					});
					btnCreditLimit.setBounds(487, 111, 120, 25);
					panelAccount.add(btnCreditLimit);
					
					JButton btnDeposit = new JButton("Deposit");
					btnDeposit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							float deposit = Float.parseFloat(JOptionPane.showInputDialog("What is the deposit amount?"));
							System.out.println("Deposit: " + deposit);
							account1.deposit(deposit);
							lblAvaiableBalance.setText("U$ " + account1.getBalance());
						}
					});
					btnDeposit.setBounds(286, 182, 120, 25);
					panelAccount.add(btnDeposit);
					
					JButton btnPayment = new JButton("Payment");
					btnPayment.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							panelAccount.setVisible(false);
							panelPayment.setVisible(true);
						}
					});
					btnPayment.setBounds(286, 111, 120, 25);
					panelAccount.add(btnPayment);
					
					JButton btnGoBackToLogIn = new JButton("Sign Out");
					btnGoBackToLogIn.setBounds(0, 0, 97, 25);
					panelAccount.add(btnGoBackToLogIn);
					
					JButton btnWithdraw = new JButton("To Pay Invoice");
					btnWithdraw.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if((account1.getBalance() - account1.getCredit()) >= 0){
								JOptionPane.showMessageDialog(null, "You payed yor Invoice!");
								lblAveilableCredit.setText("U$ " + account1.getCreditLimit());
								account1.payYourInvoice();
							}else {
								JOptionPane.showMessageDialog(null, "ERROR! Insufficient funds!");
							}
						}
					});
					btnWithdraw.setBounds(487, 263, 120, 25);
					panelAccount.add(btnWithdraw);
					
					JButton btnPayInvoice = new JButton("Withdraw");
					btnPayInvoice.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							float value = Float.parseFloat(JOptionPane.showInputDialog("How many dollars do you want to withdraw?"));
							account1.whithdraw(value);
							lblAvaiableBalance.setText("U$ " + account1.getBalance());
						}
					});
					btnPayInvoice.setBounds(286, 263, 120, 25);
					panelAccount.add(btnPayInvoice);
					panelAccount.setVisible(false);
				
						panelLogIn.setBounds(0, 0, 795, 353);
						contentPane.add(panelLogIn);
						panelLogIn.setLayout(null);
						//panelLogIn.setVisible(true);
						
						lblBankCode.setFont(new Font("Arial", Font.PLAIN, 20));
						lblBankCode.setBounds(222, 116, 160, 35);
						panelLogIn.add(lblBankCode);
						
						lblAccountNumber.setFont(new Font("Arial", Font.PLAIN, 20));
						lblAccountNumber.setBounds(222, 182, 160, 35);
						panelLogIn.add(lblAccountNumber);
						
						txtBankCode = new JTextField();
						txtBankCode.setFont(new Font("Arial", Font.PLAIN, 18));
						txtBankCode.setBounds(414, 116, 160, 35);
						panelLogIn.add(txtBankCode);
						txtBankCode.setColumns(10);
						
						txtAccountNumber = new JTextField();
						txtAccountNumber.setFont(new Font("Arial", Font.PLAIN, 18));
						txtAccountNumber.setBounds(414, 182, 160, 35);
						panelLogIn.add(txtAccountNumber);
						txtAccountNumber.setColumns(10);
						
						lblBankName.setHorizontalAlignment(SwingConstants.CENTER);
						lblBankName.setFont(new Font("Times New Roman", Font.ITALIC, 30));
						lblBankName.setBounds(318, 33, 160, 40);
						panelLogIn.add(lblBankName);
						
						JButton btnNewButton = new JButton("Sign In");
						btnNewButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if(txtBankCode.getText().equals(account1.getbankCode()) && txtAccountNumber.getText().equals(account1.getAccount())) {
									panelLogIn.setVisible(false);
									panelAccount.setVisible(true);
								}
								else {
									JOptionPane.showMessageDialog(null, "Your Bank Code or your Account Number doesn't exist!");
								}
									
							}
						});
						btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
						btnNewButton.setBounds(348, 299, 100, 30);
						panelLogIn.add(btnNewButton);
		
	}
}