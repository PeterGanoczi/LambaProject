package sk.itsovy.ganoczi.lamba;

public abstract class Test {

    public int operate(int a, int b, myInterface op) {
        return op.myFunction(a,b);

    }

    interface myInterface{
        int myFunction(int a, int b);
    }

    public static void main(String[] args) {
        Test t=new Test() {
            @Override
            public int operate(int a, int b, myInterface op) {
                return 0;
            }
        };
    }
}
