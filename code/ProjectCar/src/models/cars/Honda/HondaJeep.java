package models.cars.Honda;

import models.Color;
import models.cars.ACar;
import models.cars.AJeep;
import models.cars.IStyle;

public class HondaJeep extends AJeep {
    public HondaJeep(Color color){
        super(color,IStyle.HONDA);
    }
}
