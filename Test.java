class A{
    String name;

    void m(){
        System.out.println("Inside m method");
    }

    void n(){
        System.out.println("Inside n method");
        this.m();
    }
}

public class Test{
    public static void main(String[] args) {
        A a = new A();
        
        a.n();
    }
}