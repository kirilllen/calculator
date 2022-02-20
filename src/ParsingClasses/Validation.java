package ParsingClasses;

import Exceptions.IncorrectOperatorException;
import Exceptions.WrongSymbolException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static void isValid(String expression) throws WrongSymbolException, IncorrectOperatorException {
        boolean charsOk=isValidChars(expression);
        boolean noRepeatOrNegative=isOperatorsCorrectAndNoNegative(expression);
        if (!charsOk) {
            throw new WrongSymbolException();
        }
        if (!noRepeatOrNegative) {
            throw new IncorrectOperatorException();
        }
    }

    private static boolean isValidChars(String expression){
        //проверка правильности символов
        String regex="\\d+[.]\\d+|\\d+|[+]|[-]|[*]|[/]"; //учитываем целые, дробные чила и знаки операции
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(expression);
        return matcher.replaceAll("").length()==0; //если были "плохие" символы, то строка будет ненулевая
    }

    private static boolean isOperatorsCorrectAndNoNegative(String expression){
        //проверка отсутствия повторения символов друг за другом и отсутствия отрицательных чисел
        String regex="\\d+[.]\\d+[+]|\\d+[+]|" +
                "\\d+[.]\\d+[-]|\\d+[-]|" +
                "\\d+[.]\\d+[*]|\\d+[*]|" +
                "\\d+[.]\\d+[/]|\\d+[/]|"; //учитываем целые, дробные чила и знаки операции
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(expression);
        String lastNumber=matcher.replaceAll(""); //должно остаться последнее число без действия за ним
        String regexLastNumber="\\d+[.]\\d+|\\d+";
        Pattern patternLastNumber=Pattern.compile(regexLastNumber);
        Matcher matcherLastNumber=patternLastNumber.matcher(lastNumber);
        return matcherLastNumber.replaceFirst("").length()==0;
    }

}
