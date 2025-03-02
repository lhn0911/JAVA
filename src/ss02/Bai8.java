package ss02;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------Nhap thong tin sinh vien------------");
        System.out.print("Nhap ma sinh vien: ");
        String maSV = sc.nextLine();

        System.out.print("Nhap ten sinh vien: ");
        String tenSV = sc.nextLine();

        System.out.print("Nhap so dien thoai sinh vien: ");
        String sdt = sc.nextLine();

        System.out.print("Nhap ngay sinh sinh vien (dd/mm/yyyy): ");
        String ngaySinh = sc.nextLine();

        System.out.print("Nhap gioi tinh sinh vien (1: Nam, 0: Nu): ");
        int gioiTinh = sc.nextInt();
        sc.nextLine();

        System.out.println("------------Nhap diem sinh vien------------");
        System.out.print("Nhap diem toan: ");
        double diemToan = sc.nextDouble();

        System.out.print("Nhap diem ly: ");
        double diemLy = sc.nextDouble();

        System.out.print("Nhap diem hoa: ");
        double diemHoa = sc.nextDouble();

        System.out.print("Nhap diem sinh hoc: ");
        double diemSinh = sc.nextDouble();

        System.out.print("Nhap diem ngoai ngu: ");
        double diemNgoaiNgu = sc.nextDouble();

        double diemTrungBinh = (diemToan + diemLy + diemHoa + diemSinh + diemNgoaiNgu) / 5;

        System.out.println("------------Hien thi thong tin sinh vien------------");
        System.out.println("Ma sinh vien: " + maSV + " | Ten sinh vien: " + tenSV + " | Gioi tinh: " + (gioiTinh == 1 ? "Nam" : "Nu"));
        System.out.println("Ngay sinh: " + ngaySinh + " | So dien thoai: " + sdt);
        System.out.println("Diem toan: " + diemToan + " | Diem Vat ly: " + diemLy + " | Diem Hoa hoc: " + diemHoa +
                " | Diem Sinh hoc: " + diemSinh + " | Diem Ngoai ngu: " + diemNgoaiNgu);
        System.out.println("Diem trung binh: " + String.format("%.2f", diemTrungBinh));

        sc.close();
    }
}