package gr.aueb.elearn.chapter16.clonable;

import java.util.Objects;

public class City implements Cloneable {
    private String description;

    public City(City city) {
    }

    public City(String description) {
        this.description = description;
    }


    public String getDescription() {
        return description;
    }

    @Override
    protected City clone() throws CloneNotSupportedException {
        return  (City)super.clone();
    }

    @Override
    public String toString() {
        return "City{" +
                "description='" + description + '\'' +
                '}';
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return getDescription().equals(city.getDescription());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((description == null) ? 0 : description.hashCode());


        return  result;
    }
}
