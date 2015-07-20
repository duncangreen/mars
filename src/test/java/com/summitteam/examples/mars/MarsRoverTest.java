package com.summitteam.examples.mars;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class MarsRoverTest {

    @Test
    public void initialPositionAndOrientation() {
        MarsRover rover = new MarsRover(new MarsPlateau(new PlateauCoordinate(5, 5)), new PlateauCoordinate(1, 1), RoverOrientation.NORTH);

        assertThat(rover.getPosition()).isEqualTo(new PlateauCoordinate(1, 1));
        assertThat(rover.getOrientation()).isEqualTo(RoverOrientation.NORTH);
    }
}
