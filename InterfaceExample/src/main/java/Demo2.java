import java.awt.font.TextAttribute;

public class Demo2 {
    public static void main(String[] args) {
        /*Flyable a1 = new Parrot();
        Object a2 = new Parrot();
        Parrot a3 = new Parrot();
        Bird a4 = new Parrot();
        a4.eat();
        Swimable Penguin = new Penguin();
        Penguin.swim();
        a3.fly();
        Duck duck = new Duck();
        duck.swim();*/

        Bird parrot = new Parrot();
        Bird penguin = new Penguin();
        Bird duck = new Duck();

        BirdRepository bird = new BirdRepository();
    }
}
