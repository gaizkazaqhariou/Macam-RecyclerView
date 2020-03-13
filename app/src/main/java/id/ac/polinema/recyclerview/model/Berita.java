package id.ac.polinema.recyclerview.model;

import java.io.Serializable;

public class Berita implements Serializable {
    private String image;
    private String nama;
    private String judul;

    public Berita(String image, String nama, String judul) {
        this.image = image;
        this.nama = nama;
        this.judul = judul;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
}
