package demo.entity;

public class HelperClass {
    public double tinhTrungBinhCong(int a, int b, int c){
        double d =  (a+b+c)/3;
        return d;
    }

    public double tinhChuViHinhTron(double r){
        double chuvi =  r*3.14;
        return chuvi;
    }

    public int tinhLuongThuongThang13(int soNamKinhNghiem, double soNamCongHien){
        int luongThang13 = 0;
        int luong = 0;
        if (soNamKinhNghiem < 2 ){
            luong = 10000000;
            if (soNamCongHien < 1){
                luongThang13 = (int) (luong * 0.3);
            }
            if (soNamCongHien >=1 && soNamCongHien <=2 ){
                luongThang13 = (int) (luong * 0.5);
            }
            if (soNamCongHien >=1 && soNamCongHien <=2 ){
                luongThang13 = luong;
            }
            if (soNamCongHien > 5 ){
                luongThang13 = luong * 5;
            }
        }
        if (soNamKinhNghiem >= 2 && soNamKinhNghiem <= 5){
            luong = 20000000;
            if (soNamCongHien <1){
                luongThang13 = (int) (luong * 0.3);
            }
            if (soNamCongHien >=1 && soNamCongHien <=2 ){
                luongThang13 = (int) (luong * 0.5);
            }
            if (soNamCongHien >=1 && soNamCongHien <=2 ){
                luongThang13 = luong;
            }
            if (soNamCongHien > 5 ){
                luongThang13 = luong * 5;
            }
        }
        if (soNamKinhNghiem > 5 ){
            luong = 30000000;
            if (soNamCongHien <1){
                luongThang13 = (int) (luong * 0.3);
            }
            if (soNamCongHien >=1 && soNamCongHien <=2 ){
                luongThang13 = (int) (luong * 0.5);
            }
            if (soNamCongHien >=1 && soNamCongHien <=2 ){
                luongThang13 = luong;
            }
            if (soNamCongHien > 5 ){
                luongThang13 = luong * 5;
            }
        }
        return luongThang13;
    }

    public double tinhNuaChuViTamGiac(int a, int b , int c){
        return  (double) (a+b+c)/2;
    }

    public void timMaxMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min ){
                min = arr[i];
            }
        }
        System.out.println("Số lớn nhất : " + max);
        System.out.println("Số bé nhất : " + min);
    }

}
