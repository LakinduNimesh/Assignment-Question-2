
public class Bird{
    public static void main(String[] args) {
        flyBird eagle = new flyBird();
        eagle.fly("Eagle");
        eagle.buildNest();
        eagle.eat();

        System.out.println();
        Ostrich ostrich = new Ostrich();
        ostrich.run();
        ostrich.eat();
        ostrich.buildNest();


    }
}

abstract class AbstractBird{
    public void buildNest(){
        System.out.println(" Birds are Building nests.");
    }
    public void eat(){
        System.out.println(" Birds are eating.");
    }
}

class flyBird extends AbstractBird{
    public void fly(String bird) {
        System.out.println(" "+ bird + " is Flying...");
    }
}

class Ostrich extends AbstractBird{
    public void run(){
        System.out.println(" Ostriches can't fly.");
        System.out.println(" Ostriches can run fast.");
    }
}

