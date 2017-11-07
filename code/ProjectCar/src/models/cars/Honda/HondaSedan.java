package models.cars.Honda;

import models.Color;
import models.cars.ACar;
import models.cars.ASedan;
import models.cars.IStyle;

public class HondaSedan extends ASedan {
    public HondaSedan(Color color){
        super(color,IStyle.HONDA);

    }
}