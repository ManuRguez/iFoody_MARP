package es.iescarrillo.ifoody_marp.models;

import java.io.Serializable;

public class FavouritesFood implements Serializable {

    private int imgFood;

    private int price;

    private String name;

    private String Subname;

    public FavouritesFood() {
    }

    public FavouritesFood(int imgFood, int price, String name, String subname) {
        this.imgFood = imgFood;
        this.price = price;
        this.name = name;
        Subname = subname;
    }

    public int getImgFood() {
        return imgFood;
    }

    public void setImgFood(int imgFood) {
        this.imgFood = imgFood;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubname() {
        return Subname;
    }

    public void setSubname(String subname) {
        Subname = subname;
    }
}
