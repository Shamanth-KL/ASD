public class factorial {

    static int fact(int n){
        if (n == 0)
            return 1;
        else
            return(n * fact(n-1));
    }
    public static void main(String args[]){
        int i,factt=1;
        int number=4;//It is the number to calculate factorial
        factt = fact(number);
        System.out.println("Factorial of "+number+" is: "+factt);
    }
}