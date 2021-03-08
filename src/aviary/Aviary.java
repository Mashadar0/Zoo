package aviary;

import animals.Animal;

import java.util.HashMap;

public class Aviary<An extends Animal> {

    private Size aviarySize;
    private HashMap<String, An> hm = new HashMap<>();

    public Aviary(Size aviarySize){
        this.aviarySize = aviarySize;
    }

    public void setAnimal(An animal){
        if (aviarySize == animal.getAnimalSize()) {
            hm.put(animal.getName(), animal);
            System.out.println(animal.getName() + " added");
        } else {
            System.out.println("Aviary size does not fit for " + animal.getName());
        }
    }

    public void removeAnimal(String name){
        hm.remove(name);
        System.out.println(name + " removed");
    }

    public An getAnimal(String name){
        System.out.println(name + " is in the aviary");
        return hm.get(name);
    }
}
