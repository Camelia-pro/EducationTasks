package fabrics;

import models.Color;

public abstract class ACarFabric implements ICarFabric {
    private Color carColor;
    private int carSeries;


    public Color getCarColor() {
        return carColor;
    }

    public void setCarColor(Color carColor) {
        this.carColor = carColor;
    }

    public void setCarSeries(int carSeries) {
        this.carSeries = carSeries;
    }

    public int getCarSeries() {
        return carSeries;
    }
}
