import Exceptions.DivideByZeroException;
import Exceptions.IncorrectOperatorException;
import Exceptions.WrongSymbolException;
import InputOutput.Input;
import InputOutput.Output;
import ParsingClasses.Validation;

public class Main {

    public static void main (String[] args) throws WrongSymbolException, IncorrectOperatorException, DivideByZeroException {
       String expression = Input.readString();
       Validation.isValid(expression);
       Output.printResult(expression);
    }
}
