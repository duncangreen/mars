package com.summitteam.examples.mars;

import java.util.Objects;

public class Heading {
    public static final Heading NORTH = new Heading(0, 1);
    public static final Heading SOUTH = new Heading(0, -1);
    public static final Heading EAST = new Heading(1, 0);
    public static final Heading WEST = new Heading(-1, 0);

    private final int xShift;

    private final int yShift;

    private Heading(int xShift, int yShift) {
        this.xShift = xShift;
        this.yShift = yShift;
    }

    public static Heading left(Heading initial) {
        return new Heading(initial.yShift * -1, initial.xShift);
    }

    public static Heading right(Heading initial) {
        return new Heading(initial.yShift, initial.xShift * -1);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", xShift, yShift);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Heading other = (Heading) obj;
        return Objects.equals(this.xShift, other.xShift) && Objects.equals(this.yShift, other.yShift);
    }

    public int getYshift() {
        return yShift;
    }

    public int getXshift() {
        return xShift;
    }

}
