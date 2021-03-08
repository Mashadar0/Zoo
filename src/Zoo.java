import animals.*;
import aviary.Aviary;
import aviary.Size;
import food.*;

public class Zoo {

    public static void main(String[] args) {

        Worker worker = new Worker();
        Tiger tiger = new Tiger("Tiger");
        Duck duck = new Duck("Duck");
        Animal shark = new Shark("Shark");
        Deer deer = new Deer("Deer");
        Eagle eagle = new Eagle("Eagle");
        Animal elephant = new Elephant("Elephant");
        Food meat1 = new Meat1();
        Food meat2 = new Meat2();
        Food grass1 = new Grass1();
        Food grass2 = new Grass2();

        System.out.println("Worker feed tiger with meat");
        worker.feed(tiger, meat1);
        System.out.println("Worker feed duck with meat");
        worker.feed(duck, meat2);
        System.out.println("Worker feed shark with grass");
        worker.feed(shark,grass1);
        System.out.println("Worker feed deer with grass");
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
        Swim[] lake = {new Elephant("Elephant1"), new Deer("Deer1"), new Elephant("Elephant2")};

        for (Swim swim : lake) {
            swim.swim();
        }

        System.out.println("First aviary");
        Aviary<Carnivorous> carnivorousAviary = new Aviary<>(Size.MEDIUM);
        carnivorousAviary.setAnimal(new Tiger("Cucumber"));
        carnivorousAviary.setAnimal(new Tiger("Carrot"));
        carnivorousAviary.setAnimal(new Eagle("Tomato"));
        carnivorousAviary.removeAnimal("Cucumber");
        carnivorousAviary.getAnimal("Carrot");

        System.out.println("Second aviary");
        Aviary<Herbivore> herbivoreAviary = new Aviary<>(Size.LARGE);
        herbivoreAviary.setAnimal(new Elephant("Buratino"));
        herbivoreAviary.setAnimal(new Deer("Valera"));
    }
}
