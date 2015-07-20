package com.summitteam.examples.mars;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class MarsRoverTest {

    public static final PlateauCoordinate POSITION_1_1 = new PlateauCoordinate(1, 1);

    @Test
    public void initialPositionAndHeading() {
        Heading initialHeading = Heading.NORTH;
        MarsRover rover = new MarsRover(new MarsPlateau(new PlateauCoordinate(5, 5)), POSITION_1_1, initialHeading);

        assertThat(rover.getPosition()).isEqualTo(POSITION_1_1);
        assertThat(rover.getHeading()).isEqualTo(initialHeading);
    }

    @Test
    public void spinLeft() {
        MarsRover rover = new MarsRover(new MarsPlateau(new PlateauCoordinate(5, 5)), POSITION_1_1, Heading.NORTH);

        rover.spinLeft();

        assertThat(rover.getPosition()).isEqualTo(POSITION_1_1);
        assertThat(rover.getHeading()).isEqualTo(Heading.WEST);
    }

    @Test
    public void spinRight() {
        MarsRover rover = new MarsRover(new MarsPlateau(new PlateauCoordinate(5, 5)), POSITION_1_1, Heading.NORTH);

        rover.spinRight();

        assertThat(rover.getPosition()).isEqualTo(POSITION_1_1);
        assertThat(rover.getHeading()).isEqualTo(Heading.EAST);
    }

    @Test
    public void moveForward() {
        MarsRover rover = new MarsRover(new MarsPlateau(new PlateauCoordinate(5, 5)), POSITION_1_1, Heading.NORTH);

        rover.moveForward();

        assertThat(rover.getHeading()).isEqualTo(Heading.NORTH);
        assertThat(rover.getPosition()).isEqualTo(new PlateauCoordinate(1, 2));
    }

    @Test
    public void moveInACircle() {
        MarsRover rover = new MarsRover(new MarsPlateau(new PlateauCoordinate(5, 5)), POSITION_1_1, Heading.NORTH);

        rover.moveForward();
        rover.spinLeft();
        rover.moveForward();
        rover.spinLeft();
        rover.moveForward();
        rover.spinLeft();
        rover.moveForward();
        rover.spinLeft();

        assertThat(rover.getHeading()).isEqualTo(Heading.NORTH);
        assertThat(rover.getPosition()).isEqualTo(POSITION_1_1);
    }
}
