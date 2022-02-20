package InputOutput;

import MathLogic.Calculations;

public class Output {

    public static void printResult(String expression){
        System.out.println("Результат вычислений составил: "+Calculations.calculateResult(expression));
    }
}
