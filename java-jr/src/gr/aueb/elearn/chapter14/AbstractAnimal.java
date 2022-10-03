package gr.aueb.elearn.chapter14;

public abstract class AbstractAnimal {
    private long id;
    private String name;
    private double age;

    public AbstractAnimal(){};

    public AbstractAnimal(long id, String name, double age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public abstract void speak();

    public void eat(){
        System.out.println("animal is eating");
    }

    @Override
    public abstract String toString();
}
