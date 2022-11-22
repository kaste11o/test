public class Carx {
    static int x;

    public static void drive(int g) {
        x += g;
    }
    public static void stop(int g){
        drive( -g);
    }
    public static void panel(){
        System.out.println("now " + x );
    }


}
