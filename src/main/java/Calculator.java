import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Calculator:\n Type a function using the following: + - / *");
        String function = s.nextLine();

        System.out.println(calculator(function));

    }

    static int calculator(String func){
    String[] function = func.split("");
        int result = 0;
        for (int i=0;i<function.length;i++) {
            if (function[i].equals("+"))
                result += Integer.parseInt(function[i-1]) + Integer.parseInt(function[i+1]);
            if (function[i].equals("-")) {
                result += Integer.parseInt(function[i-1]) - Integer.parseInt(function[i+1]);
            }
            if (function[i].equals("*")) {
                result += Integer.parseInt(function[i-1]) * Integer.parseInt(function[i+1]);
            }
            if (function[i].equals("/")) {
                result += Integer.parseInt(function[i-1]) / Integer.parseInt(function[i+1]);
            }
        }

        return result;
    }
}
