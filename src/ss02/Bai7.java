package ss02;
import java.util.Scanner;
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gio, phut, giay ban dau: ");
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();

        System.out.print("Nhap gio, phut, giay cong them: ");
        int addHour = sc.nextInt();
        int addMinute = sc.nextInt();
        int addSecond = sc.nextInt();

        int newSecond = second + addSecond;
        int newMinute = minute + addMinute + (newSecond >= 60 ? newSecond / 60 : 0);
        newSecond = newSecond % 60;

        int newHour = hour + addHour + (newMinute >= 60 ? newMinute / 60 : 0);
        newMinute = newMinute % 60;

        System.out.printf("Thoi gian sau khi cong: %02d:%02d:%02d\n", newHour, newMinute, newSecond);
    }
}
