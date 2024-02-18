package es.iescarrillo.ifoody_marp.models;

import java.io.Serializable;

public class Restaurant implements Serializable {

    private int imgValoration;

    private int imgFoto;

    private String name;


    public Restaurant() {
    }

    public Restaurant(int imgValoration, int imgFoto, String name) {
        this.imgValoration = imgValoration;
        this.imgFoto = imgFoto;
        this.name = name;
    }

    public int getImgValoration() {
        return imgValoration;
    }

    public void setImgValoration(int imgValoration) {
        this.imgValoration = imgValoration;
    }

    public int getImgFoto() {
        return imgFoto;
    }

    public void setImgFoto(int imgFoto) {
        this.imgFoto = imgFoto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
