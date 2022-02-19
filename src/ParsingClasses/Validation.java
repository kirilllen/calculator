package ParsingClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static boolean isValid(String expression) {
        boolean charsOk=isValidChars(expression);
        boolean noRepeatOrNegative=isOperatorsCorrectAndNoNegative(expression);
        return charsOk&&noRepeatOrNegative;
    }

    private static boolean isValidChars(String expression){
        //проверка правильности символов
        String regex="\\d+|\\d+[.]\\d+|[+]|[-]|[*]|[/]"; //учитываем целые, дробные чила и знаки операции
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(expression);
        return matcher.replaceAll("").length()==0; //если были "плохие" символы, то строка будет ненулевая
    }

    private static boolean isOperatorsCorrectAndNoNegative(String expression){
        //проверка отсутствия повторения символов друг за другом и отсутствия отрицательных чисел
        String regex="\\d+[+]|\\d+[.]\\d+[+]|\\d+[-]|\\d+[.]\\d+[-]|\\d+[*]|\\d+[.]\\d+[*]|\\d+[/]|\\d+[.]\\d+[/]|\\d+|\\d+[.]\\d+"; //учитываем целые, дробные чила и знаки операции
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(expression);
        return matcher.replaceAll("").length()==0;
    }

}
