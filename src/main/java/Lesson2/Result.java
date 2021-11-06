package Lesson2;

public class Result {

    public static void main(String[] args) {

        long summa = summa(3, 5);
        System.out.println(summa);
        long otherSumma = summa(5, 5);
        System.out.println(otherSumma);
        long yetAnotherSumma = summa(2, 18);
        System.out.println(yetAnotherSumma);

        long resultOfMinus = minus(2, 18);
        System.out.println(resultOfMinus);

        long result = multiplyAndSumma(5);
        System.out.println(result);

        long resultOfDivision = division(20,4);
        System.out.println(resultOfDivision);
    }


    public static long summa (int arg1, int arg2) {
      int result = arg1 + arg2;
        return result;
    }

    public static long minus (int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static long multiplyAndSumma (int arg1) {
        int result = 3 * arg1 + 15;
        result = result - 38;
        return result;
    }

    public static long division (int arg1, int arg2) {
        return arg1 / arg2;
    }
}