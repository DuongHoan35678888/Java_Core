package Public_Protected_Private.code;

public class ViDu {
    private Infor infor;
    public void method() {
//      this.infor.a = 1; => not ok
        this.infor.b = 2;   // ok
        this.infor.c = 3;   // ok
        this.infor.d = 4;   // ok
    }
}
