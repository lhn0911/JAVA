package ss04;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Số nhập vào không hợp lệ");
            return;
        } else if (n > 10) {
            System.out.println("Số nhập vào phải trong khoảng từ 1 - 10");
            return;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
