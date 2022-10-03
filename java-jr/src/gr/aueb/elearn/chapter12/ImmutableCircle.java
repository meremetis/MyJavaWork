package gr.aueb.elearn.chapter12;

public class ImmutableCircle {
    private final ImmutablePoint center;
    private final int RADIOUS;

    public ImmutableCircle() {
        center = null;
        RADIOUS = 0;
    }

    public ImmutableCircle(ImmutablePoint center, int RADIOUS) {
        this.center = center;
        this.RADIOUS = RADIOUS;
    }

    public ImmutablePoint getCenter() {
        return center;
    }

    public int getRADIOUS() {
        return RADIOUS;
    }
}
