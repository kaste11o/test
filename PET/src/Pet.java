import java.util.Scanner;

public class Pet {
    int age;
    float weight;
    float height;
    String color;
    Scanner scanner = new Scanner(System.in);
    Scanner eat = scanner;
    public void sleep(){
        System.out.println("Спокойной ночи! До завтра");
    }
    public void eat(){
        while (true)

        if (weight <=1 ) {
            System.out.println("Я очень голоден, давайте перекусим чипсами!");
        }
        else if (weight >= 1) {
            System.out.println("Я не голоден");}
        }

    public String say(String aWord){
        String petResponse = "Ну ладно!! " +aWord;
        return petResponse;
    }
}