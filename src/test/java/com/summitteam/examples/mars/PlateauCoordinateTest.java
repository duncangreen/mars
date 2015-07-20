package com.summitteam.examples.mars;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class PlateauCoordinateTest {

    @Test
    public void reflexiveEquality() {
        PlateauCoordinate coordinate = new PlateauCoordinate(1, 1);
        assertThat(coordinate).isEqualTo(coordinate);
    }

    @Test
    public void symmetricEquality() {
        PlateauCoordinate coordinateA = new PlateauCoordinate(1, 1);
        PlateauCoordinate coordinateB = new PlateauCoordinate(1, 1);

        assertThat(coordinateA).isEqualTo(coordinateB);
        assertThat(coordinateB).isEqualTo(coordinateA);
    }

    @Test
    public void transitiveEquality() {
        PlateauCoordinate coordinateA = new PlateauCoordinate(1, 1);
        PlateauCoordinate coordinateB = new PlateauCoordinate(1, 1);
        PlateauCoordinate coordinateC = new PlateauCoordinate(1, 1);

        assertThat(coordinateA).isEqualTo(coordinateB);
        assertThat(coordinateB).isEqualTo(coordinateC);
        assertThat(coordinateA).isEqualTo(coordinateC);
    }

    @Test
    public void inequality() {
        assertThat(new PlateauCoordinate(1, 1)).isNotEqualTo(new PlateauCoordinate(1, 2));
        assertThat(new PlateauCoordinate(1, 1)).isNotEqualTo(new PlateauCoordinate(2, 1));
        assertThat(new PlateauCoordinate(1, 1)).isNotEqualTo(new PlateauCoordinate(2, 2));
    }

    @Test
    public void neighbour() {
        assertThat(new PlateauCoordinate(0, 0).neighbour(RoverOrientation.NORTH)).isEqualTo(new PlateauCoordinate(0, 1));
        assertThat(new PlateauCoordinate(0, 0).neighbour(RoverOrientation.EAST)).isEqualTo(new PlateauCoordinate(1, 0));
        assertThat(new PlateauCoordinate(0, 0).neighbour(RoverOrientation.SOUTH)).isEqualTo(new PlateauCoordinate(0, -1));
        assertThat(new PlateauCoordinate(0, 0).neighbour(RoverOrientation.WEST)).isEqualTo(new PlateauCoordinate(-1, 0));
    }
}
