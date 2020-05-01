package by.belhard.j22.lessons.lesson03.personExample;

public class Person {

    private String name;
    private int age;
    private Country country;
    private Sex sex;


    public Person(String name, int age, Country country, Sex sex) {

    }

    public Person(String vasiliy, int i, Country belarus) {
    }

    public void walk() {
        System.out.println("I'm walking");
    }

    public void eat(String dish) {
        System.out.println("I'm eating  " + dish);
    }

    public int growOld() {
        return ++age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }


    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
