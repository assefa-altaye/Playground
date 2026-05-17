##############Read file, numbers only
#This program reads file to lists price
#Function to get price list from file
# def get_prices_list(file_name):
    
#     #open the file in read mode
#     input_file=open(file_name, 'r')
#     price_list=[]
    
#     #iterate and read integer numbers
#     for num_str in input_file:
#         num= int(num_str)
#         price_list.append(num)
        
#     return price_list

# #function to get the high price values above a user input treshold    
# def get_high_prices(price_list, treshold):
#     high_price_list=[]
#     for price in price_list:
#         if price>treshold:
#             high_price_list.append(price)
            
#     return high_price_list

# #define the main finction    
# def main():
#     file_name=input("Enter file name: ")
#     price_list=get_prices_list(file_name)
#     print(price_list)
#     integer=int(input("Price? "))
#     high_value=get_high_prices(price_list, integer)
#     print(high_value)
#     #get the file name to write high prices
#     output_file_name=input("Output file name? ")
#     output_file=open(output_file_name, 'w')
#     #This loop iterates and write each high_value price to output_file
#     for prices in high_value:
#         output_file.write(str(prices)+'\n')
#     output_file.close()
    
# main()



################ read file with mixed data, text and number
# def get_prices_list(file_name):
    
#     #open the file in read mode
#     input_file=open(file_name, 'r')
#     price_list=[]
    
#     #iterate and read integer numbers
#     for num_str in input_file:
#         num= int(num_str)
#         price_list.append(num)
        
#     return price_list

# #function to get the high price values above a user input treshold    
# def get_high_prices(price_list, treshold):
#     high_price_list=[]
#     for price in price_list:
#         if price>treshold:
#             high_price_list.append(price)
            
#     return high_price_list

# #define the main finction    
# def main():
#     file_name=input("Enter file name: ")
#     price_list=get_prices_list(file_name)
#     print(price_list)
#     integer=int(input("Price? "))
#     high_value=get_high_prices(price_list, integer)
#     print(high_value)
#     #get the file name to write high prices
#     output_file_name=input("Output file name? ")
#     output_file=open(output_file_name, 'w')
#     #This loop iterates and write each high_value price to output_file
#     for prices in high_value:
#         output_file.write(str(prices)+'\n')
#     output_file.close()
    
# main()
#########################
def process_file(source, destination):

    total=0
    
    source_file = open(source,'r')
    destination_file=open(destination, 'w')

    for line in source_file:
        parts=line.strip().split()
        # print(len(parts))
        # if len(parts)==4:
        if parts:
            # item, price=parts
            name=parts[0]
            score1=int(parts[1])# if len(parts)>1 else 0
            score2=int(parts[2])# if len(parts)>1 else 0
            score3=int(parts[3])# if len(parts)>1 else 0
            total=score1+score2+score3
            # count+=1
            
    # if count>0:
            average= total/(len(parts)-1)
            # print(f"{name}: {total}:{average}")
            out_str=f"{name}:\t{average:.2f}\n"
            destination_file.write(out_str)
    source_file.close()
    destination_file.close()

def get_letter_grade(grade, letter_grade):
    # file=
def main():
    s_file='grades.txt'
    d_file='average.txt'
    process_file(s_file, d_file)
    # s_file.close()
    # d_file.close()
main()

