package Exceptions;

public class IncorrectOperatorException extends Exception{
    public IncorrectOperatorException() {
        super();
        System.out.println("Некорректно расставлены операции (возможен повтор) либо точка в десятичных числах");
    }
}
