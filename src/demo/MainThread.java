package demo;

import demo.entity.HelperClass;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        HelperClass tinh = new HelperClass();

//        double q = tinh.tinhTrungBinhCong(1, 2, 3);
//        System.out.println("Trung bình cong 3 so" + " 1," + " 2, " + "3 " + " la " + q );
//        System.out.printf("Trung bình cong 3 so 1, 2,  3 la %f \n", q);
//
//        double g = tinh.tinhChuViHinhTron(2);
//        System.out.println("Chu vi là: " + g);

        // Lab 1: Tính lương tháng

        Locale locale = new Locale("vi", "VN");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);

        Scanner scanner= new Scanner(System.in);
        // Lab 1: Tính lương tháng
        System.out.println("Bài Lab1: Lương thưởng tháng 13 của một nhân viên.");
        System.out.println("Nhập số năm kinh nghiệm");
        int soNamKinhNghiem = scanner.nextInt();
        System.out.println("Nhập số năm cống hiến");
        double soNamCongHien = scanner.nextDouble();
        System.out.println("Lương tháng 13 là " + format.format(tinh.tinhLuongThuongThang13( soNamKinhNghiem, soNamCongHien)) + "\n");

        // Lab 1.2: Viết chương trình tính nửa chu vi tam giác
        System.out.println("Lab 1.2: Tính nửa chu vi tam giác");
        System.out.println("Nhập cạnh a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập cạnh b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập cạnh c: ");
        int c = scanner.nextInt();

//        if (a <= 0 || b <= 0 || c <= 0){
//            System.out.println("Độ dài một cạnh tam giác không thể nhỏ hơn hoặc bằng 0");
//        }
//        else if(a+b <=c || a+c <=b || b+c <=a){
//            System.out.println("Tổng hai cạnh của một tam giác luôn phải lớn hơn cạnh còn lại (Theo bất đẳng thức tam giác)");
//        }
//        else{
//            System.out.printf("Nửa Chu vi tam giác là:  %.2f \n \n", tinh.tinhNuaChuViTamGiac(a,b,c));
//        }
        System.out.printf("Nửa Chu vi tam giác là:  %.2f \n \n", tinh.tinhNuaChuViTamGiac(a,b,c));

        // Lab 1.3: Viết chương trình tìm số lớn nhất và nhỏ nhất trong một mảng các số nguyên
        int[] arr = {0,1, 2, 5, 4, 3};
        System.out.println("Mảng là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        tinh.timMaxMin(arr);
    }
}
