package com.summitteam.examples.mars;

import org.junit.Test;

import static com.summitteam.examples.mars.SampleCoordinates.ORIGIN;
import static org.fest.assertions.Assertions.assertThat;

public class MarsPlateauTest {

    @Test
    public void contains() {
        MarsPlateau plateau = new MarsPlateau(5, 5);

        assertThat(plateau.contains(ORIGIN)).isTrue();
        assertThat(plateau.contains(new PlateauCoordinate(5, 5))).isTrue();

        assertThat(plateau.contains(new PlateauCoordinate(5, 6))).isFalse();
    }
}
