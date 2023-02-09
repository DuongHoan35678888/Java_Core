package Public_Protected_Private.test;

import Public_Protected_Private.code.Infor;

public class Sub_Infor extends Infor {
    private Infor infor;
    public void method() {
//        super.a = 1;      => not ok
//        super.b = 2;      => not ok
        super.c = 3;        // ok
        this.infor.d = 4;   // ok
    }
}
