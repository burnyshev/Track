
public class Main {

    public static void main(String[] args) {
        Person a = new Person("mother", false, 35);
        Person b = new Person("father", true, 45);
        a.print();
        b.print();
        Child c = new Child("masha", false, 12);
        Child d = new Child("sasha", true, 10);
        Child j = new Child();
        c.print();
        d.print();
        j.print();
    }
}
