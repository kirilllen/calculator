package Exceptions;

public class WrongSymbolException extends Exception{
    public WrongSymbolException() {
        super();
        System.out.println("В выражении присутствуют посторонние символы");
    }
}
