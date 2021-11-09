package lesson3;

import com.sun.source.util.SourcePositions;

public class HomeWork {

    public static void main(String[] args) {
        double a, b, c;
        double x1, x2;

        a = 0;
        b = 2;
        c = 1;

        double Discriminant = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
        }

        else if (Discriminant < 0) {
            System.out.println("Нет действительных решений уравнения");
        }

        else if (Discriminant > 0){
            x1 = (-b + Math.sqrt(Discriminant))/(2 * a);
            x2 = (-b - Math.sqrt(Discriminant))/(2 * a);
            System.out.printf("x1 = %s x2 = %s", x1 , x2);
        }

        else if (Discriminant == 0) {
            x1 = (-b) / (2 * a);
            System.out.printf("x1 = x2 = %s", x1);
        }
    }
}
