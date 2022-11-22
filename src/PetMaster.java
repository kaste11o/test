public class PetMaster {
    public static void main(String[] args) {
        String PetReaction;
        Pet myPet = new Pet();
        myPet.eat();
        String petReaction = myPet.say("Чик!! Чирик!!");
        System.out.println(petReaction);
        myPet.sleep();
    }
}