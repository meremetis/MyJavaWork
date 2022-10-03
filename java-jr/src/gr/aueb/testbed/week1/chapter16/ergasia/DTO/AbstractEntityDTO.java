package gr.aueb.testbed.week1.chapter16.ergasia.DTO;

public abstract class AbstractEntityDTO implements IdentifiableEntityDTO{
    private Long id;

    @Override
    public Long getId() {
        return null;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
