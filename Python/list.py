# numbers = [1,2,3,4]
# #iterating over list elements
# for num in numbers:
#     print(num)

# numbers = [1,2,3,4]
# index=0
# while index<=3:
#     print(numbers[index])
#     index+=1

# numbers = [89,67,80,34,55]

# index = 0
# while index <= 5:
#     print(numbers[index])
#     index = index + 1

# def main():
#     class_size = int(input("How many students? "))
#     student_scores = read_scores(class_size)
#     print(student_scores)
    
# def read_scores(num_students):
#     scores = [0] * num_students
#     for n in range(0,num_students):
#         scores[n] = int(input(f"Score for student #{n}? "))
#     return scores

# main()

# # def create_list(num_rand):
# #     rand=[0]*100
# #     for n in range(0,num_rand):
# #         rand=
# import random
# def main():
#     random_size = int(input("How many integers to generate? "))
#     rand_number = create_list(random_size)
#     print(rand_number)

#     response = input("How many integers to generate? ")
#     count = int(response)
#     result_list = create_list(count)
#     print(f"\n{result_list}")
    
# def create_list(num_integers):
#     rand = [0] * num_integers
#     for n in range(0,num_integers):
#         rand[n] = random.randlist(0, 100)
#     return rand

# main()


# #initialize an array with 10 elements
# scores = [0]*10

# total = 0
# #read scores into a list
# for n in range(0,10):
#     score = int(input(f"Score for student #{n}? "))
#     scores[n] = score
#     total = total + score

# average = total / 10

# #find how many above average
# count_above = 0
# for n in range(0,10):
#     if scores[n] > average:
#         count_above = count_above + 1

# print("Scores: ",scores)
# print("Avergae: ",average)
# print("Count above average: ",count_above)


# import random

# def main():
#     count=int(input("How many integers to generate? "))
#     result_list=create_list(count)
#     print(result_list)
#     avg = get_average(result_list)
#     rng = get_range(result_list)
    
#     print(f"Average: {avg}")
#     print(f"Range: {rng}")
#     n=int(input("Enter the number to count above: "))
#     final_count=get_count_above(result_list,n)
#     print(f"Above {n}: {final_count}")

# total=0#
# def create_list(num_integers):
#     rand = [0] * num_integers
#     for n in range(0,num_integers):
#         rand[n] = random.randint(1, 100)
#     return rand

# def get_average(result_int):
#     total=0
#     for num in range(0, len(result_int)):
#         total+=result_int[num]
#         average=total/len(result_int)
#     return average
    
# def get_range(result_int):
#     max_value=result_int[0]
#     min_value=result_int[0]

#     for num in range(1, len(result_int)):
#         if result_int[num] > max_value:
#             max_value=result_int[num]
#         if result_int[num] < min_value:
#             min_value=result_int[num]
#     return max_value-min_value

# def get_count_above(result_int,n):
#     counter=0
#     for num in range(0, len(result_int)):
#         if result_int[num] > n:
#             counter+=1
#     return counter
# main()

# counter=0
# for li in range(0,10):
#     print(counter)
#     counter=counter+10

# li= [1,2,3,4,5]
# print(len(li))

# data=[0,0,0,0,0,0,0]
# data1=[0]*7
# # print(data)
# # print(data1)
# data[1]=10
# data[6]=20
# data[3]=data[1]+data[6]
# # data[7]=52
# print(data)

# numbers = [1,2,3,4]
# #iterating over list elements
# for num in numbers:
#     print(num)

# numbers = [10,21,32,44]
# #iterating over list elements
# for num in numbers:
#     num = 10

# print(numbers)

#finding sum of elements my_list
# my_list = [90,80,65,40,30]
# total = 0
# for n in my_list:
#     total = total + n

# print(f"Total: {total}")

# numbers = [89,67,80,34,55]

# for num in numbers:
#     if num%2 == 1:
#         print(num)

# numbers = [89,67,80,34,55]
# index=numbers[0]


# numbers= list(range(1, 10, 2))
# for n in numbers:
#     print(n*2)


# numbers = [1,2,3,4]
# #iterating over list elements
# # for num in numbers:
# #     print(num)


# num=numbers[0]
# while num <= len(numbers):
#     if num%2==1:
#         print(num)
#     num+=1

# numbers = [89,67,80,34,55]

# index = 0
# while index <= 4:
#     num = numbers[index]
#     if numbers[index] %2 == 1:
#         print(num)
#     index = index + 1

# numbers = [89,67,80,34,55]

# numbers_length = len(numbers)
# index = 0
# while index < numbers_length:
#     num = numbers[index]
#     if num%2 == 1:
#         print(num)
#     index = index + 1


# numbers = [89,67,80,34,55]
# numbers[3] = int(input("Enter a number: "))
# print(numbers)


#initialize an array with 10 elements
# scores = [0]*10

# for n in range(1,4):
#     score = int(input(f"Score for student #{n}? "))
#     scores[n-1] = score

# print(scores)


# total = 0
# for n in range(1,101):
#     score = int(input(f"Score for student #{n}?": ))
#     total = total + score

# average = total / 100


# list_1 = [2,3,4,5]
# list_2 = [20,30,40,50]
# list_3 = list_1 + list_2
# print(list_3)


# def main():
#     class_size = int(input("How many students? "))
#     student_scores = read_scores(class_size)
#     print(student_scores)
    
# def read_scores(num_students):
#     scores = [0] * num_students
#     for n in range(0,num_students):
#         scores[n] = int(input(f"Score for student #{n}? "))
#     return scores

# main()
# ints = [0]*10

# for n in range(1,11):
#     ints = int(input(f"Write integer #{n}? "))
#     num=ints[n-1]

# print(num)


# scores = [0]*10
# for n in range(0,10):
#     score = int(input(f"Score for student #{n}? "))
#     scores[n] = score

# print(scores)

# search_num =int(input("Enter the number to search:"))
# if search_num in scores:
#     print(f"{search_num} is in the list")
# else:
#     print(f"{search_num} is not in the list")



#This program reads prices and print statistics 


# #Read prices and return prices list   
# def read_prices(num_prices):
#     prices=[0]*num_prices
#     for n in range(0, num_prices):
#         prices[n]= int(input(f"Prices for item #{n+1}? "))
#     return prices
    
# #function to calculate and return average of numbers in the list
# def get_average(numbers):
#     total=0
#     for n in numbers:
#         total +=n
#     average = total / len(numbers)
#     return average
    

# #function to get maximum value in the list
# def get_maximum(numbers):
#     maximum = numbers[0]
#     for n in numbers:
#         if n > maximum:
#             maximum = n
#     return maximum
    
# #function to get minimum value in the list
# def get_minimum(numbers):
#     minimum = numbers[0]
#     for n in numbers:
#         if n < minimum:
#             minimum = n
#     return minimum
    
# #function to get price of a given number in the list
# def get_item_price(prices, item_number):
#     if item_number < 1 or item_number >len(prices):
#         return -1
#     return prices[item_number-1]
    

# #function to get the count of expensive items above average
# def get_count_expensive(item_prices):
#     avg =get_average(item_prices)
#     count=0
    
#     for price in item_prices:
#         if price > avg:
#             count +=1
#     return count

# def main():
#     item_size=int(input("How many items? "))
    
#     #Calling functions to get results
#     item_prices=read_prices(item_size)
    
#     print(item_prices)
    
#     avg =get_average(item_prices)
#     maximum = get_maximum(item_prices)
#     minimum = get_minimum(item_prices)
#     price_range = maximum - minimum
    
#     #Print the results
#     print(f"Average price: {avg}")
#     print(f"Maximum price: {maximum}")
#     print(f"Minimum price: {minimum}")
#     print(f"Range of prices: {price_range}")
    
#     item_num=int(input("Enter item number: "))
#     price= get_item_price(item_prices, item_num)
#     print(f"Item #{item_num} price: {price}")
    
#     count_expensive = get_count_expensive(item_prices)
#     print(f"Count expensive: {count_expensive}")

# main()


############################print the sum of even numbers
# def get_sum_even(input_list):
    
#     output = 0
#     for n in input_list:
#         even_list=[]
#         if n % 2 == 0:
#             # even_list[n-1]=n
#             # print(even_list)
#             output = output + n
#     return output

# def main():
#     list_1 = [4,5,6,9,2,1,3,4]
#     s = get_sum_even(list_1)
    
#     print("Sum even: ",s)

# main()



###################### multiplies all number at even positions by 2, and return the updated list.


# def change_at_even(my_list):
#     l = len(my_list)
#     output = [0] * l
    
#     for pos in range(0,l):
#         if pos %2 == 0:
#             output[pos] = my_list[pos] * 2
#         else:
#             output[pos] = my_list[pos]
        
#     return output

# def main():
#     list_1 = [4,5,6,9,2,1,3,4]
#     list_2 = change_at_even(list_1)
    
#     print("Input list: ",list_1)
#     print("output list: ",list_2)
    

# main()


#################
# def add_lists(list_1,list_2):
    
#     l = len(list_1)
#     output_list = [0] * l
    
#     for pos in range(0,l):
#         output_list[pos] = list_1[pos] + list_2[pos]
    
#     return output_list
    
# def main():
#     list_1 = [4,5,6,9,2,1,3,4]
#     list_2 = [2,3,4,5,6,7,8,9]
#     list_3 = add_lists(list_1,list_2)
    
#     print("Input list 1: ",list_1)
#     print("Input list 2: ",list_2)
#     print("Output list 2: ",list_3)
    

# main()


# numbers = [89,67,80,34,55]

# index = 0
# while index <= 4:
#     num = numbers[index]
#     if numbers[index] %2 == 1:
#         print(num)
#     index = index + 1


# def change_at_even(my_list):
#     l = len(my_list)
#     output = [0] * l
    
#     for pos in range(0,l):
#         if pos %2 == 0:
#             output[pos] = my_list[pos] * 2
#         else:
#             output[pos] = my_list[pos]
        
#     return output

# def main():
#     list_1 = [4,5,6,9,2,1,3,4]
#     list_2 = change_at_even(list_1)
    
#     print("Input list: ",list_1)
#     print("output list: ",list_2)
    

# main()

# def add_lists(list_1,list_2):
    
#     l = len(list_1)
#     output_list = [0] * l
    
#     for pos in range(0,l):
#         output_list[pos] = list_1[pos] + list_2[pos]
    
#     return output_list
    
# def main():
#     list_1 = [4,5,6,9,2,1,3,4]
#     list_2 = [2,3,4,5,6,7,8,9]
#     list_3 = add_lists(list_1,list_2)
    
#     print("Input list 1: ",list_1)
#     print("Input list 2: ",list_2)
#     print("Output list 2: ",list_3)
    

# main()


# my_string = "Hello there!"

# count = 0
# for ch in my_string:
#     ch="x"
#     print(ch)
#     # ch = "X"

# print(my_string)


# full_name="Assefa Tadesse Altaye"
# name=full_name.strip()
# middle_name=full_name[7:14]
# print(name)
# print(middle_name)

# def upper_word(in_text, in_word):

#     words = in_text.split()
#     print(words)
#     count_words = len(words)
#     in_word = in_word.upper()
#     for i in range(0,count_words):
#         if words[i].upper() == in_word:
#             words[i] = words[i].upper()

#     output_string = ""
#     for word in words:
#         output_string = output_string + word + " "

#     return output_string

# def main():
#     your_text = input("Enter text: ")
#     your_word = input("Enter word: ")
    
#     new_text = upper_word(your_text,your_word)
#     print(new_text)

# main()


# card_num = input('Enter credit card number: ')

# exp_date = input('Enter expiration date with two digits for the month and two digits for the year, as in 0924: ')


# length = len(card_num)
# last_four = card_num[length-4:length]
# month = exp_date[0:2]
# year = exp_date[2:5]

# print(f'The last four digits of your number are {last_four}.')
# print(f'The card expiration date is {month} / 20{year}.')


# input_text = input("Enter text: ")

# for ch in input_text:
#     if ch.isdigit():
#         input_text = input_text.replace(ch,"X")

# print(input_text)


my=[10, 1, 8, 3, 5]
total=0
for i in my:
    print(i)
#     total+=i
# print(total)