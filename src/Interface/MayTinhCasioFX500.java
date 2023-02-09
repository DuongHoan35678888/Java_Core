package Interface;

public class MayTinhCasioFX500 implements MayTinhBoTui{

    @Override
    public double cong(double a, double b) {
        return a + b;
    }

    @Override
    public double tru(double a, double b) {
        return a - b;
    }

    @Override
    public double nhan(double a, double b) {
        return a * b;
    }

    @Override
    public double chia(double a, double b) {
        try{
            return a / b;
        }catch (Exception ex){
            System.out.println("Error!");
        }
        return a / b;
    }
}
