package com.summitteam.examples.mars;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class HeadingTest {

    @Test
    public void left() {
        assertThat(Heading.NORTH.adjustLeft()).isEqualTo(Heading.WEST);
        assertThat(Heading.WEST.adjustLeft()).isEqualTo(Heading.SOUTH);
        assertThat(Heading.SOUTH.adjustLeft()).isEqualTo(Heading.EAST);
        assertThat(Heading.EAST.adjustLeft()).isEqualTo(Heading.NORTH);
    }

    @Test
    public void right() {
        assertThat(Heading.NORTH.adjustRight()).isEqualTo(Heading.EAST);
        assertThat(Heading.EAST.adjustRight()).isEqualTo(Heading.SOUTH);
        assertThat(Heading.SOUTH.adjustRight()).isEqualTo(Heading.WEST);
        assertThat(Heading.WEST.adjustRight()).isEqualTo(Heading.NORTH);
    }

    @Test
    public void eEquality() {
        assertThat(Heading.NORTH).isEqualTo(Heading.NORTH);
    }

    @Test
    public void inequality() {
        assertThat(Heading.NORTH).isNotEqualTo(Heading.SOUTH);
    }
}
