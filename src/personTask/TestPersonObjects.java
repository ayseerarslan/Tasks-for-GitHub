package personTask;

public class TestPersonObjects {

    public static void main(String[] args) {

//        Tester t = new Tester("Ayse", 28, 'F', "0dafgsf", 100000);
//        // Employee id can not start with the character '0'
//        System.out.println(t);

        Tester t = new Tester("Ayse", 28, 'F', "12St", 100000);
        t.work(); // Ayse, with ID: 12St, is working
        t.smokeTesting(); // Tester Ayse is doing smoke testing
        System.out.println(t);
        // Tester{name='Ayse', age=28, gender=F, employeeId='12St', jobTitle=Tester, salary=100000.0}

        Developer d = new Developer("Jack", 30, 'M', "24Dev", 110000);
        d.work(); // Jack, with ID: 24Dev, is working
        d.unitTesting(); // Developer Jack is doing unit testing
        System.out.println(d);
        // Developer{name='Jack', age=30, gender=M, employeeId='24Dev', jobTitle=Developer, salary=110000.0}
        d.setAge(35);
        System.out.println(d.getAge()); // 35

        Student s = new Student("Monica", 15, 'F', "St123", "Math", "Bergen", 'A');
        s.study(); // Monica, with ID: St123, is studying
        s.setName("Helen");
        System.out.println(s.getName()); // Helen
        System.out.println(s);
        // Student{name='Helen', age=15, gender=F, studentId='St123', fieldOfStudy=Math, schoolName=Bergen, grade=A}

        CydeoStudent c = new CydeoStudent("Alex", 30, 'M', "sd123", "Tester", 'A', 51, "groupBla", "Java");
        System.out.println(c);
        //CydeoStudent{name='Alex', age=30, gender=M, studentId='sd123', fieldOfStudy=Tester, schoolName=Cydeo School, grade=A, batchNum='51', groupName=groupBla, progLanguage=Java}

        //c.setProgLanguage("C#");
        // progLanguage must be set to one of the followings:
        //									{"Java", "Python", "JavaScript"}

        // c.setGroupName("0sdfgh"); Group name cannot start with a digit or special characters

        c.study(); // Alex, with ID: sd123, is studying
        c.setFieldOfStudy(" ");
        System.out.println(c.getFieldOfStudy()); // Field of study cannot be empty/null/blank
    }
}
