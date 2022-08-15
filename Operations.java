import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an 2 num expression like 2 + 3:  ");
        double firstNum = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        double secondNum = scanner.nextDouble();
        double result = 0;
        scanner.close();

        if (operator == '+') {
            result = firstNum + secondNum;
        }
        else if(operator == '-') {
            result = firstNum - secondNum;
        }
        else if(operator == '*') {
            result = firstNum * secondNum;
        }
        else if(operator == '/') {
            result = firstNum / secondNum;
        }
        else {
            System.out.println("Please type valid input");
        }
        System.out.println(result);
    }
}
