# sales_price=float(input("Enter sales price: "))
# tax_rate=float(input("Enter sales tax rate "))
# #calculate tax
# sales_tax=sales_price*tax_rate/100
# purchase_price= sales_price+ sales_tax
# print("Sales price: " ,sales_price, "Tax Rate:", tax_rate, "Sales tax: ", sales_tax, "Purchase price: ", purchase_price)

#print('Hook \'em horns!')


# name=input("Enter your name: ")
# print("Hello, ", name)

# length=8
# width=5
# area=length*width
# print("The area is: ", area)

# num1_str=input("Enter first number ")
# num1= int(num1_str)
# num2_str=input("Enter second number ")
# num2= int(num2_str)
# total =num1+num2
# print(total)

# birth_year=int(input("Enter birth year: "))
# age=2025-birth_year
# print("Yoour age is", age)

# total_sale=float(input("Enter the projected amount of total sale: "))
# annual_profit=total_sale*23/100
# print("Total Profit is: ", annual_profit)


# miles=float(input("Enter miles: "))
# gallon=float(input("Enter gallons used: "))
# print(miles/gallon)


# price=float(input("Enter price per pen: "))
# pens_bought=float(input("Enter number of pens: "))
# money=float(input("Enter money: "))
# remaining=money-(price*pens_bought)
# print(remaining)


# speed=35
# rain=False
# if rain:
#     speed-10
# if rain==False:
#     speed=speed+5
# if speed>35:
#     speed= speed-2
# print(speed)

# num=int(input("Enter a number: "))
# if num %2 ==0:
#     print("Even")
# else:
#     print("Odd")


# y=int(input("Enter the value of y:"))
# if y==20:
#     x=0
# else:
#     x=10
# print(x)


# age =22
# if age >=18:
#     if age <21:
#         print("Young Adult")
#     else:
#         print("Adult")
# else:
#     print("Minor")

# a=int(input("Enter the cvalue of a:"))
# b=int(input("Enter the cvalue of b:"))
# c= (a**2 + b**2)**0.5
# print(c)

# x=5.0
# if x<5:
#     x=3*x
# if x/2==1:
#     x=x/2
# print (2*x +1 )

# total=0
# num=int(input("Enter a number (0 to stop):"))
# while num !=0:
#     total =total+num
#     num=int(input("Enter a number (0 to stop):"))
# print("Total =", total)


# counter_reset=0
# count=int(input("How many times to print "))

# while counter_reset<count:
#     print("Hello World!")
#     counter_reset+=1    

# count=1
# while count<=10:
#     count =count*2
#     print(count)

# n=1
# while n<10:
#     print("hello")
#     n=n+2
#     # print(n)

# a=10
# b=10
# c=-10
# if a>0 and b>0:
#     print("The numbers are greater than zero")
# if a>0 and b>0 and c>0:
#     print("All three numbers are greater than zero")
# else:
#     print("Atleast one number is greater than zero")

# print("Enter your name "
#       "and your last name")
# print(f"{1234 * 10: ,d}")

# print(f"{1234 / 10: .2f}")

# print(f"{123467: ,.2f}")

# print(f"{.75: .0%}")
"""String"""
# msg="It\'s a sunny day"     #escape sequence
# print(msg)
# print("'" in msg)
# print('"' in msg)
# print(len(msg))
# print(msg[-5])

# name=input("Enter your name: ")
# age=int(input("Enter your age: "))
# print(f"Hello, my name is {name} and I am {age} years old.")

# print(True and True or False)
# x=45
# # if x>20 and x<40:
# #     print("Inside")

# print("Inside") if x>20 and x<40 else print("Not inside")

# grade=int(input("Enter your score"))
# print("Pass") if grade>59 else print("Fail")


# num1=int(input("Enter the first number"))
# num2=int(input("Enter the seconde number"))
# max=num1 if num1>num2 else num2
# print(f"The bigger number is {max}")

# temp=int(input("Enter the temprature"))
# status="Hot" if temp>60 else "Cold"
# print(f"It is {status}")

# speed=int(input("Enter a number"))
# status="The number is within range" if speed>0 and speed<100 else "The number is not within range"
# print(status)

# print("the amount of"
#       "sales for each day"
#       "press enter")


# print("one", end=' ')
# print("two", end=' ')
# print("three")

# print("one", "two", "Three", sep=",")
# print("one\ttwo\tthree")

# name = "John"
# print("Hello", name)
# print("Hello {name}")
# print(f"Hello {name}")
# print("Hello " + name)
# print('1' + 2)
# amount=5000123.034
# month_pay=amount/12.0
# print(f"the monthly payment is: {month_pay: .2f}")

# print(f"{amount: ,.2f}")

# discount=0.4
# print(f"{discount: .2%}")

# print(f"{1234 * 10: ,d}")

# print(f"{1234 / 10: .2f}")

# print(f"{123467: ,.2f}")

# print(f"{.75: .0%}")


# value = 900
# print(value)
# print("value")
# print(value+100)
# print(f"{value+100}")
# # print("The value is: "+value)
# print("The value is: {value}")
# print(f"The value is: {value}")

# for item in [1,2,3]:
#     print(item)

# for number in range(1,11):
#     print(f"{number} \t {number**2}")

# days=int(input("Enter days"))
# tatal=0
# for days in range(1,7):
#     sale=int(input("Enter the sales"))
#     total=day+sale

# age=int(input("Enter age: "))

# total=0
# for count in range(1,4):
#     grade=int(input(f"Enter Grade for student {count}: "))
#     while grade >0:
#         print("ERROR! Grade must be positive")
#     total=total+grade
# average =total/10
# print("Average: ", average)


factorial=1
n=int(input("Enter a positive number: "))
while n<=0:
    print("ERROR! Number must be greater than zero")
else:
    for i in range(1,n+1):
        factorial=factorial*i
        n+=1
    print(f"{i}! is {factorial}")

