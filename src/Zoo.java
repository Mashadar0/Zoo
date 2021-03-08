import animals.*;
import food.*;

public class Zoo {

    public static void main(String[] args) {

        Worker worker = new Worker();
        Tiger tiger = new Tiger();
        Duck duck = new Duck();
        Animal shark = new Shark();
        Deer deer = new Deer();
        Eagle eagle = new Eagle();
        Animal elephant = new Elephant();
        Food meat1 = new Meat1();
        Food meat2 = new Meat2();
        Food grass1 = new Grass1();
        Food grass2 = new Grass2();

        System.out.println("Worker feed tiger with meat");
        worker.feed(tiger, meat1);
        System.out.println("Worker feed duck with meat");
        worker.feed(duck, meat2);
        System.out.println("Worker shark shark with grass");
        worker.feed(shark,grass1);
        System.out.println("Worker deer deer with grass");
        worker.feed(deer,grass2);

        System.out.println("Worker make the deer voice");
        worker.getVoice(deer);
        System.out.println("Worker make the duck voice");
        worker.getVoice(duck);
        System.out.println("Worker make the tiger voice");
        worker.getVoice(tiger);
        System.out.println("Worker make the eagle voice");
        worker.getVoice(eagle);

        System.out.println("It's lake. Here we can see that:");
        Swim[] lake = {new Elephant(), new Deer(), new Elephant()};

        for (Swim swim : lake) {
            swim.swim();
        }
        
    }
}
