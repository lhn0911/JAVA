package ss04;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhap mot so nguyen duong N: ");
            while (!sc.hasNextInt()) {
                System.out.println("So nhap vao khong hop le. Vui long nhap lai!");
                sc.next();
            }
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("So nhap vao khong hop le. Vui long nhap lai!");
            }
        } while (n <= 0);

        System.out.println("Cac so Armstrong tu 1 den " + n + " la:");

        for (int i = 1; i <= n; i++) {
            int num = i, sum = 0, temp = i, digits = 0;

            while (temp > 0) {
                temp /= 10;
                digits++;
            }

            temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                int power = 1;

                for (int j = 0; j < digits; j++) {
                    power *= digit;
                }

                sum += power;
                temp /= 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}
