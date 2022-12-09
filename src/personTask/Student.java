package personTask;

public class Student extends Person {

    private String studentId, fieldOfStudy, schoolName;
    private char grade;

    public Student(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setSchoolName(schoolName);
        setGrade(grade);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {

        if (fieldOfStudy == null || fieldOfStudy.isEmpty() || fieldOfStudy.isBlank()){
            System.err.println("Field of study cannot be empty/null/blank");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void study(){
        System.out.println(getName() + ", with ID: " + studentId + ", is studying");
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", studentId='" + studentId + '\'' +
                ", fieldOfStudy=" + fieldOfStudy +
                ", schoolName=" + schoolName +
                ", grade=" + grade +
                '}';
    }
}
/*
 3. Create a sub-class of Person named Student
            Extra variables:
                studentId, fieldOfStudy, schoolName, grade

            Encapsulate all the fields
            	restrictions:
            		fieldOfStudy can not

            Add a constructor to set all the fields

            Encapsulate all the fields

            Methods:
                study()
                toString()

 */