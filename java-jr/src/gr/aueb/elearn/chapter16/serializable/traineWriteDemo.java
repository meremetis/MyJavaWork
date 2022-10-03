package gr.aueb.elearn.chapter16.serializable;




import gr.aueb.elearn.chapter16.serializable.City;

import java.io.*;

public class traineWriteDemo {
    public static void main(String[] args)  {
      /*  try(ObjectOutputStream oss= new ObjectOutputStream(new FileOutputStream("c:/temp/traine.ser")))
        {
                Trainee alice = new Trainee("Alice",new City("Athens"));
                oss.writeObject(alice);
            System.out.println(alice.getName() + " serialised");
        }
        catch ( FileNotFoundException ee){
            ee.printStackTrace();
        }
        catch (NotSerializableException e)
        {
            e.printStackTrace();
        }
        catch (IOException er){
            er.printStackTrace();
        }*/




        try(ObjectInputStream oss= new ObjectInputStream(new FileInputStream("c:/temp/traine.ser")))
        {
            Trainee alice = (Trainee) oss.readObject();
            System.out.println(alice.getName() +"  " + alice.getCity()+ "got back");
        }catch (FileNotFoundException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }catch (IOException r){
            r.printStackTrace();
        }
    }
}
