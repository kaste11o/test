import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner operand1 = new Scanner(System.in);
        while (true){
            System.out.println(" ");
            System.out.println("выберите действие нажав номер операции ");
            System.out.println("1 сложение");
            System.out.println("2 вычетание");
            System.out.println("3 деление");
            System.out.println("4 умножение");
            System.out.println("5 выйти");
            System.out.println("6 повторить");

            double you = operand1.nextInt();

            if (you == 5) {
                break;
            }

            else if (you >= 7){
                System.out.println(" Ответ : Введите число из заданных операции   ");
                System.out.println(" Повтор Меню :   ");
            }
            else if (you <= 0){
                System.out.println(" Ответ : Введите число из заданных операции   ");
                System.out.println(" Повтор Меню :   ");
            }
            else if (you == 1){
                System.out.println("введите число");
                double a = operand1.nextInt();
                System.out.println("Плюс (введите) 2е число");
                double b =operand1.nextInt();
                double c = a + b;
                System.out.println( "результат :" + c );
            }
            else if (you == 2){
                System.out.println("введите число");
                double a = operand1.nextInt();
                System.out.println("Минус (введите) 2е число");
                double b =operand1.nextInt();
                double c = a - b;
                System.out.println( "результат :  " + c );
            }
            else if (you == 3){
                System.out.println("введите число");
                double a = operand1.nextInt();
                System.out.println("Делить на (введите) 2е число");
                double b =operand1.nextInt();
                if ( b == 0) System.out.println(" на нуль не умею делить  ");
                double c = a / b;
                System.out.println( "результат :" + c );
            }
            else if (you == 4){
                System.out.println("введите число");
                double a = operand1.nextInt();
                System.out.println(" Умножить на (введите) 2е число");
                double b =operand1.nextInt();
                double c = a * b;
                System.out.println( "   Результат :" + c );
            }

            else {
                System.out.println( "Не удачей кончился твой ввод, попробуй ЦИферу ввести ты" );
            }
        }
        System.out.println("  Спасибули, поки, чпоки  ");
    }
}
