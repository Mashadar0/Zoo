package animals;

import aviary.Size;

public class Shark extends Carnivorous implements Swim {

    public Shark(){}
    public Shark(String name){
        this.name = name;
        animalSize = Size.MEDIUM;
    }


    public String getTitle(){
        return "Shark";
    }

    public void swim(){
        System.out.println("Shark is swimming");
    }
    public void dive(){
        System.out.println("Shark is diving");
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
