#This function accepts three exam score results and returns grade later and average

#define function to get a letter grade
# def get_letter_grade(exam_score):
#     if exam_score<0:
#         print("ERROR! Score cannot be negative.")
#     elif exam_score>100:
#         print("ERROR! Score cannot be greater than 100")
#     elif exam_score>=90:
#         print(f"Score: {exam_score}, Letter grade: A")
#     elif exam_score>=80:
#         print(f"Score: {exam_score}, Letter grade: B")
#     elif exam_score>=70:
#         print(f"Score: {exam_score}, Letter grade: C")
#     elif exam_score>=60:
#         print(f"Score: {exam_score}, Letter grade: D")
#     else:
#         print(f"Score: {exam_score}, Letter grade: F")
        
# #define function to get average
# def get_average(score1, score2, score3):
#     return (score1 + score2 + score3)/3

# #define the main function    
# def main():
#     score1=float(input("First exam score? "))
#     score2=float(input("Second exam score? "))
#     score3=float(input("Third exam score? "))
#     get_letter_grade(score1)
#     get_letter_grade(score2)
#     get_letter_grade(score3)
#     print(f"Average: {get_average(score1, score2, score3)}")        
# main()


# def print_dotted(num):
#     print(f "{num} * .........." )

# def main():
#     print_dotted(5)
# main()

# def my_function():
#     print("Hello World")
# print("This is a second line")
# print("This is the third line")

# my_function()


# def main():
#     student_ID=input('Input student_ID: ')
#     print_me(student_ID)
# def print_me(ID):
#     print(student_ID)
# main()


# def area(width, height):
#     area=width*height
#     print(f"Area is:{area}")
# def perimeter(width, height):
#     perimeter=2*(width+height)
#     print(f"Perimeter is: {perimeter}")
# def main():
#     for num in range (10):
#         height=int(input("Enter height: "))
#         width=int(input("Enter width: "))
#         area(width,height)
#         perimeter(width, height)
# main()


#############Week 8 Lab 
#This function accepts three exam score results and returns grade later and average

# #define function to get a letter grade
# def get_letter_grade(exam_score):
#     while exam_score< 0:
#         print("ERROR! Score cannot be negative.")

#     if exam_score<0:
#         print("ERROR! Score cannot be negative.")
#     elif exam_score>100:
#         print("ERROR! Score cannot be greater than 100")
#     elif exam_score>=90:
#         print(f"Score: {exam_score}, Letter grade: A")
#     elif exam_score>=80:
#         print(f"Score: {exam_score}, Letter grade: B")
#     elif exam_score>=70:
#         print(f"Score: {exam_score}, Letter grade: C")
#     elif exam_score>=60:
#         print(f"Score: {exam_score}, Letter grade: D")
#     else:
#         print(f"Score: {exam_score}, Letter grade: F")
        
# #define function to get average
# def get_average(score1, score2, score3):
#     return (score1 + score2 + score3)/3

# #define the main function    
# def main():
#     score1=float(input("First exam score? "))
#     score2=float(input("Second exam score? "))
#     score3=float(input("Third exam score? "))
#     get_letter_grade(score1)
#     get_letter_grade(score2)
#     get_letter_grade(score3)
#     print(f"Average: {get_average(score1, score2, score3)}")        
# main()

#############


# def calculate_pay(hourly_pay, hours_worked):
#     if hours_worked <=20:
#         return hourly_pay * hours_worked
#     else:
#         regular_pay=hourly_pay * 20
#         overtime_hours= hours_worked -20
#         overtime_pay= overtime_hours*hourly_pay*1.5
#         return regular_pay + overtime_pay

# def main():
#     hourly_pay= float(input("Enter Hourly pay? $"))
#     hours_worked=float(input("Enter hours? "))
    
#     gross_pay=calculate_pay(hourly_pay, hours_worked)
    
#     print(f"Payment: ${gross_pay: .2f}")

# main ()

