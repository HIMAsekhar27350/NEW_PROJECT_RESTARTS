package polymorpsim;

public class TestPolymorpsim {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();

        Animal b= new Animal();
        b.sound();
    }
}
