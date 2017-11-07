package models.cars;


import models.Color;

public abstract class AJeep extends ACar implements IJeep {
    public AJeep(Color color, String style) {
        super(color,style);
    }

    @Override
    public String toString() {
        return this.getColor()+" "+ getStyle()+ " "+ "Jeep";
    }
}
