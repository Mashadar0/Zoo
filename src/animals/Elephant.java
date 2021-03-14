package animals;

import aviary.Size;

public class Elephant extends Herbivore implements Run, Swim, Voice{

    public Elephant(){}
    public Elephant(String name){
        this.name = name;
        animalSize = Size.LARGE;
    }

    public String getTitle(){
        return "Elephant";
    }

    public void run(){
        System.out.println("Elephant is running");
    }
    public void walk(){
        System.out.println("Elephant is walking");
    }
    public void swim(){
        System.out.println("Elephant is swimming");
    }
    public void dive(){
        System.out.println("Elephant is diving");
    }
    public String voice(){
        return "*loud elephant sounds*";
    }
    public void sounds(){
        System.out.println("*elephant sounds*");
    }

    @Override
    public boolean equals(Object obj) {
        return name.equals((String) obj);
    }
    @Override
    public int hashCode() {
        return (int) name.charAt(0);
    }
}
