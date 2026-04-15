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


scores = [0]*10
for n in range(0,10):
    score = int(input(f"Score for student #{n}? "))
    scores[n] = score

print(scores)

search_num =int(input("Enter the number to search:"))
if search_num in scores:
    print(f"{search_num} is in the list")
else:
    print(f"{search_num} is not in the list")