package com.summitteam.examples.mars;

public class MarsRover {
    private PlateauCoordinate position;
    private RoverOrientation orientation;

    public MarsRover(MarsPlateau plateau, PlateauCoordinate initialPosition, RoverOrientation initialOrientation) {
        position = initialPosition;
        orientation = initialOrientation;
    }

    public void spinLeft() {
        orientation = RoverOrientation.left(orientation);
    }

    public void moveForward() {
        position = position.neighbour(orientation);
    }

    public void spinRight() {
        orientation = RoverOrientation.right(orientation);
    }

    public PlateauCoordinate getPosition() {
        return position;
    }

    public RoverOrientation getOrientation() {
        return orientation;
    }

    @Override
    public String toString() {
        return String.format("position: %s, orientation:%s", position, orientation);
    }
}
