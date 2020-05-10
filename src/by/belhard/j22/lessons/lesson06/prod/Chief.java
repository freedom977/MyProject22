package by.belhard.j22.lessons.lesson06.prod;

public class Chief extends Person implements PhoneCallable {
    public Chief(String name, int age) {
        super(name, age);
    }

    @Override

        public void work() {
            System.out.println(getName() + " works not hard");
        }



    @Override
    public void phoneCall(int phoneNumber) {
        System.out.println(getName() + "calling " + phoneNumber + "like a boss");


    }
}
