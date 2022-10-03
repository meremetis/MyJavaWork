package gr.aueb.elearn.chapter5;

public class DoubleRandom {
    public static void main(String[] args) {
        int dice1 = 0;
        int dice2 = 0;

        for (int i = 1; i<=5; i++){
            dice1 = (int)(Math.random()*6 + 1);

            dice2 = (int)Math.random()*6 + 1;

            System.out.println(dice1 + "-" + dice2);
        }
    }
}
