public class dogowner {
    public static void main(String[]args){
        String dogReaction;
        dog thisdog = new dog();
        dogReaction = thisdog.say("");
        thisdog.eat();
        thisdog.stay();
        System.out.print(dogReaction);
        String PerReaction;
        Pet ThisPet = new Pet();
        PerReaction = ThisPet.say("");
        ThisPet.eat();
        ThisPet.sleep();
        ThisPet.age();

        System.out.print(PerReaction);
        Fish myFish = new Fish();
        myFish.dive(2);
        myFish.dive(3);
        myFish.sleep("  ");
        myFish.eat("  ");
        myFish.say(" ");
        System.out.print(myFish.say(" "));
        System.out.print(myFish.eat("  "));
        System.out.print(myFish.sleep("     "));

    }
}
