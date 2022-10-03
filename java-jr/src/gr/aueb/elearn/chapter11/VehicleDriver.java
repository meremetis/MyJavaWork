package gr.aueb.testbed.week1.chapter11;

public class VehicleDriver {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("nisan",22,2,true);
        Vehicle v2 = new Vehicle();

        System.out.println(" vehicle type : "+v1.getType() + " year : " + v1.getReleaseYear() + " cubic : "+ v1.getCubicCapacity()+" long vehicle: " + v1.isLongVehicle() );
        System.out.println("Objects made : "+Vehicle.getCounter());
    }
}
