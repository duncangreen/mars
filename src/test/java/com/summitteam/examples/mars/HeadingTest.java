package com.summitteam.examples.mars;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class HeadingTest {

    @Test
    public void left() {
        assertThat(Heading.left(Heading.NORTH)).isEqualTo(Heading.WEST);
        assertThat(Heading.left(Heading.WEST)).isEqualTo(Heading.SOUTH);
        assertThat(Heading.left(Heading.SOUTH)).isEqualTo(Heading.EAST);
        assertThat(Heading.left(Heading.EAST)).isEqualTo(Heading.NORTH);
    }

    @Test
    public void right() {
        assertThat(Heading.right(Heading.NORTH)).isEqualTo(Heading.EAST);
        assertThat(Heading.right(Heading.EAST)).isEqualTo(Heading.SOUTH);
        assertThat(Heading.right(Heading.SOUTH)).isEqualTo(Heading.WEST);
        assertThat(Heading.right(Heading.WEST)).isEqualTo(Heading.NORTH);
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
