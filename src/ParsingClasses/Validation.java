package ParsingClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static boolean isValid(String expression) {
        //вызвать все методы
        String regex="\\d+|\\d+.\\d+|[+{1}]|[-{1}]|[*{1}]|[/{1}]"; //учитываем целые, дробные чила и знаки операции
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(expression);
        return matcher.replaceAll("").length()==0; //если остались другие символы, то строка будет ненулевая
    }

    public boolean isValidChars(String expression){
        //проверка правильных символов
        return false;
    }

    public boolean isOperatorsCorrect(String expression){
        //проверка отсутствия повторения символов друг за другом и точки в нужных местах
        return false;
    }

    public boolean noNegativeNumbers(String expression) {
        //проверка отсутствия отрицательных чисел
        return false;
    }
}
