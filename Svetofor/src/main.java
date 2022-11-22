public class main {

    public static void main(String[] args) {

        char ch1 = 'z';
        char ch2 = 'k';
        char ch3 = 'y';
        char ch4 = 'r';


        System.out.println(decode(ch1) + decode(ch2) + decode(ch3)+decode(ch4));
    }

    public static String decode(char ch) {

        switch (ch) {
            case 'z':
                return"Ехать ";
            case 'k':
                return "Стоять ";
            case 'y':
                return "ждать ";
            default:
               return "думать  ";


        }


    }
}