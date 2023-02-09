package Public_Protected_Private.test;

import Public_Protected_Private.code.Infor;

public class Test {
    private Infor infor;
    public void method() {
//        this.infor.a = 1; => not ok
//        this.infor.b = 2; => not ok
//        this.infor.c      => not ok
        this.infor.d = 4;   // ok
    }
}
