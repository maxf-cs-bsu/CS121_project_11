# Bank on it - Part 2
### UML provided on lab assignment page.
# Admin
### String menu()
```
System.out.println("0) Exit")
System.out.println("1) Full Customer Report")
System.out.println("2) Add User")
System.out.println("3) Apply interest to accounts")
System.out.print("Action: ")

return user's input as response
```
### getReport()
```
Using the getReport() function inside of customer.java, for each customer in the databash, call onto getReport()
```
### 
# CheckingAccount()
### String menu()
```
System.out.println("quit")
System.out.println("check balance")
System.out.println("make a deposit")
System.out.println("make a withdrawal")

return user's input
```
### start()
```
keepGoing = true
while(keepGoing)
  response = menu
  if response is 0
    keepGoing = false
  else if response is 1
    check balance
  else if response is 2
    make a deposit
  else if response is 3
    make a withdrawal
  else
    wrong input, enter 0, 1, 2, or 3
```
### makeDeposit()
```
prompt user to make a deposit of an amount
balance += deposit
```
### makeWithDrawal()
```
prompt user to withdrawal a set amount of money
if withdrawl > balance
  system.out.println("Insufficent funds")
else
  balance -= withdrawal
```
# SavingsAccount()
### calcInterest()
```
interestAmount = balance * interestRate
balance += interest amount;
```
# User (abstract)
### setPIN()
```
if entered PIN = 4 digits
  accept PIN
else
  system.out.println("ERROR: setting pin to 1234")
```
### login()
```
boolean result = false;
prompt the user to enter a username
if username is valid
  prompt user to enter a PIN
  if PIN is valid
    result = true
  else
    system.out.println("invalid pin")
else
  system.out.println("invalid username")
return result
```
# Customer()
### Customer()
```
default username = Alex
default PIN = 1234
```
### changePIN()
```
prompt user to enter a new PIN
setPIN(newPIN)
system.out.println("New PIN is: " + PIN)
```
### start()
```
keepGoing = true
while(keepGoing)
  result = menu()
  if result = 0
    keepGoing = false
  else if result = 1
    checking.start
  else if result = 2
    savings.start
  else if result = 3
    changePIN()
  else
    system.out.println("please enter 0, 1, 2, or 3.")
```
