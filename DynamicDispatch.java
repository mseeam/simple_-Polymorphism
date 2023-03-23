class A{
    void callme(){
        System.out.println("Inside A's call me methos");
    }void callprintA(){
        System.out.println("call print in A");
    }
}


class B extends A{
    void callme(){
        System.out.println("Inside B's call me method");
    }void callprintB(){
        System.out.println("Call print in B");
    }
}

class C extends A{
    void callme(){
        System.out.println("Inside C's call me method");
    }void callprintC(){
        System.out.println("Call print in C");
    }
}


public class DynamicDispatch{

    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();

        //Dynamic method dispatch or mathod override
        A r;

        r=a;
        r.callme();
        r.callprintA();

        r=b;
        b.callme();
        b.callprintB();

        r=c;
        // The below commented lines won't work 
        // r.callme();
        // r.callprintC();
        c.callme();
        c.callprintC();
    }

}