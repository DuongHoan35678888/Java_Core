package Interface;

public class Test {
    public static void main(String[] args) {
        System.out.println("Test cau a.");
        MayTinhCasioFX500 mayTinhCasioFX500 = new MayTinhCasioFX500();
        MayTinhVinaCal500 mayTinhVinaCal500 = new MayTinhVinaCal500();

        System.out.println("10 + 15 = " + mayTinhCasioFX500.cong(10, 15));
        System.out.println("4 * 3.14 = " + mayTinhVinaCal500.nhan(4, 3.14));
        System.out.println("5 / 0 = " + mayTinhCasioFX500.chia(5, 0));

        System.out.println("Test cau b.");
        double[] arr1 = new double[] {5,4,7,8,2,14};
        double[] arr2 = new double[] {2,4,8,9,5,11};
        SapXepChen sapXepChen = new SapXepChen();
        SapXepChon sapXepChon = new SapXepChon();
        
        sapXepChen.sapXepTang(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        sapXepChon.sapXepGiam(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        System.out.println("Test cau c.");
        PhanMemMayTinh phanMemMayTinh = new PhanMemMayTinh();
        System.out.println("16 / 4 = " + phanMemMayTinh.chia(16, 4));
        System.out.println("Sap xep giam mang arr2 theo pp sx chen: " );
        phanMemMayTinh.sapXepGiam(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
