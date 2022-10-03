package gr.aueb.elearn.chapter16.runable;

public class ExploreTheDungeonMission implements IMission{

    private MissionStatus missionStatus = MissionStatus.NOT_STARTED;

    @Override
    public MissionStatus getStatus() {
        return missionStatus;
    }

    @Override
    public void setStatus(MissionStatus missionStatus) {
        this.missionStatus = missionStatus;
    }

    @Override
    public void embark() {
        System.out.println("Explore the dungeon");
    }
}
