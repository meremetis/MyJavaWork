package gr.aueb.elearn.chapter16.runable;


public interface IMission {
    MissionStatus getStatus();
    void setStatus(MissionStatus missionStatus);
    void embark();
}
