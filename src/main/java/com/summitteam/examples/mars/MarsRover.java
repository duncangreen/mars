package com.summitteam.examples.mars;

public class MarsRover {
    private final MarsPlateau plateau;
    private PlateauCoordinate position;
    private Heading heading;

    public MarsRover(MarsPlateau plateau, PlateauCoordinate initialPosition, Heading initialHeading) throws HazardousMoveException {
        this.plateau = plateau;
        setPosition(initialPosition);
        heading = initialHeading;
    }

    public void spinLeft() {
        heading = Heading.left(heading);
    }

    public void moveForward() throws HazardousMoveException {
        setPosition(position.neighbour(heading));
    }

    private void setPosition(PlateauCoordinate newPosition) throws HazardousMoveException {
        if (!plateau.contains(newPosition)) {
            throw new HazardousMoveException();
        }
        position = newPosition;
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
