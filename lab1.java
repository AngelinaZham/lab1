import java.util.InputMismatchException;
import java.util.Scanner;

public class lab1 {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            a = sc.nextInt();
            System.out.print("Введите второе число: ");
            b = sc.nextInt();
            System.out.print("Введите третье число: ");
            c = sc.nextInt();
            System.out.print("Введите четвертое число: ");
            d = sc.nextInt();
            sc.close();

        } catch (InputMismatchException e)    {
            System.out.println("Нужно ввести целое число");
            System.exit(1);
        }
        if ((a < b) && (a < c) && (a < d)) {
            System.out.println("Первое число - наименьшее");
        } else if ((b < a) && (b < c) && (b < d)) {
            System.out.println("Второе число - наименьшее");
        } else if ((c < a) && (c < b) && (c < d)) {
            System.out.println("Третье число - наименьшее");
        } else if ((d < a) && (d < b) && (d < c)) {
            System.out.println("Четвертое число - наименьшее");
        }
    }
}