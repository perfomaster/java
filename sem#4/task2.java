public class task2 {
    public static void main(String[] args){
        for (int n = 1; n <= 1000; n++) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            // System.out.printf("%d - %d \n ", n, count);
            if (count <= 2) {
                System.out.printf("%d", n);
                if (n < 1000) System.out.printf(", ");
            }
        }
    }
}
