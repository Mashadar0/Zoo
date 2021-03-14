package animals;

import aviary.Size;

public class Deer extends Herbivore implements Run, Swim, Voice{

    public Deer(){}
    public Deer(String name){
        this.name = name;
        animalSize = Size.MEDIUM;
    }
    public String getTitle(){
        return "Deer";
    }

    public void run(){
        System.out.println("Deer is running");
    }
    public void walk(){
        System.out.println("Deer is walking");
    }
    public void swim(){
        System.out.println("Deer is swimming");
    }
    public void dive(){
        System.out.println("Deer is diving");
    }
    public String voice(){
        return "*deer screams*";
    }
    public void sounds(){
        System.out.println("*deer sounds*");
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
