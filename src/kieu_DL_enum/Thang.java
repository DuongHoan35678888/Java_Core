package kieu_DL_enum;

public enum Thang {
    thang1(31),
    thang2(29),
    thang3(31),
    thang4(30),
    thang5(31),
    thang6(30),
    thang7(31),
    thang8(31),
    thang9(31),
    thang10(31),
    thang11(30),
    thang12(31);
    private final int soNgay;

    Thang(int soNgay) {
        this.soNgay = soNgay;
    }
    public int soNgay() {
        return soNgay;
    }
}
