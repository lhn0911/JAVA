package ss04;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("N khong hop le");
            return;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + "=" + (n * i));
        }
    }
}
