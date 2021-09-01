# OOP Concepts in Java
This repository has some java programs. They were taken at my graduation and during the Course Video Course (https://www.cursoemvideo.com/course/java-poo/aulas/java-poo/modulos/exemplo-pratico-em-java/). Each package represents an exercise requested by the teacher. Below I will explain the programs present in each one of them.
 
## First Program (Project: FirstProgram)
### Class - Pen
This class models a basic pen. The object has some attributes:
* model (String)
* color (String)
* tip thickness (float)
* percent of the amount of ink (float)
* if it is capped (boolean)

The program has Getters and Setters, the method toWrite() (it shows if you can write or not) and toString() (return a text that shows all attributes).

### Class - PenManager
It contains only the main method. He instantiates two different pens and uses their methods.

## Interface Bank (Project: SwingInterfaceBank)
### Class - CheckingAccount
It models a checking account. The class has attributes to identify the bank account: 
* Bank code (String)
* Account number (String)
* Bank name (String)

The program has methods for the user to pay (debit or credit) or to deposit money. He also can see his credit limit and the bank statement.

### Class - CheckingAccountInterface
In this program, I used the swing library of Java JOptionPane class. I made a login window, how I am not using a database, it exists one "registered" account. 

<p align="center"><div style="text-align:center"><img src="https://github.com/JuliazzeDantas/OOP-Java-Program/blob/master/IMAGES/SwingBankProgram/LogIn.JPG" /></div><p align="center">
<p align="center">Login window<p align="center">

<p align="center"><div style="text-align:center"><img src="https://github.com/JuliazzeDantas/OOP-Java-Program/blob/master/IMAGES/SwingBankProgram/LogInError.JPG" /></div><p align="center">
<p align="center">Error typing wrong bank code or number account<p align="center">

When the user logs in, he is taken to the main window. There, he can pay something, see his credit limit or bank statement, and deposit or withdraw some money. It also shows the current balance and available credit. To choose an option, he must click on some of the buttons.

<p align="center"><div style="text-align:center"><img src="https://github.com/JuliazzeDantas/OOP-Java-Program/blob/master/IMAGES/SwingBankProgram/Account.JPG" /></div><p align="center">
<p align="center">Main window<p align="center">
 
 
 Each button makes a different action:
 * Pay Invoice: When the user clicks on this button, a window appears with the message on it: "You paid your invoice". Then her credit limit is reset to the initial value.
 
 <p align="center"><div style="text-align:center"><img src="https://github.com/JuliazzeDantas/OOP-Java-Program/blob/master/IMAGES/SwingBankProgram/PayingInvoice.JPG" /></div><p align="center">
<p align="center">Paying Invoice<p align="center">
 
 * Withdraw: This button opens a window that asks you to enter the desired value. If the number is equal to or less than the balance, the user can get the money. When he doesn't have sufficient money in the account, appears an error message.This button opens a window that asks you to enter the desired value. If the number is equal to or less than the balance, the user can get the money.
 
  <p align="center"><div style="text-align:center"><img src="https://github.com/JuliazzeDantas/OOP-Java-Program/blob/master/IMAGES/SwingBankProgram/Withdraw.JPG" /></div><p align="center">
<p align="center">Withdraw some money<p align="center">
 
  <p align="center"><div style="text-align:center"><img src="https://github.com/JuliazzeDantas/OOP-Java-Program/blob/master/IMAGES/SwingBankProgram/Withdraw_ERROR.JPG" /></div><p align="center">
<p align="center">Insufficient funds to withdraw<p align="center">
 
 * Credit Limit: The user can see her credit limit and how much money from the credit he spent.
 
  <p align="center"><div style="text-align:center"><img src="https://github.com/JuliazzeDantas/OOP-Java-Program/blob/master/IMAGES/SwingBankProgram/CreditLimit.JPG" /></div><p align="center">
<p align="center">Credit Limit<p align="center">

 <p align="center"><div style="text-align:center"><img src="https://github.com/JuliazzeDantas/OOP-Java-Program/blob/master/IMAGES/SwingBankProgram/CreditSpent.JPG" /></div><p align="center">
<p align="center">Credit Spent<p align="center">
 
 * Deposit: When people want to put money in a bank account, they must click on this button.

 <p align="center"><div style="text-align:center"><img src="https://github.com/JuliazzeDantas/OOP-Java-Program/blob/master/IMAGES/SwingBankProgram/Deposit.JPG" /></div><p align="center">
<p align="center">Depositing 100 dollars<p align="center">
 
 * Payment: The payment button takes you to another window. There, you can choose between credit and debit. You can effectuate the payment if you have enough money or credit. 

 <p align="center"><div style="text-align:center"><img src="https://github.com/JuliazzeDantas/OOP-Java-Program/blob/master/IMAGES/SwingBankProgram/Payment.JPG" /></div><p align="center">
<p align="center">Payment Window<p align="center">
 
  <p align="center"><div style="text-align:center"><img src="https://github.com/JuliazzeDantas/OOP-Java-Program/blob/master/IMAGES/SwingBankProgram/PaymentValue.JPG" /></div><p align="center">
<p align="center">Entering the amount to pay<p align="center">
 
  <p align="center"><div style="text-align:center"><img src="https://github.com/JuliazzeDantas/OOP-Java-Program/blob/master/IMAGES/SwingBankProgram/PaymentValueError.JPG" /></div><p align="center">
<p align="center">Insufficient funds to pay itn<p align="center">
 
 * Statement: The user can view the bank statement by clicking on this button. You will be able to see any payment, deposit, or withdrawal made to this account.
 
  <p align="center"><div style="text-align:center"><img src="https://github.com/JuliazzeDantas/OOP-Java-Program/blob/master/IMAGES/SwingBankProgram/Statement.JPG" /></div><p align="center">
<p align="center">Showing the bank statement<p align="center">
 
 * To Pay Invoice: When the user clicks on this button, he takes the money out of his account to pay his invoice. Having done this, it returns to up to the maximum amount of credit allowed.

 <p align="center"><div style="text-align:center"><img src="https://github.com/JuliazzeDantas/OOP-Java-Program/blob/master/IMAGES/SwingBankProgram/PayingInvoice.JPG" /></div><p align="center">
<p align="center">Invoice paid<p align="center">

## Emoji Fight (Project: Compound_Objects)
### Class - Fighter
This class models fighters. It has their physical attributes and the number to calculate their score. The attribute "path" is the path that there is the fighter's image. The attributes:
* name (String)
*	weight (float)
*	height (float)  
*	champion_Belt (boolean)
*	fight_Numbers (short)
*	loosing_Number (short)
*	victory_Numbers (short)
*	draw_Numbers (short)
*	path (String)
 
The program has Getters and Setters, the method makeWeightClass() (it calculates fighter's Weight Classes) and toString() (return the name, total fights, total winnings, total loosings, total drawings and show if the fighter is the champion).
 
 ### Class - Match
 It saves the fighters who will fight each other in this round. The only attributes are the index of the fighters:
 * f1 (int)
 * f2 (int)
 
 These numbers will be used at the interface. The program only has Getters and Setters.
 
 ### Class - Octagon
 This class has an array of Match:
 * match (Match[])
 
 The program has methods of comparing the weight category of fighters, creating random matches, making matches, showing who wins, showing when it's a draw, and showing the new champion.
 
 ### Class - Interface
  In this program, I used the swing library of Java JOptionPane class. It has two methods to generate random integers and floats. It generates 2000 random fights when the user clicks the “Fight!” button. The "Score" button shows a window with each fighter's score.
 
 <p align="center"><div style="text-align:center"><img src="https://github.com/JuliazzeDantas/OOP-Java-Program/blob/master/IMAGES/Compound_Objects/Window_Initial.JPG" /></div><p align="center">
<p align="center">Program before to click on the button "Fight!".="center">
 
  <p align="center"><div style="text-align:center"><img src="https://github.com/JuliazzeDantas/OOP-Java-Program/blob/master/IMAGES/Compound_Objects/Fight_I.JPG" /></div><p align="center">
<p align="center">Showing one of the fights.="center">
 
 <p align="center"><div style="text-align:center"><img src="https://github.com/JuliazzeDantas/OOP-Java-Program/blob/master/IMAGES/Compound_Objects/Fight_II.JPG" /></div><p align="center">
<p align="center">Showing other fight.="center">
 
 <p align="center"><div style="text-align:center"><img src="https://github.com/JuliazzeDantas/OOP-Java-Program/blob/master/IMAGES/Compound_Objects/Initial_Score.JPG" /></div><p align="center">
<p align="center">Score before the fights.="center">
 
 <p align="center"><div style="text-align:center"><img src="https://github.com/JuliazzeDantas/OOP-Java-Program/blob/master/IMAGES/Compound_Objects/Score.JPG" /></div><p align="center">
<p align="center">Score after a few fights.="center">
 
 <p align="center"><div style="text-align:center"><img src="https://github.com/JuliazzeDantas/OOP-Java-Program/blob/master/IMAGES/Compound_Objects/Window_Initial.JPG" /></div><p align="center">
<p align="center">Program before to click on the button "Fight!".="center">
 
 ## School (Project: Inheritance)
 In this project, I exercised my concepts about inheritance, abstract classes, and final methods. I won't show you the details of the classes, because they are very simple.
 
 ### Class - Person
 Person is the abstract class. It can't be instantiated and has de final method happyBirthday().
 
 ### Class - Visitor 
 Visitor extends Person. This class doesn't have any particular method.
 
 ### Classes - Student, Teacher & Functionary
 These classes extend Person. Each other has particular methods and attributes.
 
 ### Class - ScholarShipStudent
 This class extends Student. It is a student that has a scholarship.
 
 ### Class - Manager
 It has the main method. It instantiates some classes and prints their toString() methods.
 
 ## Animals (Project: Polymorphism)
 In the project below, I reinforced the concept of Polymorphism. I used the two types: Overriding and Overloading.
 
 ### Class - Animal
 It is an abstract class. It implements some basics methods like toMove(), toEat(), and others.
 
 ### Classes - Mammal, Reptile, Fish
 These classes extend Animal and represent a specific group of animals. They overwrite some methods and add new attributes.
 
 ### Class - Wolf
 It extends Animal and overwrites some methods.
 
 ### Class - Dog
 In the other classes, I used the overriding. In this, I'll practice the overloading too.
 
