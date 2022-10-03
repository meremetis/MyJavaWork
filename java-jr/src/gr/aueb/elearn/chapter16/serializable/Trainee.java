package gr.aueb.elearn.chapter16.serializable;

import gr.aueb.elearn.chapter16.serializable.City;

import java.io.Serializable;
import java.util.Objects;

public class Trainee implements Cloneable, Serializable {
    private String name;
    private City city;


    public Trainee(){}
    public Trainee(String name, City city){
        this.name=name;
        this.city=new City(city.getDescription());
    }
    public Trainee(Trainee trainee){
        this.name= trainee.getName();
        this.city=new City(trainee.getCity());
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    protected Trainee clone() throws CloneNotSupportedException {
        Trainee trainee =  (Trainee) super.clone();
        City city = new City(this.getCity().getDescription());
        trainee.setCity(city);
        return trainee;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((city == null) ? 0 : city.hashCode());

        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return  result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainee trainee = (Trainee) o;
        return Objects.equals(getName(),trainee.getName()) && Objects.equals(getCity(),trainee.getCity());
    }
}
