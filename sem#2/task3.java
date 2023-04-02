import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        System.out.print("Ввод первого числа:");
        int num1 = term.nextInt();
        System.out.print("Ввод операции:");
        char oper = term.next().charAt(0);
        System.out.print("Ввод второго числа:");
        int num2 = term.nextInt();
        int res = 0;

        switch(oper) {
            case '+' : res = num1 + num2;break;
            case '-' : res = num1 - num2;break;
            case '/' : res = num1 / num2;break;
            case '*' : res = num1 * num2;break;
        }
        System.out.printf("Вывод результата: %d", res);
    }
}
