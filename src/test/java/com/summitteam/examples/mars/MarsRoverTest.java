package com.summitteam.examples.mars;

import org.junit.Test;

import static com.summitteam.examples.mars.SampleCoordinates.ORIGIN;
import static org.fest.assertions.Assertions.assertThat;

public class MarsRoverTest {

    private final MarsPlateau plateau = new MarsPlateau(5, 5);

    @Test
    public void initialPositionAndHeading() {
        MarsRover rover = new MarsRover(plateau, ORIGIN, Heading.NORTH);

        assertThat(rover.getPosition()).isEqualTo(ORIGIN);
        assertThat(rover.getHeading()).isEqualTo(Heading.NORTH);
    }

    @Test
    public void spinLeft() {
        MarsRover rover = new MarsRover(plateau, ORIGIN, Heading.NORTH);

        rover.spinLeft();

        assertThat(rover.getPosition()).isEqualTo(ORIGIN);
        assertThat(rover.getHeading()).isEqualTo(Heading.WEST);
    }

    @Test
    public void spinRight() {
        MarsRover rover = new MarsRover(plateau, ORIGIN, Heading.NORTH);

        rover.spinRight();

        assertThat(rover.getPosition()).isEqualTo(ORIGIN);
        assertThat(rover.getHeading()).isEqualTo(Heading.EAST);
    }

    @Test
    public void moveForward() throws HazardousMoveException {
        MarsRover rover = new MarsRover(plateau, ORIGIN, Heading.NORTH);

        rover.moveForward();

        assertThat(rover.getHeading()).isEqualTo(Heading.NORTH);
        assertThat(rover.getPosition()).isEqualTo(ORIGIN.neighbour(Heading.NORTH));
    }

    @Test
    public void moveInACircle() throws HazardousMoveException {
        PlateauCoordinate initialPosition = new PlateauCoordinate(1, 1);
        MarsRover rover = new MarsRover(plateau, initialPosition, Heading.NORTH);

        rover.moveForward();
        rover.spinLeft();
        rover.moveForward();
        rover.spinLeft();
        rover.moveForward();
        rover.spinLeft();
        rover.moveForward();
        rover.spinLeft();

        assertThat(rover.getHeading()).isEqualTo(Heading.NORTH);
        assertThat(rover.getPosition()).isEqualTo(initialPosition);
    }

    @Test(expected = HazardousMoveException.class)
    public void attemptToMoveOffEndOfPlateau() throws HazardousMoveException {
        MarsRover rover = new MarsRover(new MarsPlateau(0, 0), ORIGIN, Heading.NORTH);

        rover.moveForward();
    }
}
