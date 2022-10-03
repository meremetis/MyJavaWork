package gr.aueb.testbed.week1.chapter16.ergasia.MODEL;

import gr.aueb.elearn.chapter17.Account.MODEL.IdentifiableEntity;

public abstract class AbstractEntity implements IdentifiableEntity {
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
