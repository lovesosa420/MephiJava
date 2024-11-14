import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое значение: ");
        int oper1 = input.nextInt();

        System.out.print("Введите операцию: ");
        char operation = input.next().charAt(0);

        System.out.print("Введите второе значение: ");
        int oper2 = input.nextInt();

        switch (operation) {
            case '+':
                System.out.printf("Ответ: %d", oper1 + oper2);
                break;
            case '-':
                System.out.printf("Ответ: %d", oper1 - oper2);
                break;
            case '*':
                System.out.printf("Ответ: %d", oper1 * oper2);
                break;
            case '/':
                if (oper2 == 0) {
                    System.out.println("Деление на ноль невозможно!");
                } else {
                    System.out.printf("Ответ: %d", oper1 / oper2);
                }
                break;
            default:
                System.out.println("Введена неизвестная операция!");
        }
    }
}