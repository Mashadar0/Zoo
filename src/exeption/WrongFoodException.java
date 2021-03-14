package exeption;

public class WrongFoodException extends Exception{

    @Override
    public String getMessage() {
        return "Unsuitable food";
    }
}
