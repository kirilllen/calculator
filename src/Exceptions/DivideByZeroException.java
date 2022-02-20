package Exceptions;

public class DivideByZeroException extends Exception{
    public DivideByZeroException() {
        super();
        System.out.println("В выражении присутствует деление на ноль. Перезапустите калькулятор");
    }
}
