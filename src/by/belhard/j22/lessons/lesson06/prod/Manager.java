package by.belhard.j22.lessons.lesson06.prod;

public class Manager extends Person implements PhoneCallable, Punishable {
    private  static final int QWER_QWER =5;
    private int phoneNumber;

    public Manager(String name, int age, int phoneNumber) {
        super(name, age);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int punish(int level) {
        System.out.println(getName() + "sdfs" + (level));
        return level + QWER_QWER;
    }

    @Override
    public void work() {
        System.out.println(getName() + " works not hard");
    }

    @Override
    public void phoneCall(int phoneNumber) {
        System.out.println(getName() + "calling " + phoneNumber);
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() +
                " phoneNumber=" + phoneNumber +
                '}';
    }
}
