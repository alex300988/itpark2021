package lesson3;

public class HomeWorkPt2 {

    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

    public static int factorial (int n) {
        if (n <= 1) {
            return  1 ;
        }
        return  n * factorial(n-1) ;
    }
}
