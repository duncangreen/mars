package com.summitteam.examples.mars;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class RoverOrientationTest {

    @Test
    public void left() {
        assertThat(RoverOrientation.left(RoverOrientation.NORTH)).isEqualTo(RoverOrientation.WEST);
        assertThat(RoverOrientation.left(RoverOrientation.WEST)).isEqualTo(RoverOrientation.SOUTH);
        assertThat(RoverOrientation.left(RoverOrientation.SOUTH)).isEqualTo(RoverOrientation.EAST);
        assertThat(RoverOrientation.left(RoverOrientation.EAST)).isEqualTo(RoverOrientation.NORTH);
    }

    @Test
    public void right() {
        assertThat(RoverOrientation.right(RoverOrientation.NORTH)).isEqualTo(RoverOrientation.EAST);
        assertThat(RoverOrientation.right(RoverOrientation.EAST)).isEqualTo(RoverOrientation.SOUTH);
        assertThat(RoverOrientation.right(RoverOrientation.SOUTH)).isEqualTo(RoverOrientation.WEST);
        assertThat(RoverOrientation.right(RoverOrientation.WEST)).isEqualTo(RoverOrientation.NORTH);
    }

    @Test
    public void eEquality() {
        assertThat(RoverOrientation.NORTH).isEqualTo(RoverOrientation.NORTH);
    }

    @Test
    public void inequality() {
        assertThat(RoverOrientation.NORTH).isNotEqualTo(RoverOrientation.SOUTH);
    }
}
