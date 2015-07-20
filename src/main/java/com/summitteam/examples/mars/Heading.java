package com.summitteam.examples.mars;

import java.util.Objects;

public class Heading {
    public static final Heading NORTH = new Heading(0, 1);
    public static final Heading SOUTH = new Heading(0, -1);
    public static final Heading EAST = new Heading(1, 0);
    public static final Heading WEST = new Heading(-1, 0);

    private final int horizontal;

    private final int vertical;

    private Heading(int horizontal, int vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    public Heading adjustLeft() {
        return new Heading(vertical * -1, horizontal);
    }

    public Heading adjustRight() {
        return new Heading(vertical, horizontal * -1);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", horizontal, vertical);
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
        return Objects.equals(this.horizontal, other.horizontal) && Objects.equals(this.vertical, other.vertical);
    }

    public int getYshift() {
        return vertical;
    }

    public int getXshift() {
        return horizontal;
    }

}
