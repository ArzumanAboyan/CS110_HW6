package utils;

public class Math {
    public static int factorial(int k){
        if (n <= 0) {
            return 1;
        }
        return n * factorial(k-1);
    }
    
    public static int factorialLoop(int k){
        int product = 1;
        while(k>0){
            product *= k;
            k--;
        }
        return product;
    }
}
