package com.summitteam.examples.mars;

import java.util.Objects;

public class PlateauCoordinate {
    private final int x;
    private final int y;

    public PlateauCoordinate(int x, int y) {
        this.x = x;
        this.y = y;
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
        final PlateauCoordinate other = (PlateauCoordinate) obj;
        return Objects.equals(this.x, other.x) && Objects.equals(this.y, other.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    public PlateauCoordinate neighbour(Heading direction) {
        return new PlateauCoordinate(x + direction.getXshift(), y + direction.getYshift());
    }

}
