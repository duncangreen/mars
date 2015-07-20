package com.summitteam.examples.mars;

import org.junit.Ignore;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class AcceptanceTest {

    @Test
    @Ignore("Not yet implemented")
    public void moveTwoRovers() {
        MarsPlateau plateau = new MarsPlateau(new PlateauCoordinate(5, 5));

        MarsRover rover1 = new MarsRover(plateau, new PlateauCoordinate(1, 2), RoverOrientation.NORTH);
        rover1.spinLeft();
        rover1.moveForward();
        rover1.spinLeft();
        rover1.moveForward();
        rover1.spinLeft();
        rover1.moveForward();
        rover1.spinLeft();
        rover1.moveForward();
        rover1.moveForward();

        MarsRover rover2 = new MarsRover(plateau, new PlateauCoordinate(3, 3), RoverOrientation.EAST);
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
        assertThat(rover1.getOrientation()).isEqualTo(RoverOrientation.NORTH);

        assertThat(rover2.getPosition()).isEqualTo(new PlateauCoordinate(5, 1));
        assertThat(rover2.getOrientation()).isEqualTo(RoverOrientation.EAST);
    }
}
