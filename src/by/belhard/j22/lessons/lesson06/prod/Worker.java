package by.belhard.j22.lessons.lesson06.prod;

public class Worker extends Person implements Punishable {
    private  static final int QWER_QWER =2;
    private String factoryName;

    public Worker(String name, int age, String factoryName) {
        super(name, age);
        this.factoryName = factoryName;
    }

    @Override
    public int punish(int level) {
        System.out.println(getName() + "sdfs" + (level));
        return level + QWER_QWER;
    }

    @Override
    public void work() {
        System.out.println(getName() + " works hard");
    }

    public String getFactoryName() {
        return factoryName;
    }

    @Override
    public String toString() {
        return "Worker{" + super.toString() +
                " factoryName='" + factoryName + '\'' +
                '}';
    }
}