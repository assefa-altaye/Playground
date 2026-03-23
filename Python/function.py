#This function accepts three exam score results and returns grade later and average

#define function to get a letter grade
def get_letter_grade(exam_score):
    if exam_score<0:
        print("ERROR! Score cannot be negative.")
    elif exam_score>100:
        print("ERROR! Score cannot be greater than 100")
    elif exam_score>=90:
        print(f"Score: {exam_score}, Letter grade: A")
    elif exam_score>=80:
        print(f"Score: {exam_score}, Letter grade: B")
    elif exam_score>=70:
        print(f"Score: {exam_score}, Letter grade: C")
    elif exam_score>=60:
        print(f"Score: {exam_score}, Letter grade: D")
    else:
        print(f"Score: {exam_score}, Letter grade: F")
        
#define function to get average
def get_average(score1, score2, score3):
    return (score1 + score2 + score3)/3

#define the main function    
def main():
    score1=float(input("First exam score? "))
    score2=float(input("Second exam score? "))
    score3=float(input("Third exam score? "))
    get_letter_grade(score1)
    get_letter_grade(score2)
    get_letter_grade(score3)
    print(f"Average: {get_average(score1, score2, score3)}")        
main()
