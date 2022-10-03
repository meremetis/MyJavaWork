package gr.aueb.elearn.chapter16.runable;

public class Knight implements  IKnight, Runnable{

    private final String name;

    public Knight(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*
    private IMission iMission;

    //dependransy injection
    //losely coupled
    public Knight(IMission iMission) {
        this.iMission = iMission;
    }
*/



    @Override
    public void embarkOnMission(IMission iMission) {
        System.out.println("Knight name: " + getName() + "mission started");
        iMission.embark();
        iMission.setStatus(MissionStatus.STARTED);
    }

    //thread
    @Override
    public void run() {
        synchronized (IKnight.missions)
        {
            for (IMission mission : IKnight.missions)
            {
                if (mission.getStatus() == MissionStatus.NOT_STARTED)
                {
                    this.embarkOnMission(mission);
                    break;
                }
            }
        }
    }
}
