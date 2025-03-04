package ss04;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen duong N: ");
        int n = sc.nextInt();

        System.out.println("Cac so Happy tu 1 den " + n + " la:");
        for (int i = 1; i <= n; i++) {
            int num = i;
            int prev = 0, cycle = 0;

            while (num != 1 && num != prev) {
                prev = num;
                int sum = 0;
                while (num > 0) {
                    int digit = num % 10;
                    sum += digit * digit;
                    num /= 10;
                }
                num = sum;
                cycle++;
                if (cycle > 1000) break;
            }

            if (num == 1) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
