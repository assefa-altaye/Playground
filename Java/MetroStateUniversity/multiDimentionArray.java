//This program demonstrates multi dimentional array
public class multiDimentionArray {
    public static void main(String [] args){
        //finding minimum/maximum value in every row for a 2D array
        int [][] data={
                {5, 2, 3},
                {3, 0, 2},
                {8, 2, 1}
        };

//        int min=data[0][0];
//        int max=data[0][0];
        for (int i=0; i< data.length; i++){
            int min=data[0][0];
            int max=data[0][0];
          for (int j=0; j<data[i].length; j++){
              if(data[i][j]<min){
                  min=data[i][j];
              }
              if(data[i][j]>max){
                  max=data[i][j];
              }
          }
            System.out.println(min);
//            System.out.println(" ");
//            System.out.println(max);
        }
    }
}
