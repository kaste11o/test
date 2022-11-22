import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" введите число");
        float a = s.nextInt();
        System.out.println(a + "введите метод  ");
        String string = new String();
        string = String.valueOf(s.nextInt());
        System.out.println(a+ string + " введите Второе число");
        float c = s.nextInt();
        float d = Float.parseFloat(a + string + c);
        System.out.println("ответ :" + d);


        }
    }
