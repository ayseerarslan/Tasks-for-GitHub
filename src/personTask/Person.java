package personTask;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null ||name.isEmpty() || name.isBlank()){
            System.err.println("Name cannot be empty/null/blank");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age <= 0){
            System.err.println("Age cannot be zer or negative");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
Inheritance Practice
	1. Create a class named Person:
            Variables:
                name, age, gender

            Encapsulate all the fields
            	restrictions for the fields:
            		name can not be empty
            		name can not be null
            		age can not be negative
            		age can not be zero

            Add a constructor to set all the fields
            	(Make sure all the restrictions are applied)

            Methods:
                eat()
                drink()
                sleep()
                toString()


 */