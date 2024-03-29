package com.example.tugasday6;

public class MerkJam {
    private String namaJam;
    private int gambarJam;
    private String deskripsiJam;
    private double hargaJam;

    public MerkJam(String namaJam, int gambarJam, String deskripsiJam, double hargaJam) {
        this.namaJam = namaJam;
        this.gambarJam = gambarJam;
        this.deskripsiJam = deskripsiJam;
        this.hargaJam = hargaJam;
    }


    public String getDeskripsiJam() {
        return deskripsiJam;
    }

    public void setDeskripsiJam(String deskripsiJam) {
        this.deskripsiJam = deskripsiJam;
    }

    public double getHargaJam() {
        return hargaJam;
    }

    public void setHargaJam(double hargaJam) {
        this.hargaJam = hargaJam;
    }


    public String getNamaJam() {
        return namaJam;
    }

    public void setNamaJam(String namaJam) {
        this.namaJam = namaJam;
    }

    public int getGambarJam() {
        return gambarJam;
    }

    public void setGambarJam(int gambarJam) {
        this.gambarJam = gambarJam;
    }
}