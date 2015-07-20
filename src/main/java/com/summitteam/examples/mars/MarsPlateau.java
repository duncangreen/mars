package com.summitteam.examples.mars;

public class MarsPlateau {

    private final int extentX;
    private final int extentY;

    public MarsPlateau(int extentX, int extentY) {
        this.extentX = extentX;
        this.extentY = extentY;
    }

    public boolean contains(PlateauCoordinate coordinate) {
        return coordinate.getX() >= 0 && coordinate.getX() <= extentX &&
                coordinate.getY() >= 0 && coordinate.getY() <= extentY;
    }
}
