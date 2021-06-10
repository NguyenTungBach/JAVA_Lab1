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

        Locale locale = new Locale("vi", "VN");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);

        Scanner scanner= new Scanner(System.in);
            System.out.println("Lương thưởng tháng 13 của một nhân viên.");
            System.out.println("==========================");
            System.out.println("1. Cống hiến dưới 1 năm");
            System.out.println("2. Cống hiến từ 1 năm đến 2 năm");
            System.out.println("3. Cống hiến từ 2 năm đến 5 năm");
            System.out.println("4. Cống hiến từ 5 năm trở lên");
            System.out.println("0. EXIT");
            System.out.println("==========================");

            int choice = scanner.nextInt();
            int luongChinhThuc = 0;
            int thuong = 0;
            switch (choice){
                case 0:
                    System.out.println("Đã thoát");
                    break;
                case 1:
                    System.out.println("Cống hiến dưới 1 năm");
                    luongChinhThuc = 10000000;
                    thuong = 30;
                    System.out.println("Lương Chính Thức = " + luongChinhThuc + " Đồng");
                    System.out.println("Thưởng = " + thuong + " % \n");
                    System.out.println("Lương Tháng 13 = " + format.format(tinh.tinhLuongThuongThang13(luongChinhThuc,thuong)));
                    break;
                case 2:
                    System.out.println("Cống hiến từ 1 năm đến 2 năm");
                    luongChinhThuc = 10000000;
                    thuong = 50;
                    System.out.println("Lương Chính Thức = " + luongChinhThuc + " Đồng");
                    System.out.println("Thưởng = " + thuong + " % \n");
                    System.out.println("Lương Tháng 13 = " + tinh.tinhLuongThuongThang13(luongChinhThuc,thuong) );
                    System.out.println("Lương Tháng 13 = " + format.format(tinh.tinhLuongThuongThang13(luongChinhThuc,thuong)));
                    break;
                case 3:
                    System.out.println("Cống hiến từ 2 năm đến 5 năm");
                    luongChinhThuc = 20000000;
                    thuong = 100;
                    System.out.println("Lương Chính Thức = " + luongChinhThuc + " Đồng");
                    System.out.println("Thưởng = " + thuong + " % \n");
                    System.out.println("Lương Tháng 13 = " + tinh.tinhLuongThuongThang13(luongChinhThuc,thuong) );
                    System.out.println("Lương Tháng 13 = " + format.format(tinh.tinhLuongThuongThang13(luongChinhThuc,thuong)));
                    break;
                case 4:
                    System.out.println("Cống hiến từ 5 năm trở lên");
                    luongChinhThuc = 30000000;
                    thuong = 200;
                    System.out.println("Lương Chính Thức = " + luongChinhThuc + " Đồng");
                    System.out.println("Thưởng = " + thuong + " % \n");
                    System.out.println("Lương Tháng 13 = " + tinh.tinhLuongThuongThang13(luongChinhThuc,thuong) );
                    System.out.println("Lương Tháng 13 = " + format.format(tinh.tinhLuongThuongThang13(luongChinhThuc,thuong)));
                    break;

        }

    }
}
