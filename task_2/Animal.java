package artem_task.task_2;

public class Animal {
    int runLimit;
    int swimLimit;
    double jumpLimit;
    public Animal(int runLimit, int swimLimit, double jumpLimit){
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
    }
    public String run(int length){
        return "result: Animal can run " + length + "m.";
    }

    public String jump(double height){
        return "result: Animal can jump " + height + "m.";
    }

    public String swim(int length){
        return "result: Animal can swim " + length + "m.";
    }


    public boolean isAbleToRun(int value){ return value < runLimit; }
    public boolean isAbleToSwim(int value){
        return value < swimLimit;
    }
    public boolean isAbleToJump(double value){
        return value < jumpLimit;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "runLimit=" + runLimit +
                ", swimLimit=" + swimLimit +
                ", jumpLimit=" + jumpLimit +
                '}';
    }
}
