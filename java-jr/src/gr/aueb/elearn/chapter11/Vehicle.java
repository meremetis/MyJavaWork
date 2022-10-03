package gr.aueb.testbed.week1.chapter11;

public class Vehicle {
    private static int counter;
    private String type;
    private int releaseYear;
    private int cubicCapacity;
    private boolean longVehicle;

    public Vehicle() {
        counter++;
    }

    public Vehicle(String type, int releaseYear, int cubicCapacity, boolean longVehicle) {
        this.type = type;
        this.releaseYear = releaseYear;
        this.cubicCapacity = cubicCapacity;
        this.longVehicle = longVehicle;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Vehicle.counter = counter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public boolean isLongVehicle() {
        return longVehicle;
    }

    public void setLongVehicle(boolean longVehicle) {
        this.longVehicle = longVehicle;
    }
}
