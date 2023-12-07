package artem_task.task_2;

public abstract class Animal {
    private final int runLimit;
    protected int swimLimit;
    private final double jumpLimit;
    public Animal(int runLimit, double jumpLimit){
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public abstract String run(int length);
    public abstract String jump(double height);


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
                "swimLimit=" + swimLimit +
                ", jumpLimit=" + jumpLimit +
                '}';
    }
}
