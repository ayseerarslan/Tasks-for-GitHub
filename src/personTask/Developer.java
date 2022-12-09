package personTask;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, String employeeId, double salary) {
        super(name, age, gender, employeeId, "Developer", salary);
    }

    @Override
    public void work() {
        super.work();
    }

    public void unitTesting(){
        System.out.println(getJobTitle() + " " + getName() + " is doing unit testing");
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
