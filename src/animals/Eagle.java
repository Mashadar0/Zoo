package animals;

import aviary.Size;

public class Eagle extends Carnivorous implements Fly, Voice{

    public Eagle(String name){
        this.name = name;
        animalSize = Size.SMALL;
    }
    public String getTitle(){
        return "Eagle";
    }

    public void fly(){
        System.out.println("Eagle is flying");
    }
    public void soar(){
        System.out.println("Eagle is soars");
    }
    public String voice(){
        return "*Сry of the eagle*";
    }
    public void sounds(){
        System.out.println("*eagle sounds*");
    }
}
