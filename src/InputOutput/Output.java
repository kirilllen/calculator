package InputOutput;

import Exceptions.DivideByZeroException;
import MathLogic.Calculations;

public class Output {

    public static void printResult(String expression) throws DivideByZeroException {
        System.out.println("Результат вычислений составил: "+Calculations.calculateResult(expression));
    }
}
