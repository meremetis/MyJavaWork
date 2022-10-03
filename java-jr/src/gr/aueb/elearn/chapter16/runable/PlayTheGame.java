package gr.aueb.elearn.chapter16.runable;

public class PlayTheGame {



    public static void main(String[] args) {
        Runnable joa = new Knight("joa");
        Runnable saintgeorge = new Knight("saint george");
        Runnable arthur = new Knight("Arthur");


        (new Thread(joa)).start();
        (new Thread(saintgeorge)).start();
        (new Thread(arthur)).start();

/*        IKnight joa = new Knight();
        IKnight saintGeorge = new Knight();

        joa.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                System.out.println("Save the princess");
            }
        });

        saintGeorge.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                System.out.println("Kill the dragon");
                killthedragon();
            }
        });

        joa.embarkOnMission(()-> System.out.println("save the princes"));
        saintGeorge.embarkOnMission(()-> System.out.println("kill the dragon"));

        joa.embarkOnMission(()-> savetheprinces());

        joa.embarkOnMission(PlayTheGame::killthedragon);*/

    }
    public static void killthedragon()
    {
        System.out.println("kill the dragon");
    }
    public static void savetheprinces()
    {
        System.out.println("save the princes");
    }
}
