import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner operand1 = new Scanner(System.in);
        while (true){
            System.out.println("выберите действие нажав номер операции ");
            System.out.println("1 сложение");
            System.out.println("2 вычетание");
            System.out.println("3 деление");
            System.out.println("4 умножение");
            System.out.println("5 выити");
            int result;
            int you = operand1.nextInt();
            char q = 'a';
            Boolean q
            if (you == 5) {
                break;
            }
            else if (you == q ) {
                System.out.println(" Ответ : Введите число из заданных операции   ");
                System.out.println(" Повтор Меню :   ");
            }
            else if (you >= 6){
                System.out.println(" Ответ : Введите число из заданных операции   ");
                System.out.println(" Повтор Меню :   ");
             }
            else if (you <= 0){
                System.out.println(" Ответ : Введите число из заданных операции   ");
                System.out.println(" Повтор Меню :   ");
            }
            else if (you == 1){
                System.out.println("введите число");
                int a = operand1.nextInt();
                System.out.println("введите 2е число");
                int b =operand1.nextInt();
                int c = a + b;
                System.out.println( "результат :" + c );
            }
            else if (you == 2){
                System.out.println("введите число");
                int a = operand1.nextInt();
                System.out.println("введите 2е число");
                int b =operand1.nextInt();
                int c = a - b;
                System.out.println( "результат :  " + c );
            }
            else if (you == 3){
                System.out.println("введите число");
                int a = operand1.nextInt();
                System.out.println("введите 2е число");
                int b =operand1.nextInt();
                int c = a / b;
                System.out.println( "результат :" + c );
            }
            else if (you == 4){
                System.out.println("введите число");
                int a = operand1.nextInt();
                System.out.println("введите 2е число");
                int b =operand1.nextInt();
                if ( b == 0){
                    System.out.println( " на нуль не умею делить  " );
                }
                int c = a * b;
                System.out.println( "   Результат :" + c );
            }
            else {
                System.out.println( "Не удачей кончился твой ввод, попробуй ЦИферу ввести ты" );
            }
        }
        System.out.println("  Спасибули, поки, чпоки  ");
      }
}
