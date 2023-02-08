package Abstract;

public class Test {
    public static void main(String[] args) {
        ToaDo toaDo1 = new ToaDo(2,4);
        ToaDo toaDo2 = new ToaDo(5,8);
        ToaDo toaDo3 = new ToaDo(3,12);

//      Hinh hinh = new Hinh(toaDo1); => Lỗi biên dịch
        Hinh hinh1 = new Diem(toaDo1);
        Hinh hinh2 = new HinhTron(toaDo2, 4);
        Hinh hinh3 = new HinhChuNhat(toaDo3, 7, 15);

        System.out.println("Dien tich diem = " + hinh1.tinhDienTich());
        System.out.println("Dien tich hinh tron = " + hinh2.tinhDienTich());
        System.out.println("Dien tich hinh chu nhat = " + hinh3.tinhDienTich());
    }
}
