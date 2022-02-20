package MathLogic;

import java.util.Iterator;
import java.util.List;

public class Calculations {
    public static double calculateResult(String expression) {
        double calculationResult=0;
        ReversePolishNotation reversePolishNotation = new ReversePolishNotation();
        List<String> reversePolishNotationInList = reversePolishNotation.getListInReversePolishNotation(expression);

        while (reversePolishNotationInList.contains("+") || reversePolishNotationInList.contains("-") ||
                reversePolishNotationInList.contains("*") || reversePolishNotationInList.contains("/")) {
            Iterator<String> iterator = reversePolishNotationInList.iterator();
            int iteratorCounter = 0;
            boolean calculationDone = false;
            while (iterator.hasNext() && !calculationDone) {
                String symbol = iterator.next();
                switch (symbol) {
                    case "*":
                        calculationResult = Double.parseDouble(reversePolishNotationInList.get(iteratorCounter - 2)) *
                                Double.parseDouble(reversePolishNotationInList.get(iteratorCounter - 1));
                        calculationDone = true;
                        break;
                    case "/":
                        calculationResult = Double.parseDouble(reversePolishNotationInList.get(iteratorCounter - 2)) /
                                Double.parseDouble(reversePolishNotationInList.get(iteratorCounter - 1));
                        calculationDone = true;
                        break;
                    case "+":
                        calculationResult = Double.parseDouble(reversePolishNotationInList.get(iteratorCounter - 2)) +
                                Double.parseDouble(reversePolishNotationInList.get(iteratorCounter - 1));
                        calculationDone = true;
                        break;
                    case "-":
                        calculationResult = Double.parseDouble(reversePolishNotationInList.get(iteratorCounter - 2)) -
                                Double.parseDouble(reversePolishNotationInList.get(iteratorCounter - 1));
                        calculationDone = true;
                        break;
                    default:
                        iteratorCounter++;
                        break;
                }


            }
            // стираем из коллекции совершённую операцию и числа, над которыми была совершена операция
            reversePolishNotationInList.remove(iteratorCounter);
            reversePolishNotationInList.remove(iteratorCounter-1);
            reversePolishNotationInList.remove(iteratorCounter-2);
            //записываем получившееся число обратно в коллекцию для дальнейших вычислений
            reversePolishNotationInList.add(iteratorCounter-2,Double.toString(calculationResult));

            }
        return calculationResult;
    }
}
