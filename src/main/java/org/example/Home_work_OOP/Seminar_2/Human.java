package org.example.Home_work_OOP.Seminar_2;

public class Human implements CanDo{
    private int maxDistanceJump;
    private int maxDistanceRun;


    public Human(int maxDistanceJump, int maxDistanceRun) {
        this.maxDistanceJump = maxDistanceJump;
        this.maxDistanceRun = maxDistanceRun;
    }

    public Human() {
    }

    @Override
    public int run(int distance) {
        if (distance>=maxDistanceRun){
            System.out.println("Человек не прошел испытание run и выбывает ");
            return 1;
        }
        else System.out.println("Человек  прошел испытание run  ");
        return 0;
    }

    @Override
    public int jump(int distance ) {
        if (distance>=maxDistanceJump) {System.out.println("Человек не прошел испытание jump и выбывает   ");
            return 1;
        }
        else{ System.out.println("Человек  прошел испытание jump  ");
            return 0;}
        }
    public int getMaxDistanceJump() {
        return maxDistanceJump;
    }

    public void setMaxDistanceJump(int maxDistanceJump) {
        this.maxDistanceJump = maxDistanceJump;
    }

    public int getMaxDistanceRun() {
        return maxDistanceRun;
    }

    public void setMaxDistanceRun(int maxDistanceRun) {
        this.maxDistanceRun = maxDistanceRun;
    }
}
