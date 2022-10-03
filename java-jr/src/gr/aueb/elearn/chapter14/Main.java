package gr.aueb.elearn.chapter14;

public class Main {

    public static void main(String[] args) {
        ISpeakable chloeCat = new cat("chloe",1);
        ISpeakable blackDog = new Dog("black",2);

        SpeakingSchool catSpeakingschool = new SpeakingSchool(chloeCat);
        SpeakingSchool dogSpeakingschool = new SpeakingSchool(blackDog);

        sayHello(catSpeakingschool);

        sayHello(chloeCat);
        sayHello(blackDog);
    }

    public static void sayHello(SpeakingSchool sp){
        sp.learnToSpeak();
    }
    public static void sayHello(ISpeakable iSpeakable){
        iSpeakable.speak();
    }
}
