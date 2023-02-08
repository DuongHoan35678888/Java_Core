package Abstract;

public class HinhChuNhat extends Hinh{
    private double chieuRong, chieuDai;

    public HinhChuNhat(ToaDo toaDo, double x, double y) {
        super(toaDo);
        this.chieuRong = x;
        this.chieuDai = y;
    }

    public double getX() {
        return chieuRong;
    }

    public void setX(double x) {
        this.chieuRong = x;
    }

    public double getY() {
        return chieuDai;
    }

    public void setY(double y) {
        this.chieuDai = y;
    }

    @Override
    public double tinhDienTich() {
        return this.chieuDai*this.chieuRong;
    }
}
