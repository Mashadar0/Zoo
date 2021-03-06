import animals.*;
import food.*;

public class Zoo {

    public static void main(String[] args) {

        Worker worker = new Worker();
        Animal[] animals = {new Deer(), new Duck(), new Eagle(), new Elephant(), new Tiger(), new Shark()};
        Animal[] animalsWithVoice  = {new Deer(), new Duck(), new Eagle(), new Elephant(), new Tiger()};
        Food[] foods = {new Flower(), new Leaf(), new Sprat(), new Steak()};

        for (Animal a :
                animals) {
            for (Food f :
                    foods) {
                System.out.println("Worker feed " + a.getTitle() + " with " + f.getTitle());
                worker.feed(a, f);
            }
            System.out.println("\n");
        }

        for (Animal a :
                animalsWithVoice) {
            System.out.println("Worker make the " + a.getTitle() + "voice");
            worker.getVoice((Voice) a);
        }

        System.out.println("\n");

        System.out.println("It's lake. Here we can see that:");
        Swim[] lake = {new Elephant(), new Deer(), new Elephant()};

        for (Swim swim : lake) {
            swim.swim();
        }
        
    }
}
