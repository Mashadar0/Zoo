package animals;

import aviary.Size;

public class Eagle extends Carnivorous implements Fly, Voice{

    public Eagle(){}
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

    @Override
    public boolean equals(Object obj) {
        return name.equals((String) obj);
    }
    @Override
    public int hashCode() {
        return (int) name.charAt(0);
    }
}
