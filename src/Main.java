import InputOutput.Input;
import InputOutput.Output;
import MathLogic.Calculations;
import ParsingClasses.Validation;

import java.util.List;

public class Main {

    public static void main (String[] args){
        while(true) {
            String expression = Input.readString();
            if (Validation.isValid(expression)) {
                Output.printResult(expression);
            }

        }
    }
}
