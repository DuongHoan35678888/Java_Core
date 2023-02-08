package Overloading;

public class Test {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        System.out.println("Tim min(4, 5): " + myMath.timMin(4, 5));
        System.out.println("Tim min(4.2, 2.5): " + myMath.timMin(4.2, 2.5));
        System.out.println("Tong cua 9 va 10 = " + myMath.tinhTong(9, 10));
        int arr[] = new int[] {1,2,3,4,5};
        System.out.println("Tong cua mang arr = " + myMath.tinhTong(arr));
    }
}
