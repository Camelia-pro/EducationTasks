package models.cars;

import models.Color;
public abstract class ACar {
    private Color color;
    private String style;

    public ACar(Color color, String style){
        this.color = color;
        this.style=style;
    }

    public String getStyle() {
        return style;
    }

    public Color getColor(){
        return this.color;
    }

    public void setColor(Color newColor){
        this.color = newColor;
    }

}