package Abstract_Classes_And_Interfaces.Abstract_Class;


interface A {
    default void doSome() {
        System.out.println("A");
    }
}

interface B {
    default void doSome() {
        System.out.println("B");
    }
}

class C implements A, B {
    @Override
    public void doSome() {
        B.super.doSome();;
    }
}

public class Test {
    public static void main(String[] args) {
        B b=new C();
        b.doSome();
    }
}
