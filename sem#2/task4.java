import java.util.Scanner;

import javafx.scene.transform.Scale;

public class task4 {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        System.out.print("Ввод:");

        String str = term.nextLine();
        String parse_q = str.substring(0, str.indexOf("?"));
        String parse_w = str.substring(str.indexOf("+")+2, str.indexOf("="));
        String parse_e = str.substring(str.indexOf("=")+1, str.length());
        // System.out.println(parse_q);
        // System.out.println(parse_w);
        // System.out.println(parse_e);
        int q = Integer.parseInt(parse_q);
        int w = Integer.parseInt(parse_w);
        int e = Integer.parseInt(parse_e);
        int x = 0;
        int y = 0;
        // System.out.println(q);
        // System.out.println(w);
        // System.out.println(e);
        if (q >= 0 & w >= 0 & e >= 0) {
            for (int i = 0; i <= 9; i++) {
                for (int j = 0; j <= 9; j++) {
                    if (((q * 10) + i + (j * 10) + w) == e) {
                        x = i;
                        y = j;
                    }
                }
            }
        } else {
            System.out.println("error - q or w or e < 0");
        }


        System.out.printf("Вывод: %d%d+%d%d=%d", q, x, y, w, e);
    }
}
