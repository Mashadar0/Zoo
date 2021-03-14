package aviary;

import animals.Animal;

import java.util.HashMap;

public class Aviary<An> {

    private Size aviarySize;
    private AnimalDiet animalDietAviary;
    private HashMap<String, An> hm = new HashMap<>();

    public Aviary(Size aviarySize){
        this.aviarySize = aviarySize;
    }

    public void setAnimal(String name, An object){
        if (object instanceof Animal) {
            Animal animal = (Animal) object;
            if (animalDietAviary != null) {
                if (aviarySize == animal.getAnimalSize()) {
                    if (animal.getAnimalDiet() == animalDietAviary) {
                        hm.put(animal.getName(), object);
                        System.out.println(animal.getName() + " added");
                    }else {
                        System.out.println("Aviary diet does not fit for " + animal.getName());
                    }
                } else {
                    System.out.println("Aviary size does not fit for " + animal.getName());
                }
            }else {
                hm.put(animal.getName(), object);
                System.out.println(animal.getName() + " added");
                animalDietAviary = animal.getAnimalDiet();
            }
        } else {
            hm.put(name, object);
            System.out.println(name + " added");
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
