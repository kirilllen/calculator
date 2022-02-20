package MathLogic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReversePolishNotation {

    public List<String> getListInReversePolishNotation(String expression) {
        List<MathOperations> stack=new ArrayList<>();
        List<String> finalString=new ArrayList<>();
        int counterFinalString=0; //счётчики для обращений
        int counterStack=0;

        List<String> numbersAndOperations=getNumbersAndOperations(expression);
        Iterator<String> iterator=numbersAndOperations.iterator();
        while (iterator.hasNext()) {
            String symbol=iterator.next();
            switch (symbol) {
                case "*":
                    if (counterStack!=0 &&stack.get(counterStack-1).getPriority()>=MathOperations.MULTIPLY.getPriority()) {
                        finalString.add(stack.get(counterStack-1).toString());
                        counterFinalString++;
                        stack.remove(counterStack-1);
                        counterStack--;
                    }
                    stack.add(MathOperations.MULTIPLY);
                    counterStack++;
                    break;
                case "/":
                    if (counterStack!=0 &&stack.get(counterStack-1).getPriority()>=MathOperations.DIVIDE.getPriority()) {
                        finalString.add(stack.get(counterStack-1).toString());
                        counterFinalString++;
                        stack.remove(counterStack-1);
                        counterStack--;
                    }
                    stack.add(MathOperations.DIVIDE);
                    counterStack++;
                    break;
                case "+":
                    if (counterStack!=0 &&stack.get(counterStack-1).getPriority()>=MathOperations.ADD.getPriority()) {
                        finalString.add(stack.get(counterStack-1).toString());
                        counterFinalString++;
                        stack.remove(counterStack-1);
                        counterStack--;
                    }
                    stack.add(MathOperations.ADD);
                    counterStack++;
                    break;
                case "-":
                    if (counterStack!=0 &&stack.get(counterStack-1).getPriority()>=MathOperations.SUBTRACT.getPriority()) {
                        finalString.add(stack.get(counterStack-1).toString());
                        counterFinalString++;
                        stack.remove(counterStack-1);
                        counterStack--;
                    }
                    stack.add(MathOperations.SUBTRACT);
                    counterStack++;
                    break;
                default:
                    finalString.add(symbol);
                    counterFinalString++;
                    break;
            }
        }
        while (!stack.isEmpty()){
            finalString.add(stack.get(counterStack-1).toString());
            stack.remove(counterStack-1);
            counterStack--;
        }
        return finalString;
    }

    private List<String> getNumbersAndOperations(String expression){
        List<String> numbersAndOperations=new ArrayList<>();

        String regex="\\d+[.]\\d+|\\d+|[+]|[-]|[*]|[/]"; //учитываем целые, дробные чила и знаки операции
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(expression);
        while(matcher.find()){
            numbersAndOperations.add(matcher.group());
        }
        return numbersAndOperations;
    }
}
