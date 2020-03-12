package id.ac.polinema.recyclerview.model;

import java.io.Serializable;

public class Team implements Serializable {
    public String nama;
    public String image;

    public Team(String image, String nama) {
        this.nama = nama;
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
