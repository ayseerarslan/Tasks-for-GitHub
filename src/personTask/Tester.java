package personTask;

public class Tester extends Employee {


    public Tester(String name, int age, char gender, String employeeId, double salary) {
        super(name, age, gender, employeeId, "Tester", salary);
    }

    @Override
    public void work() { // bunu eklemesem de parent class'tan zaten alacak
        super.work();
    }

    public void smokeTesting(){
        System.out.println(getJobTitle() + " " + getName() + " is doing smoke testing");
    }
}

/*
    4. Create the following sub-classes of Employee and override the work method:

    		4.1 Tester:
    				additional methods:
    					smokeTesting()

    		4.2 Developer:
    				additional methods:
    					unitTesting()

		4.3 Teacher

		4.4 Janitor

 */
