package ss04;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhap mot so nguyen duong N: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("So nhap vao khong hop le. Vui long nhap lai!");
            }
        } while (n <= 0);

        System.out.println("Cac so Palindrome tu 1 den " + n + " la:");

        for (int i = 1; i <= n; i++) {
            int num = i, reversed = 0, original = i;

            while (num > 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }

            if (original == reversed) {
                System.out.print(original + " ");
            }
        }
        sc.close();
    }
}
