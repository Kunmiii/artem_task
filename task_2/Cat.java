package artem_task.task_2;

public class Cat extends Animal{

    public Cat(int runLimit, double jumpLimit){
        super(runLimit, jumpLimit);
    }

    @Override
    public String run(int length) {
        return isAbleToRun(length) ? "result: run: true" : "result: run: false";
    }
    public String jump(double height){
        return isAbleToJump(height) ? "result: jump: true" : "result: run: false";
    }

    public String swim(){
        return "result: swim: false";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
