package models.cars.Mazda;

import models.Color;
import models.cars.ASedan;
import models.cars.IStyle;

public class MazdaSedan extends ASedan {
    public MazdaSedan(Color color){
        super(color,IStyle.MAZDA);
    }
}