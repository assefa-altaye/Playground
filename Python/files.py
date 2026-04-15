#This program lists price
#Function to get price list from file
def get_prices_list(file_name):
    
    #open the file in read mode
    input_file=open(file_name, 'r')
    price_list=[]
    
    #iterate and read integer numbers
    for num_str in input_file:
        num= int(num_str)
        price_list.append(num)
        
    return price_list

#function to get the high price values above a user input treshold    
def get_high_prices(price_list, treshold):
    high_price_list=[]
    for price in price_list:
        if price>treshold:
            high_price_list.append(price)
            
    return high_price_list

#define the main finction    
def main():
    file_name=input("Enter file name: ")
    price_list=get_prices_list(file_name)
    print(price_list)
    integer=int(input("Price? "))
    high_value=get_high_prices(price_list, integer)
    print(high_value)
    #get the file name to write high prices
    output_file_name=input("Output file name? ")
    output_file=open(output_file_name, 'w')
    #This loop iterates and write each high_value price to output_file
    for prices in high_value:
        output_file.write(str(prices)+'\n')
    output_file.close()
    
main()
