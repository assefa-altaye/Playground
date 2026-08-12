public class Factorial {
    public static void main(String[] args) {
        int num=5;
        int f=factorial(num);
        if (f==-1){
            System.out.println("Negative Number!");
        }else{
            System.out.printf("%d! is: %d\n", num,f);
        }

    }
    public static int factorial(int n){
        if(n<0) return -1;
        else{
            if (n==0) {
                return 1;
            }else{
                return n*factorial(n-1);
            }
        }
    }
}
