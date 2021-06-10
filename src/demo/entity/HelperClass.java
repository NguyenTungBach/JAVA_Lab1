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

    public int tinhLuongThuongThang13(int luongChinhThuc, int thuong){
        int luongThang13 = 0;
        if (luongChinhThuc == 10000000){
            if (thuong == 30){
                luongThang13 = (int)(luongChinhThuc * 0.3);
            }
            if (thuong == 50){
                luongThang13 = (int)(luongChinhThuc * 0.5);
            }
        }
        if (luongChinhThuc == 20000000){

                luongThang13 = luongChinhThuc * 1;

        }
        if (luongChinhThuc == 30000000){

                luongThang13 = luongChinhThuc * 2;

        }


        return luongThang13;
    }

}
