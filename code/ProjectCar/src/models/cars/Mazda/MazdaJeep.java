package models.cars.Mazda;

import models.Color;
import models.cars.AJeep;
import models.cars.IStyle;

    public class MazdaJeep extends AJeep {
        public MazdaJeep(Color color) {
            super(color,IStyle.MAZDA);
        }
    }
