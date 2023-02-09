package Public_Protected_Private.code;

public class Infor {
    private int a;
    int b;
    protected int c;
    public int d;
    public void method() {
        this.a = 1; // ok
        this.b = 2; // ok
        this.c = 3; // ok
        this.d = 4; // ok
    }
}
