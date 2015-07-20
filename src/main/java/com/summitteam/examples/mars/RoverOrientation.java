package com.summitteam.examples.mars;

public enum RoverOrientation {
    NORTH, EAST, SOUTH, WEST;

    public static RoverOrientation left(RoverOrientation initial) {
        switch (initial) {
            case NORTH: return EAST;
            case EAST: return SOUTH;
            case SOUTH: return WEST;
            case WEST: return NORTH;
        }
        return NORTH;
    }
}
