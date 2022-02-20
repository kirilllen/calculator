import InputOutput.Input;
import MathLogic.Calculations;
import ParsingClasses.Validation;

import java.util.List;

public class Main {

    public static void main (String[] args){
        while(true) {
            String expression = Input.readString();
            System.out.println(Validation.isValid(expression));
            System.out.println("Результат вычислений: "+Calculations.calculateResult(expression));
        }
    }
}
