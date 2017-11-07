package models.cars;

import models.Color;

public abstract class ASedan extends ACar implements ISedan {
    public ASedan(Color color, String style) {
        super(color,style);
    }

    @Override
    public String toString() {
        return this.getColor()+" "+ getStyle()+ " "+"Sedan";
    }
}
