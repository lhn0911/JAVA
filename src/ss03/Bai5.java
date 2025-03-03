package ss03;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        double num1 = scanner.nextDouble();

        System.out.print("Nhap phep toan (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        System.out.print("Nhap so thu hai: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean validOperation = true;

        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            if (num2 == 0) {
                System.out.println("Khong the chia cho 0.");
                validOperation = false;
            } else {
                result = num1 / num2;
            }
        } else {
            System.out.println("Phep toan khong hop le.");
            validOperation = false;
        }

        if (validOperation) {
            System.out.println("Ket qua: " + result);
        }

    }
}
