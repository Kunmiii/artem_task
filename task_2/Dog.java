package artem_task.task_2;

public class Dog extends Animal {

    public Dog(int runLimit, int swimLimit, double jumpLimit){
        super(runLimit, swimLimit, jumpLimit);
    }

    @Override
    public String run(int length){
        return isAbleToRun(length) ? "result: run: true" : "result: run: false";
    }

    @Override
    public String swim(int length) {
        return isAbleToSwim(length) ? "result: swim: true" : "result: swim: false";
    }

    @Override
    public String jump(double height) {
        return isAbleToJump(height) ? "result: jump: true" : "result: jump: false";
    }

    public boolean isAbleToRun(int value){
        return value < runLimit;
    }
    public boolean isAbleToSwim(int value){
        return value < swimLimit;
    }
    public boolean isAbleToJump(double value){ return value < jumpLimit; }

    @Override
    public String toString() {
        return super.toString();
    }
}
