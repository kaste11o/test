public class Test {
    public static void main(String[] args) {
        Human human1 = new Human("dd",11);
        System.out.println(human1);

    }

    static class Human {
        String name;
        int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

}
