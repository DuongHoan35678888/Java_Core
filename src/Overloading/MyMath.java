package Overloading;

public class MyMath {
    public int timMin(int a, int b) {
        if (a < b){
            return a;
        }else {
            return b;
        }
    }
    public double timMin(double a, double b) {
        if (a < b){
            return a;
        }else {
            return b;
        }
    }
    public int tinhTong(int a, int b) {
        return a + b;
    }
    public int tinhTong(int[] arr){
        int tong = 0;
        for (int l = 0; l < arr.length; l++) {
            tong += arr[l];
        }
        return tong;
    }
}
