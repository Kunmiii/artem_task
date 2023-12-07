package artem_task.task_2;

public class Cat extends Animal{

    public Cat(int runLimit, int swimLimit, double jumpLimit){
        super(runLimit, swimLimit, jumpLimit);
    }
    @Override
    public String run(int length){
        return (isAbleToRun(length)) ? "result: run: true" : "result: run: false";
    }

    @Override
    public String swim(int length) {
        return !isAbleToSwim() ? "result: swim: false" : " ";
    }

    @Override
    public String jump(double height) {
        return isAbleToJump(height) ? "result: jump: true" : "result: jump: false";
    }

    public boolean isAbleToRun(int value){
        return value < runLimit;
    }

    public boolean isAbleToSwim(){
        return  false;
    }

    public  boolean isAbleToJump(double value){
        return  value < jumpLimit;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
