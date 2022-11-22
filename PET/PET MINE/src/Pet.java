public class Pet {
    int age;
    float weight;
    float height;
    String color;
    public void sleep(){
        System.out.println("пет Спать");
    }
    public void eat(){
        System.out.println(
            "пет ест");
    }
    public String say(String aWord){
        String petResponse = " пет говорит!! " +aWord;
        return petResponse;
    }

    public void age() {
        System.out.println(" пет 42");
    }
}