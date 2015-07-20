package com.summitteam.examples.mars;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class RoverOrientationTest {

    @Test
    public void left() {
        assertThat(RoverOrientation.left(RoverOrientation.NORTH)).isEqualTo(RoverOrientation.EAST);
        assertThat(RoverOrientation.left(RoverOrientation.EAST)).isEqualTo(RoverOrientation.SOUTH);
        assertThat(RoverOrientation.left(RoverOrientation.SOUTH)).isEqualTo(RoverOrientation.WEST);
        assertThat(RoverOrientation.left(RoverOrientation.WEST)).isEqualTo(RoverOrientation.NORTH);
    }
}
