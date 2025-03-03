package ss03;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thang (1-12): ");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("Thang 1: 31 ngay");
                break;
            case 2:
                System.out.println("Thang 2: 28 hoac 29 ngay");
                break;
            case 3:
                System.out.println("Thang 3: 31 ngay");
                break;
            case 4:
                System.out.println("Thang 4: 30 ngay");
                break;
            case 5:
                System.out.println("Thang 5: 31 ngay");
                break;
            case 6:
                System.out.println("Thang 6: 30 ngay");
                break;
            case 7:
                System.out.println("Thang 7: 31 ngay");
                break;
            case 8:
                System.out.println("Thang 8: 31 ngay");
                break;
            case 9:
                System.out.println("Thang 9: 30 ngay");
                break;
            case 10:
                System.out.println("Thang 10: 31 ngay");
                break;
            case 11:
                System.out.println("Thang 11: 30 ngay");
                break;
            case 12:
                System.out.println("Thang 12: 31 ngay");
                break;
            default:
                System.out.println("Thang khong hop le.");
        }

    }
}
