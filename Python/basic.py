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
###########ATM Simulation
# print("--------ATM Simulator ---------\n------------------------------------")

# balance = float(input("Initial balance?: $"))

# # balance validation
# while balance < 0:
#     print("ERROR! Balance cannot be <0 ")
#     balance = float(input("Initial balance?: $"))

# # main loop
# while True:
#     deposite_or_withdraw = input("Deposit (enter D) - Withdraw (enter W) - Exit (enter E) ")

#     # choice validation (now includes E)
#     while deposite_or_withdraw not in ("D", "W", "E"):
#         print("ERROR! Invalid Choice")
#         deposite_or_withdraw = input("Deposit (enter D) - Withdraw (enter W) - Exit (enter E) ")

#     # exit if the use choose "E"
#     if deposite_or_withdraw == "E":
#         break

#     elif deposite_or_withdraw == "D":
#         amount = float(input("Amount to deposit? $ "))
#         balance += amount
#         deposite_count += 1

#     elif deposite_or_withdraw == "W":
#         amount = float(input("Amount to withdraw? $ "))
#         while amount > balance:
#             print(f"ERROR! Balance= {balance}")
#             amount = float(input("Amount to withdraw? $ "))
#         balance -= amount
#         withdraw_count += 1

# print("---------Receipt--------------")
# print(f"Balance: $ {balance}")
# print(f"Deposits:  {deposite_count}")
# print(f"Withdrawals:  {withdraw_count}")
###########ATM Simulation

# # Get a salesperson's sales and commission rate.
# sales = float(input("Enter the amount of sales: "))
# comm_rate = float(input("Enter the commission rate: ")) 
# # Calculate the commission.
# commission = sales * comm_rate
# # Display the commission.
# print('The commission is $', commission)

# # Get a salesperson's sales and commission rate.
# sales = float(input("Enter the amount of sales: "))
# comm_rate = float(input("Enter the commission rate: ")) 
# # Calculate the commission.
# commission = sales * comm_rate
# # Display the commission.
# print('The commission is $', commission)

# # Get a salesperson's sales and commission rate.
# sales = float(input("Enter the amount of sales: "))
# comm_rate = float(input("Enter the commission rate: ")) 
# # Calculate the commission.
# commission = sales * comm_rate
# # Display the commission.
# print('The commission is $', commission)


#Get salesperson's sales and commision rate
# sales =float(input("Enter the amount of sales: "))
# comm_rate=float(input("Enter the commission rate: "))
#set the counter variable


########Using the while loop 
# count=1
# while count <=3:
#     sales =float(input("Enter the amount of sales: "))
#     comm_rate=float(input("Enter the commission rate: "))
#     #Calculate the commision
#     commission=sales*comm_rate
#     #Display the commision
#     print("The commision rate is $", commission)
#     count=count+1

# num_students=int(input("Enter nubmer of students: "))
# counter=1
# while counter <= num_students:
#     print("Student #", 1)
#     name=input("Enter name: ")
#     counter =counter +1

# counter=1
# while counter <=10:
#     number=int(input("Enter a number: "))
#     if number%2==0:
#         print(number, "is even")
#     else:
#         print(number, "is odd")
#     counter+=1
    
# count = 0
# while count<10:
#     age = int(input("Enter age: "))
#     if age>65:
#         print("senior")
#     elif age > 18:
#         print("Adult")
#     else:
#         print("Child")
    
#     count=count+1

# total=0
# num=int(input("Enter a number (0 to stop): "))
# while num !=0:
#     total=total + num
#     num=int(input("Enter a number (0 to stop): "))
# print(total)

# count=10
# while count>=10:
#     print("Hello")
#     count=count+1

# counter_reset=1
# count=int(input("How many times you want to repeat: "))
# while counter_reset<=count:
#     print(counter_reset, "Hello")
#     counter_reset+=1


# item_price = 0
# while item_price != -1:
#     item_price = float(input("Enter item price (-1 to end): "))
#     item_tax = item_price * 0.1
#     sale_price = item_price + item_tax
#     print("Tax amount: ", item_tax)
#     print("Sale price: ", sale_price)


# number = 0
# while number!=-1:
#     number = int(input("Enter a number (-1 to end): "))
#     if number==42:
#         print("Correct!")

# item_price = 0
# total = 0
# while item_price != -1:
#     item_price = float(input("Enter item price (-1 to end): "))
#     total = total + item_price
# print("Total cose is ", total)

# price =0
# count_expensive=0
# count_cheap=0
# total=0

# price=int(input("Enter price (-1 to end): "))
# while price!=-1:
#     total=total+price
#     if price>=100:
#         count_expensive+=1
#     if price<100:
#         count_cheap+=1
#     price=int(input("Enter price (-1 to end): "))
# print(f"Totla: {total}")
# print(f"expensive count: {count_expensive}")
# print(f"cheap count: {count_cheap}")

# minute=10
# calories=0
# while minute<=30:
#     calories=minute*4.2
#     print(f"Calories burned: in {minute} minutes {calories}")
#     minute+=5

# again='y'
# while again!='n':
#     num1=float(input("Enter a number: "))
#     num2=float(input("Enter another number: "))
#     sum=num1+num2
#     print("The sum of the numbers is", sum)
#     again=input("would you like to try this operation again?")
    
# a = 10

# if not (a==10): 
# 	print("Boolean value of a is True") 
# if not (a%3 == 0 or a%5 == 0): 
# 	print("10 is not divisible by either 3 or 5") 
# else: 
# 	print("10 is divisible by either 3 or 5")


# a = 10
# b = -10
# c = 0
# if a > 0 or b > 0: 
# 	print("Either of the number is greater than 0") 
# else: 
# 	print("No number is greater than 0") 

# if b > 0 or c > 0: 
# 	print("Either of the number is greater than 0") 
# else: 
# 	print("No number is greater than 0")

# a = 10
# b = 10
# c = -10
# if a > 0 and b > 0: 
# 	print("The numbers are greater than 0") 
# if a > 0 and b > 0 and c > 0: 
# 	print("All three numbers are greater than 0") 
# else: 
# 	print("At least one number is not greater than 0")


# number =0 
# even_count=0
# odd_count=0
# number=int(input("Enter a number (-1 to end): "))
# while number !=-1:
#     number=int(input("Enter a number (-1 to end): "))
#     if number%2==0:
#         even_count+=1
#     else:
#         odd_count+=1
    
# print(f"the count of even numbers is {even_count}")
# print(f"the count of odd numbers is {odd_count}")

# number =0
# counter1=0
# counter2=0
# counter3=0
# # number = int(input("Enter a positive number: "))
# while number != -1:
#     number = int(input("Enter a positive number: "))
#     if number > 80 and number < 100:
#         counter1+=1
#     if number >60 and number <= 79:
#         counter2+=1
#     if number >0 and number <=60:
#         counter3+=1
# print(f"Numbers between 100 and 80: {counter1}")
# print(f"Numbers between 79 and 60: {counter2}")
# print(f"Numbers below 60: {counter3}")

# value=12345.6789
# print(f"{value:,.2f}")


# discount=0
# base_price=99
# quantity=int(input("Enter the number of packages purchased: "))
# if quantity<10:
#     discount=0
# elif quantity >=10 and quantity<=19:
#     discount=0.1
# elif quantity >=20 and quantity<=49:
#     discount=0.2
# elif quantity >=50 and quantity<=99:
#     discount=0.3
# else:
#     discount=0.4
# price= base_price*discount*quantity
# print(f"After a {discount:.0%} discount, the price of {quantity} packages"
#       f"is {price}")


#This program asks the budget of a user, 
#calculates the sum of expense and displays if the user is over or under budget

#assign initial values to zero
# expense=0
# total=0
# budget =float(input("Amount budgeted for a month: "))

# #Loop until the user inputs -1
# while expense != -1:
#     #increment total by the amount of expense
#     total += expense
#     #compute differene between total and budget
#     # difference=total-budget
#     expense=float(input("Expense (enter -1 to end): "))
# #check if total is over budget or under budget and display message 
# if total > budget:
#     difference=total-budget
#     print("Over budget by", difference)
# else:
#     difference=budget - total
#     print("Under budget by", difference)


#assign initial values
# number=0
# total=0
# count_even=0

# #Check the condition if number is not equal to -1 
# while number != -1:
#     number=int(input("Enter a number (-1 to end): "))
#    #check if number is even 
#     if number % 2==0:
#         count_even+=1
#         total+=number
# #Display the count of even and the sum of the numbers.
# print("Count of even numbers: ", count_even)
# print("Sum of even numbers: ", total)


#set initail value for row 
# row=1

# #print the table header
# print("Row\tCelsius\tFahrenheit")
# print("----------------------------")

# #Print Celsius and farhanite in tabular form 
# for temprature in range(50, 190, 20):
#     print(f"{row}\t {temprature}\t {temprature *9/5 + 32}")
#     row+=1
    


#This program uses for loop
#Accepts user input for start and end tamprature and number of rows 
#Converts Celsius to Fahranheit and displays in table

#Get the starting temprature
# start=int(input("Enter starting temprature: "))

# #Get the ending temprature 
# end=int(input("Enter ending temprature: "))

# #Set start row 
# start_row=1
# #Get the number of rows
# row=int(input("Enter number of rows: "))
# step=(end-start)//row

# #Print the table header
# print("Row\tCelsius\tFahrenheit")
# print("-------------------------")
# row=1
# #Print celsius and Fahranheit in tabular form 
# for temprature in range(start, end, step):
#     print(f"{row}\t{temprature}\t{temprature*9/5 + 32}")
#     row+=1


# print(f"{1234 * 10: ,d}")

# print(f"{1234 / 10: .2f}")

# print(f"{123467: ,.2f}")


# print(f"{.75: .0%}")

# # print('1' + 2)
# print('a' 'b' 'c')
# print('1'+'2')

# for val in ["Amari", "Luka", "Nora"]:
#     print(f"Hi {val}")

# count=1
# while count <=3:
#     print("Hello")
#     count +=1

# for num in [1, 2, 3, 4 ,5]:
#     print(num)

# for letter in "python":
#     print(letter)

# for number in range(6):
#     print(number)

# for i in range(2, 21, 2):
#     print(i)

# i=2
# while i<=20:
#     print(i)
#     i+=2

# n=int(input("Enter a number: "))
# fact=1
# i=1
# while i<=n:
#     fact*=i
#     i+=1
# print(fact)

# fact=1
# n=int(input("Enter a positive number: "))
# while n>0:
#     # n=int(input("Enter a positive number: "))

#     for i in range(1,n+1):
#         fact*=i
#     print(fact)


# total=0
# for n in range(1,21):
#     if n%2==0:
#         total+=n
# print(total)

# number=10 
# for count in range(0, 5):
#     number+=2
# print(number)


#initialize factorial
# factorial=1

#Get the nubmer
# num=int(input("Enter a positive number: "))

# #Check value for non negative and calculate factorial
# while num<=0:
#     print("ERROR! number must be greater than zero")
#     num=int(input("Enter a positive number: "))
# for f in range(1, num+1):
#     factorial=factorial*f
#     # f+=1
# print(f"{f-1}! is {factorial}")


# for rows in range(8):
#     for cols in range(6):
#         print("*",end="")
#     print()


# num_rows = int(input("Enter number of rows: "))
# for row in range(6):
#     for col in range(5):
#         print("*",end="")
#     print()
# num_rows = int(input("Enter number of rows: "))
# for row in range(num_rows+1):
#     for col in range(row):
#         print("*",end="")
#     print()



#function definition
# def message(name):
#     for i in range(1,11):
#         print(f"Hello {name}")
    
    
# #calling the function
# message("Abebe")


# score=int(input("Enter your score"))
# def check_pass(mark):
#     if mark>=60:
#         print("Pass")
#     else:
#         print("Fail")
# check_pass(score)

# pi=3.14
# def circle_area(radius):
#     area=pi*(radius**2)
#     print(f"The area of a circle is: {area}")
# circle_area(5)

# num_of_lines=int(input('Enter number of lines: '))
# def print_dotted_lines(lines):
#     for l in range (1, lines+1):
#         print("..........")
# def main():
#     print_dotted_lines(num_of_lines)
# main()

# def main():
#     texas()
#     california()

# #defining texas function
# def texas():
#     birds = 5000
#     print(f"Texas has {birds} birds")

# #defining california function
# def california():
#     birds = 8000
#     print(f"California has {birds} birds")

# #calling main function
# main()


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


# def main():
#     value=5
#     show_double(value)
# def show_double(number):
#     double=number*2
#     print(double)
# main()


# def main():
#     name=input("Enter your name: ")
#     first_name=input("Enter your first name: ")
#     last_name=input("Enter your last name: ")
#     greet(name)
#     display_message(5)
#     reverse(first_name, last_name)

# def greet(name):
#     print(f"Hello {name}")

# def display_message(num):
#     for i in range(0, num):
#         print("Hello")

# def reverse(first, last):
#     print(f"{last} {first}")
# main()

# def get_rect_area(l,w):

#     area = l*w

#     #print("Length: ",l)

#     #print("Width: ",w)

#     print("Area: ",area)

# def get_rect_per(length,width):

#     perimeter = 2 * (length + width)

#     print("Perimeter: ", perimeter)

# def main(): #function header

#     for x in range(3):

#         print("Enter dimentions for rectangle #",x+1)

#         length = int(input("Enter lenght:"))

#         width = int(input("Enter width: "))

#         get_rect_area(length,width)

#         get_rect_per(length,width)

# main()   


#function to find sum from 1 to 100
# def calculate_sum(upper_limit):
#     total = 0
#     for x in range(1,upper_limit+1):
#         total = total + x
#     return total
# def main():
#     n=int(input("Enter upper limit: "))
#     output=calculate_sum(n)
#     print(output)
# main()
# def calculate_sum():
#     total = 0
#     for x in range(1,101):
#         total = total + x
#     return total
# def main():
#     output=calculate_sum()
#     print(output)
# main()

# def get_exam_score():
#     score = int(input("Exam score?: "))
# 	  #input validation
#     while score < 0:
#         print("ERROR! Score cannot be negative")
#         score = int(input("Exam score?: "))
    
#     return score

# def main():
#     score1=get_exam_score()
#     score2=get_exam_score()
#     score3=get_exam_score()
#     average=(score1+score2+score3)/3
#     print(f"Average: {average}")
# main()
# def get_status(age):
#     output = ""
#     if age >= 65:
#         output = "Senior"
#     elif age >= 18:
#         output = "Adult"
#     else:
#         output = "Child"
#     return output

# def get_age():
#     age = int(input("Your age? "))
#     while age < 0:
#         print("ERROR, age cannot be negaitve")
#         age = int(input("Your age? "))
#     return age

# def main():
#     your_age = get_age()
#     status = get_status(your_age)
#     print("You are ",status)

# main()
# import random
# print(random.randint(1,20))

# def do_something(num):
#     return num*2
# print(do_something(10))

# import random

# def main():
#     dice_face = random.randint(1,6)
#     for i in range(1,dice_face+1):
#         print("*",end="")
    
    
# main()

#global variable
# my_value = 10

# def show_value():
#     global my_value
#     my_value = 20
#     print(my_value)

# show_value()
# print(my_value)
