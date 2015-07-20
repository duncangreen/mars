package com.summitteam.examples.mars;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class MarsRoverTest {

    @Test
    public void initialPositionAndOrientation() {
        PlateauCoordinate initialPosition = new PlateauCoordinate(1, 1);
        RoverOrientation initialOrientation = RoverOrientation.NORTH;
        MarsRover rover = new MarsRover(new MarsPlateau(new PlateauCoordinate(5, 5)), initialPosition, initialOrientation);

        assertThat(rover.getPosition()).isEqualTo(initialPosition);
        assertThat(rover.getOrientation()).isEqualTo(initialOrientation);
    }

    @Test
    public void spinLeft() {
        PlateauCoordinate initialPosition = new PlateauCoordinate(1, 1);
        MarsRover rover = new MarsRover(new MarsPlateau(new PlateauCoordinate(5, 5)), initialPosition, RoverOrientation.NORTH);

        rover.spinLeft();

        assertThat(rover.getPosition()).isEqualTo(initialPosition);
        assertThat(rover.getOrientation()).isEqualTo(RoverOrientation.EAST);
    }

    @Test
    public void spinRight() {
        PlateauCoordinate initialPosition = new PlateauCoordinate(1, 1);
        MarsRover rover = new MarsRover(new MarsPlateau(new PlateauCoordinate(5, 5)), initialPosition, RoverOrientation.NORTH);

        rover.spinRight();

        assertThat(rover.getPosition()).isEqualTo(initialPosition);
        assertThat(rover.getOrientation()).isEqualTo(RoverOrientation.WEST);
    }
}
