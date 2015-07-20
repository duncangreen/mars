package com.summitteam.examples.mars;

public class MarsRover {
    private PlateauCoordinate position;
    private Heading heading;

    public MarsRover(MarsPlateau plateau, PlateauCoordinate initialPosition, Heading initialHeading) {
        position = initialPosition;
        heading = initialHeading;
    }

    public void spinLeft() {
        heading = Heading.left(heading);
    }

    public void moveForward() {
        position = position.neighbour(heading);
    }

    public void spinRight() {
        heading = Heading.right(heading);
    }

    public PlateauCoordinate getPosition() {
        return position;
    }

    public Heading getHeading() {
        return heading;
    }

    @Override
    public String toString() {
        return String.format("position: %s, heading:%s", position, heading);
    }
}
