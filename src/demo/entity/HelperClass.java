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

    private int tinhLuongChinhThuc(int soNamKinhNghiem){
        int luong =0;
        if (soNamKinhNghiem < 2){
            luong = 10000000;
        }
        if (soNamKinhNghiem >= 2 && soNamKinhNghiem <= 5){
            luong = 20000000;
        }
        if (soNamKinhNghiem > 5 ){
            luong = 30000000;
        }

        return luong;
    }

    private double tinhPhanTramLuong(double soNamCongHien){
        double phanTram = 0;
        if (soNamCongHien < 1){
            phanTram = 0.3;
        }
        if (soNamCongHien >=1 && soNamCongHien <=2 ){
            phanTram = 0.5;
        }
        if (soNamCongHien >=2 && soNamCongHien <=5 ){
            phanTram = 1;
        }
        if (soNamCongHien > 5 ){
            phanTram = 2;
        }

        return phanTram;
    }

    public int tinhLuongThuongThang13(int soNamKinhNghiem, double soNamCongHien){
        int luongThang13 = (int) (tinhLuongChinhThuc(soNamKinhNghiem) * tinhPhanTramLuong(soNamCongHien)) + tinhLuongChinhThuc(soNamKinhNghiem);
        return luongThang13;
    }

    private boolean kiemTraCacCanh(int a, int b , int c){
        boolean kt = false;
        if (a <= 0 || b <= 0 || c <= 0){
            kt = true;
        }
        return kt;
    }

    private boolean kiemTraBatDangThucTamGiac(int a, int b , int c){
        boolean kt = false;
        if(a+b <=c || a+c <=b || b+c <=a){
            kt = true;
        }
        return kt;
    }

    public double tinhNuaChuViTamGiac(int a, int b , int c){
//        kiemTraCacCanh(a,b,c);
//        kiemTraBatDangThucTamGiac(a,b,c);
        double nuaChuViTamGiac = 0;
        if (kiemTraCacCanh(a,b,c)){
            System.out.println("Độ dài một cạnh tam giác không thể nhỏ hơn hoặc bằng 0");
        }
        if (kiemTraBatDangThucTamGiac(a,b,c)){
            System.out.println("Tổng hai cạnh của một tam giác luôn phải lớn hơn cạnh còn lại (Theo bất đẳng thức tam giác)");
        }
        else {
            nuaChuViTamGiac = (double) (a+b+c)/2;
        }
        return  nuaChuViTamGiac;
    }


    private int timSoLonNhat(int[] number){
        int max = number[0];
        for (int i = 0; i < number.length; i++){
            if (number[i] > max){
                max = number[i];
            }
        }
        return max;
    }

    private int timSoNhoNhat(int[] number){
        int min = number[0];
        for (int i = 0; i < number.length; i++){
            if (number[i] < min ){
                min = number[i];
            }
        }
        return min;
    }

    public void timMaxMin(int[] arr){
        int max = timSoLonNhat(arr);
        int min = timSoNhoNhat(arr);
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] > max){
//                max = arr[i];
//            }
//        }
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] < min ){
//                min = arr[i];
//            }
//        }
        System.out.println("Số lớn nhất : " + max);
        System.out.println("Số bé nhất : " + min);
    }



}
