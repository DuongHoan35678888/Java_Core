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

        // ham compareTo => so sanh > < =
        String sv1 = "Tran Thi Mai";
        String sv2 = "Nguyen Quynh Chau";
        String sv3 = "Chu Hoa Hoa";
        String sv4 = "Tran Thi Mai";
        System.out.println("sv1 CompareTo sv2: " + sv1.compareTo(sv2));
        System.out.println("sv2 CompareTo sv3: " + sv2.compareTo(sv3));
        System.out.println("sv1 CompareTo sv4: " + sv1.compareTo(sv4));

        // ham compareToIgnoreCase, giong ham compareTo nhung ko phan biet chu hoa chu thuong
    }
}
