package org.example.Home_work_OOP.Seminar_2;

public class Robot implements CanDo {
    private int maxDistanceJump;
    private int maxDistanceRun;

    public Robot(int maxDistanceJump, int maxDistanceRun) {
        this.maxDistanceJump = maxDistanceJump;
        this.maxDistanceRun = maxDistanceRun;
    }

    public Robot() {
    }

    @Override
    public int run(int distance) {
        if (distance >= maxDistanceRun) {
            System.out.println("Robot не прошел испытание run  и выбывает ");
            return 1;
        }
        else{
            System.out.println("Robot  прошел испытание run  ");
            return 0;
        }
    }

    @Override
    public int jump(int distance) {
        if (distance >= maxDistanceJump){ System.out.println("Robot не прошел испытание jump и выбывает ");
            return 1;
        }
        else{ System.out.println("Robot  прошел испытание jump ");
            return 0;
        }
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
