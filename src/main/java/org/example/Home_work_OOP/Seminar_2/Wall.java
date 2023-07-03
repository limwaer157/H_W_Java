package org.example.Home_work_OOP.Seminar_2;

public class Wall implements Prepadstvie {
    protected int visota;
    protected String namePrep;

    public Wall(int visota, String namePrep) {
        this.visota = visota;
        this.namePrep = "Wall";
    }

    public Wall() {
    }


    @Override
    public int razmerPrep() {
        System.out.print("Препятствие стена  - " + visota + " метров ");
        return visota;
    }

    @Override
    public String namePrep() {
        return namePrep;
    }

    public int getVisota() {
        return visota;
    }

    public void setVisota(int visota) {
        this.visota = visota;
    }

    public String getNamePrep() {
        return namePrep;
    }

    public void setNamePrep(String namePrep) {
        this.namePrep = namePrep;
    }
}


