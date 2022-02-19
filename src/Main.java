import InputOutput.Input;
import ParsingClasses.Validation;

public class Main {

    public static void main (String[] args){
        String expression=Input.readString();
        System.out.println(Validation.isValid(expression));
    }
}
