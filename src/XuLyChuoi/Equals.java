package XuLyChuoi;

public class Equals {
    public static void main(String[] args) {
        String string1 = "hoan";
        String string2 = "HOAN";
        String string3 = "Men";

        // ham equals => so sanh 2 chuoi giong nhau, co phan biet chu hoa chu thuong
        System.out.println("So sanh chuoi string1 voi string2: " + string1.equals(string2));

        // ham equalsIgnoreCase => so sanh 2 chuoi giong nhau, khong phan biet chu hoa chu thuong
        System.out.println("So sanh chuoi string1 voi string2: " + string1.equalsIgnoreCase(string2));
    }
}
