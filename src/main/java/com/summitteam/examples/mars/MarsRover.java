package com.summitteam.examples.mars;

public class MarsRover {
    private final PlateauCoordinate position;
    private RoverOrientation orientation;

    public MarsRover(MarsPlateau plateau, PlateauCoordinate initialPosition, RoverOrientation orientation) {
        this.position = initialPosition;
        this.orientation = orientation;
    }

    public void spinLeft() {
        this.orientation = RoverOrientation.left(this.orientation);
    }

    public void moveForward() {

    }

    public void spinRight() {

    }

    public PlateauCoordinate getPosition() {
        return position;
    }

    public RoverOrientation getOrientation() {
        return orientation;
    }
}
