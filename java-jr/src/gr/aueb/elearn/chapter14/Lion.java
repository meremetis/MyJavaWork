package gr.aueb.elearn.chapter14;

public class Lion extends AbstractAnimal {

    public Lion(){
        setId(1);
        setName("yellow-Lion");
        setAge(10D);
    }

    @Override
    public void speak() {
        System.out.println("lion says hello");
    }

    @Override
    public String toString() {
        return "(" +getId() + " , "+getName() + " , " + getAge() +" ) ";
    }
}
