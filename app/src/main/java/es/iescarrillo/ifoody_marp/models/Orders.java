package es.iescarrillo.ifoody_marp.models;

import java.io.Serializable;

public class Orders implements Serializable {
    private int img;

    private String nombre;

    private String date;

    private String price;

    public Orders() {
    }

    public Orders(int img, String nombre, String date, String price) {
        this.img = img;
        this.nombre = nombre;
        this.date = date;
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
