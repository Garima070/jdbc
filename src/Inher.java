
class Animal{
    void bark()
    {
        System.out.println("barking");
    }
}
class Dog extends Animal{
    void eat()
    {
        System.out.println("eating");
    }
}
class Babydog extends Dog{
    void baby()
    {
        System.out.println("baby dog");
    }
}
public class Inher {
    public static void main(String[] args)
    {
        Babydog d=new Babydog();
        d.eat();
        d.bark();
        d.baby();
    }
}

