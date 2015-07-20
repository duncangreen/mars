package com.summitteam.examples.mars;

import java.util.Objects;

public class RoverOrientation {
    public static final RoverOrientation NORTH = new RoverOrientation(0, 1);
    public static final RoverOrientation SOUTH = new RoverOrientation(0, -1);
    public static final RoverOrientation EAST = new RoverOrientation(-1, 0);
    public static final RoverOrientation WEST = new RoverOrientation(1, 0);

    private final int x;
    private final int y;

    private RoverOrientation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static RoverOrientation left(RoverOrientation initial) {
        return new RoverOrientation(initial.y * -1, initial.x);
    }

    public static RoverOrientation right(RoverOrientation initial) {
        return new RoverOrientation(initial.y, initial.x * -1);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
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
        return Objects.equals(this.x, other.x) && Objects.equals(this.y, other.y);
    }

}
