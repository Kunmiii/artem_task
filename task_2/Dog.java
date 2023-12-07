package artem_task.task_2;

public class Dog extends Animal {

    public Dog(int runLimit, int swimLimit, double jumpLimit){
        super(runLimit, jumpLimit);
        this.swimLimit = swimLimit;
    }

    public String run(int length){
        return isAbleToRun(length) ? "result: run: true" : "result: run: false";
    }

    public String jump(double height){
        return isAbleToJump(height) ? "result: jump: true" : "result: jump: false";
    }

    public String swim(int length){
        return isAbleToSwim(length) ? "result: swim: true" : "result: swim: false";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
