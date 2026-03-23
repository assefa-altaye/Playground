from datetime import date
############### Week 1 input >>>process>>>>output
# name=input("Enter your name: ")
# print("Hello, ", name)
# major =input("Enter your major: ")
# print("major")  #Everything inside quotation mark will print as it is
# print(major)    #This line prints user input stored in major variable 


#This program reads user birthday and calculates age, it needs import "from datetime import date"
# birth_year=int(input("Enter your birth year: "))
# current_year=date.today().year
# age=current_year-birth_year
# print(f"You are {age} years old\nEnjoy every year!")
# print(f"Today is: {date.today().month}/{date.today().day}/{date.today().year}")

#This program displays how many miles per gallon a car drives
# miles=float(input("Enter miles: "))
# gallon=float(input("Enter how many gallons used: "))
# print(miles/gallon)

#This program converts hour to seconds>>>does not accept float hours
# number_hours=int(input("Enter the number of hours: "))
# minute=number_hours*60
# second=number_hours*3600
# print(f"{number_hours} hours is equal to {minute} minutes")
# print(f"{number_hours} hours is equal to {second} seconds")

#This program calculates the money left after purchasing pens
# price=float(input("Enter the price of a pen: "))
# pen_bought=int(input("How many pens did you purchase? "))
# money=float(input("What was your budget for pen? "))
# remaining=money-(price*pen_bought)
# print("Yor remining balance is: ", remaining)

#This program determines annual profit of a company
# The projected annual sale of a company is 23%
# total_sale=float(input("Enter the projected total sale $ "))
# annual_profit=total_sale*23/100
# print(f"Annual profit is: ${annual_profit}")

# print(r'C:\some\name')


# total = 0
# for count in range(1,6):
# 	total = total + count
# print(total)


# total=0 
# count=0 
# while count <6:
# 	total=total+count
# 	count+=1
# print(total)


# def main():
#     total = 100
#     find_total()
#     print(total)

# #find sum of a range of numbers
# def find_total():
#     total = 0
#     for n in range(50):
#         total = total + n
#     print(total)

# #calling main function
# main()

##############week 7 lab

#This program analyze monthly electricity consumption 
#Calculates total average and maximum consumption

# total =0
# month=0
# maximum=0
# high_consumption=0
# low_consumption=0

# usage=int(input(f"Electricity consumption for month #{month} (enter -1 end): "))

# while usage != -1:
    
#     while usage<-1: #check for negative number
#         print("ERROR! Electricity consumption cannot be negative")
#         usage=int(input(f"Electricity consumption for month #{month + 1} (enter -1 end): "))
     
#     total =total + usage #Calculate total
#     month+=1
    
#     #Find if usage is maximum
#     if usage > maximum: 
#         maximum = usage
    
#     #count high and low consumption months    
#     if usage > 700:
#         high_consumption+=1
#     elif usage < 300:
#         low_consumption+=1
#     usage=int(input(f"Electricity consumption for month #{month + 1} (enter -1 end): "))
    
#     average=total/month #Calculate average

    

# #Print the result  
# print("-------------------------------")
# print(f"Months: {month}")
# print(f"Max consumption: {maximum}")
# print(f"Total consumption: {total} kWh")
# print(f"Average consumption: {average:.2f} kWh")
# print(f"Num high consumption months: {high_consumption}")
# print(f"Num low consumption months: {low_consumption}")


##########Week 7 lab ATM Simulation

# ATM Simulator: In this assignment, you will write Python program to simulate an ATM. You will complete the program in a sequence of three parts.

# In the first part, write a Python program that works as follows:

# ·      asks the user to enter the initial account balance.

# ·      asks the user whether they want to deposit (D) or withdraw (W) money.

# ·      asks the user to enter the amount to deposit/withdraw and adjust the balance accordingly.

# ·      print the balance after this transaction.

 

# Sample run #1 (yellow highlighted text is what is entered by the user):

 

# -----------ATM Simulator ------------

# ------------------------------------------

# Initial balance?: $200

# Deposit (enter D) or Withdraw (enter W) D

# Amount to deposit? $50

# Balance: $ 250.0

 

# Sample run #1 (yellow highlighted text is what is entered by the user):

 

# -----------ATM Simulator ------------

# -----------------------------------------

# Initial balance?: $300

# Deposit (enter D) or Withdraw (enter W) W

# Amount to withdraw? $150

# Balance: $ 150.0

# print("--------ATM Simulator ---------\n------------------------------------")
# initial_balance=float(input("Initial balance?: $"))
# outstanding_balance=initial_balance
# deposite_or_withdraw=input("Deposit (enter D) or Withdraw (enter W) ")
# if deposite_or_withdraw=="D":
#     deposite_amount=float(input("Amount to deposite? $ "))
#     outstanding_balance=initial_balance + deposite_amount
# elif deposite_or_withdraw=="W":
#     deposite_amount=float(input("Amount to withdraw? $ "))
#     outstanding_balance=initial_balance - deposite_amount
# print(f"Balance: $ {outstanding_balance}")

##########

# print("--------ATM Simulator ---------\n------------------------------------")
# balance=float(input("Initial balance?: $"))
# deposite_or_withdraw=input("Deposit (enter D) or Withdraw (enter W) ")
# if deposite_or_withdraw=="D":
#     deposite_amount=float(input("Amount to deposite? $ "))
#     balance += deposite_amount
# elif deposite_or_withdraw=="W":
#     deposite_amount=float(input("Amount to withdraw? $ "))
#     balance -= deposite_amount
# print(f"Balance: $ {balance}")

# print("--------ATM Simulator ---------\n------------------------------------")
# balance=float(input("Initial balance?: $"))
# while(balance<0):
#     print("ERROR! Balance cannot be <0 ")
#     balance=float(input("Initial balance?: $"))
#     deposite_or_withdraw=input("Deposit (enter D) or Withdraw (enter W) ")
#     while(deposite_or_withdraw == "D" and deposite_or_withdraw=="W"):
#         print("ERROR! Invalid Choice")
#         if deposite_or_withdraw=="D":
#             deposite_amount=float(input("Amount to deposite? $ "))
#             balance += deposite_amount
#         elif deposite_or_withdraw=="W":
#             deposite_amount=float(input("Amount to withdraw? $ "))
#             balance -= deposite_amount
#         print(f"Balance: $ {balance}")

deposite_count = 0
withdraw_count = 0

print("--------ATM Simulator ---------\n------------------------------------")

balance = float(input("Initial balance?: $"))

# balance validation
while balance < 0:
    print("ERROR! Balance cannot be <0 ")
    balance = float(input("Initial balance?: $"))

# main loop
while True:
    deposite_or_withdraw = input("Deposit (enter D) - Withdraw (enter W) - Exit (enter E) ")

    # choice validation (now includes E)
    while deposite_or_withdraw not in ("D", "W", "E"):
        print("ERROR! Invalid Choice")
        deposite_or_withdraw = input("Deposit (enter D) - Withdraw (enter W) - Exit (enter E) ")

    # exit if the use choose "E"
    if deposite_or_withdraw == "E":
        break

    elif deposite_or_withdraw == "D":
        amount = float(input("Amount to deposit? $ "))
        balance += amount
        deposite_count += 1

    elif deposite_or_withdraw == "W":
        amount = float(input("Amount to withdraw? $ "))
        while amount > balance:
            print(f"ERROR! Balance= {balance}")
            amount = float(input("Amount to withdraw? $ "))
        balance -= amount
        withdraw_count += 1

print("---------Receipt--------------")
print(f"Balance: $ {balance}")
print(f"Deposits:  {deposite_count}")
print(f"Withdrawals:  {withdraw_count}")
