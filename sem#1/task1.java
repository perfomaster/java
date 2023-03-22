import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.print("Ввод n:");
        Scanner term = new Scanner(System.in);
        int num = term.nextInt();

        int sum = 0;
        System.out.print("Вывод суммы до n:");
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        int fact = 1;
        System.out.print("Вывод факториала до n:");
        for (int i = 1; i <= num; i++) {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}