package encapsulation;

public class PersonDriver {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Aman");
        p1.setAge(22);
        System.out.println(p1.getName() + " " + p1.getAge());
    }

}
