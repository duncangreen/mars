package com.summitteam.examples.mars;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class AcceptanceTest {

    @Test
    public void moveTwoRovers() throws HazardousMoveException {
        MarsPlateau plateau = new MarsPlateau(5, 5);

        MarsRover rover1 = new MarsRover(plateau, new PlateauCoordinate(1, 2), Heading.NORTH);
        rover1.spinLeft();
        rover1.moveForward();
        rover1.spinLeft();
        rover1.moveForward();
        rover1.spinLeft();
        rover1.moveForward();
        rover1.spinLeft();
        rover1.moveForward();
        rover1.moveForward();

        MarsRover rover2 = new MarsRover(plateau, new PlateauCoordinate(3, 3), Heading.EAST);
        rover2.moveForward();
        rover2.moveForward();
        rover2.spinRight();
        rover2.moveForward();
        rover2.moveForward();
        rover2.spinRight();
        rover2.moveForward();
        rover2.spinRight();
        rover2.spinRight();
        rover2.moveForward();

        assertThat(rover1.getPosition()).isEqualTo(new PlateauCoordinate(1, 3));
        assertThat(rover1.getHeading()).isEqualTo(Heading.NORTH);

        assertThat(rover2.getPosition()).isEqualTo(new PlateauCoordinate(5, 1));
        assertThat(rover2.getHeading()).isEqualTo(Heading.EAST);
    }
}
