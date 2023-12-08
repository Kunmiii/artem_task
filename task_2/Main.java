package artem_task.task_2;

public class Main {
    public static void main(String[] args) {
       Animal Jack = new Dog(500, 10, 0.5);
       Animal Shally = new Cat(200, 10);

        System.out.println(Jack.jump(10));
        System.out.println(Shally.swim(20));
    }
}
