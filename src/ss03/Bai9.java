package ss03;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap mot so (100-999): ");
        int num = sc.nextInt();

        if (num < 100 || num > 999) {
            System.out.println("So nhap vao khong hop le");
        } else {
            int hundreds = num / 100;
            int tens = (num % 100) / 10;
            int units = num % 10;

            String[] ones = {"", "Mot", "Hai", "Ba", "Bon", "Nam", "Sau", "Bay", "Tam", "Chin"};
            String[] tensNames = {"", "Muoi", "Hai muoi", "Ba muoi", "Bon muoi", "Nam muoi", "Sau muoi", "Bay muoi", "Tam muoi", "Chin muoi"};

            System.out.print(ones[hundreds] + " tram ");

            if (tens == 0 && units == 0) {
                System.out.println();
            } else if (tens == 0) {
                System.out.println("le " + ones[units]);
            } else {
                System.out.println(tensNames[tens] + " " + ones[units]);
            }
        }
    }
}
