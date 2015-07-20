package com.summitteam.examples.mars;

import java.util.Objects;

public class RoverOrientation {
    public static final RoverOrientation NORTH = new RoverOrientation(0, 1);
    public static final RoverOrientation SOUTH = new RoverOrientation(0, -1);
    public static final RoverOrientation EAST = new RoverOrientation(1, 0);
    public static final RoverOrientation WEST = new RoverOrientation(-1, 0);

    private final int xShift;

    private final int yShift;

    private RoverOrientation(int xShift, int yShift) {
        this.xShift = xShift;
        this.yShift = yShift;
    }

    public static RoverOrientation left(RoverOrientation initial) {
        return new RoverOrientation(initial.yShift * -1, initial.xShift);
    }

    public static RoverOrientation right(RoverOrientation initial) {
        return new RoverOrientation(initial.yShift, initial.xShift * -1);
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
        final RoverOrientation other = (RoverOrientation) obj;
        return Objects.equals(this.xShift, other.xShift) && Objects.equals(this.yShift, other.yShift);
    }

    public int getYshift() {
        return yShift;
    }

    public int getXshift() {
        return xShift;
    }

}
