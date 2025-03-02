package ss02;

import java.math.BigInteger;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên lớn thứ nhất: ");
        BigInteger a = new BigInteger(scanner.nextLine());

        System.out.print("Nhập số nguyên lớn thứ hai: ");
        BigInteger b = new BigInteger(scanner.nextLine());

        BigInteger sum = a.add(b); // Cộng
        BigInteger difference = a.subtract(b); // Trừ
        BigInteger product = a.multiply(b); // Nhân
        BigInteger quotient = a.divide(b); // Chia
        BigInteger remainder = a.mod(b); // Chia lấy dư
        BigInteger power = a.pow(10); // Lũy thừa bậc 10

        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + difference);
        System.out.println("Tích: " + product);
        System.out.println("Thương: " + quotient);
        System.out.println("Số dư: " + remainder);
        System.out.println("Lũy thừa bậc 10 của số thứ nhất: " + power);

        scanner.close();
    }
}
