abstract class Human {
    Human() {
        System.out.println("Constructor is Running!");
    }

    abstract void eat();

    abstract void walk();

    void breathing() {
        System.out.println("Breathing!");
    }
}
class Man extends Human {
    @Override
    void eat() {
        System.out.println("Anything Eat!");
    }

    @Override
    void walk() {
        System.out.println("Any Kind of walk!");
    }

    @Override
    void breathing() {
        super.breathing();
        System.out.println("Lab Dab!!!!");
    }
}
class Anupa extends Man {
    @Override
    void breathing() {
        super.breathing();
        System.out.println("Anupa Breathing!");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Eating Food!");
    }

    @Override
    void walk() {
        super.walk();
        System.out.println("Running!");
    }
}
class Running {
    public static void main(String[] args) {
        Human h = new Man();
        Human h1 = new Anupa();
        Man n = new Anupa();
        h.eat();
        h.walk();
        h.breathing();
        h1.walk();
        h1.eat();
        h1.breathing();
        n.eat();
        n.walk();
        n.breathing();
    }
}