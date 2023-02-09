package Interface;

public class PhanMemMayTinh implements MayTinhBoTui, SapXep{
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
    @Override
    public void sapXepTang(double[] arr) {
        int n = arr.length;
        double key;
        int i, j;
        for (i = 0; i < n; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    @Override
    public void sapXepGiam(double[] arr) {
        int n = arr.length;
        double key;
        int i, j;
        for (i = 0; i < n; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
