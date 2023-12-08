package artem_task.task_2;

public class Cat extends Animal{

    public Cat(int runLimit, double jumpLimit){
        super(runLimit, jumpLimit);
    }

    public String swim(){
        return "result: swim: false";
    }
}
