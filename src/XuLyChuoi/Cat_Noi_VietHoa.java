package XuLyChuoi;

public class Cat_Noi_VietHoa {
    public static void main(String[] args) {
        String s1 = "Hoan ";
        String s2 = "Dep Trai";
        String s3 = s1 + s2;

        // Ham concat => nối 2 chuỗi
        String s4 = s1.concat(s2);
        System.out.println("S3 = " + s3);
        System.out.println("S4 = " + s4);

        // Ham replace => thay thế
        String s5 = "vui tinh ";
        String s6 = s5.replaceAll("tinh", "ve");
        System.out.println("S6 = " + s6);

        // toLowerCase => chuyển về viết thường
        // toUpperCase => chuyển về viết hoa
        String s7 = s3.toLowerCase();
        String s8 = s4.toUpperCase();
        System.out.println("s7 = " + s7);
        System.out.println("s8 = " + s8);

        // Hàm trim() => xóa khoảng trống dư thừa ở đầu, cuối chuỗi
        String s9 = "  Xin chao cac ban!    ";
        System.out.println(s9.trim());

        // Hàm subString() => cắt chuỗi con
        String s10 = "Ket thuc su doc than cua em di!";
        String s11 = s10.substring(8);
        String s12 = s10.substring(8, 12);
        System.out.println("S11 = " + s11);
        System.out.println("S12 = " + s12);
    }
}
