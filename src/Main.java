import InputOutput.Input;
import MathLogic.ReversePolishNotation;
import ParsingClasses.Validation;
import MathLogic.ReversePolishNotation;

import java.util.List;

public class Main {

    public static void main (String[] args){
        while(true) {
            String expression = Input.readString();
            System.out.println(Validation.isValid(expression));
            ReversePolishNotation RPN=new ReversePolishNotation();
            List<String> rrr=RPN.getListInReversePolishNotation(expression);
        }
    }
}
