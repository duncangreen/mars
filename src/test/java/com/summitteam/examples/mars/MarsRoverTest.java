package com.summitteam.examples.mars;

import org.junit.Test;

import static com.summitteam.examples.mars.SampleCoordinates.ORIGIN;
import static org.fest.assertions.Assertions.assertThat;

public class MarsRoverTest {

    @Test
    public void initialPositionAndHeading() {
        MarsRover rover = new MarsRover(new MarsPlateau(new PlateauCoordinate(5, 5)), ORIGIN, Heading.NORTH);

        assertThat(rover.getPosition()).isEqualTo(ORIGIN);
        assertThat(rover.getHeading()).isEqualTo(Heading.NORTH);
    }

    @Test
    public void spinLeft() {
        MarsRover rover = new MarsRover(new MarsPlateau(new PlateauCoordinate(5, 5)), ORIGIN, Heading.NORTH);

        rover.spinLeft();

        assertThat(rover.getPosition()).isEqualTo(ORIGIN);
        assertThat(rover.getHeading()).isEqualTo(Heading.WEST);
    }

    @Test
    public void spinRight() {
        MarsRover rover = new MarsRover(new MarsPlateau(new PlateauCoordinate(5, 5)), ORIGIN, Heading.NORTH);

        rover.spinRight();

        assertThat(rover.getPosition()).isEqualTo(ORIGIN);
        assertThat(rover.getHeading()).isEqualTo(Heading.EAST);
    }

    @Test
    public void moveForward() {
        MarsRover rover = new MarsRover(new MarsPlateau(new PlateauCoordinate(5, 5)), ORIGIN, Heading.NORTH);

        rover.moveForward();

        assertThat(rover.getHeading()).isEqualTo(Heading.NORTH);
        assertThat(rover.getPosition()).isEqualTo(ORIGIN.neighbour(Heading.NORTH));
    }

    @Test
    public void moveInACircle() {
        MarsRover rover = new MarsRover(new MarsPlateau(new PlateauCoordinate(5, 5)), ORIGIN, Heading.NORTH);

        rover.moveForward();
        rover.spinLeft();
        rover.moveForward();
        rover.spinLeft();
        rover.moveForward();
        rover.spinLeft();
        rover.moveForward();
        rover.spinLeft();

        assertThat(rover.getHeading()).isEqualTo(Heading.NORTH);
        assertThat(rover.getPosition()).isEqualTo(ORIGIN);
    }
}
