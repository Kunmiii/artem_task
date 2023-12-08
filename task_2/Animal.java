package artem_task.task_2;

public abstract class Animal {
    private final int runLimit;
    private int swimLimit;
    private final double jumpLimit;
    public Animal(int runLimit, int swimLimit, double jumpLimit){
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
    }

    public  Animal(int runLimit, double jumpLimit){
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }
    public String run(int length){
        return isAbleToRun(length) ? "result: run: true" : "result: run: false";
    }
    public String jump(double height){
        return isAbleToJump(height) ? "result: jump: true" : "result: jump: false";
    }
    public String swim(int length){
        return  isAbleToSwim(length) ? "result: swim: true" : "result: swim: false";
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
                "swimLimit=" + swimLimit +
                ", jumpLimit=" + jumpLimit +
                '}';
    }
}
