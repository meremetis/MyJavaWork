package gr.aueb.elearn.chapter16.runable;

@FunctionalInterface
public interface IKnight {

    //final static
    IMission[] missions = {
            new SaveThePrincesMission(),
            new KillTheDragonMission(),
            new ExploreTheDungeonMission()
    };
    void embarkOnMission(IMission iMission);
}
