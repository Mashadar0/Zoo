package animals;

import aviary.Size;

public class Eagle extends Carnivorous implements Fly, Voice{

    public Eagle(String name){
        this.name = name;
        animalSize = Size.SMALL;
    }

    public void fly(){
        System.out.println("Eagle is flying");
    }
    public String voice(){
        return "*Сry of the eagle*";
    }
}
