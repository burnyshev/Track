public class Person {
    protected String name;
    protected boolean gender;
    protected int age;
    Person() {
        name = "defalut";
        gender = true;
        age = 100500;
    }
    Person(String s, boolean g, int a){
        this.name = s;
        this.gender = g;
        this.age = a;
    }
    public void print(){
        if (gender) {
            System.out.println(name + " male " + age);
        }
        else {
            System.out.println(name + " female " + age);
        }
    }
}
