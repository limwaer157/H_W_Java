package org.example.Home_work_OOP.Seminar_2;


public class RunRoad implements Prepadstvie {

    protected   int dlinna;
    protected String namePrep;



    public RunRoad(int dlinna) {
        this.dlinna = dlinna;
    }

    public RunRoad() {
    }

    @Override
    public int razmerPrep() {
        System.out.print("Препятствие дорога  - " + dlinna + " км ");
        return dlinna ;
    }

    public RunRoad(int dlinna, String namePrep) {
        this.dlinna = dlinna;
        this.namePrep = "RunRoad";
    }

    @Override
    public String namePrep() {
        return namePrep;
    }

    public int getVisota() {
        return dlinna;
    }

    public void setVisota(int visota) {
        this.dlinna = visota;
    }
}
