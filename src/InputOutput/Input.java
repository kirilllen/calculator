package InputOutput;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner=new Scanner(System.in);

    public static String readString(){
        System.out.println("Введите строку для вычисления");
        return scanner.next();
    }
}
