package gr.aueb.elearn.chapter14.mobilecontactssoainterfaces.model;

public class AbstractEntity implements IdentifiableEntity  {
    private long id;

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }
}
