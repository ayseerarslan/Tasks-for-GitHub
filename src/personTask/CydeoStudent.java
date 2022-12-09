package personTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CydeoStudent extends Student {

    private int batchNum;
    private String groupName, progLanguage;

    public CydeoStudent(String name, int age, char gender, String studentId, String fieldOfStudy, char grade, int batchNum, String groupName, String progLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, "Cydeo School", grade);
        setBatchNum(batchNum);
        setGroupName(groupName);
        setProgLanguage(progLanguage);
    }

    public int getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(int batchNum) {

        if (batchNum <= 0) {
            System.err.println("Batch number cannot be zero or negative");
            System.exit(1);
        }
        this.batchNum = batchNum;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {

        if (groupName == null || groupName.isEmpty()) {
            System.err.println("Group name cannot be null/empty");
            System.exit(1);
        }

        if (Character.isDigit(groupName.charAt(0)) || !Character.isLetterOrDigit(groupName.charAt(0))) {
            System.err.println("Group name cannot start with a digit or special characters");
            System.exit(1);
        }
        this.groupName = groupName;
    }

    public String getProgLanguage() {
        return progLanguage;
    }

    public void setProgLanguage(String progLanguage) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Java", "Python", "JavaScript"));

        if (!list.contains(progLanguage)) {

            System.err.println("progLanguage must be set to one of the followings:\n" +
                    "\t\t\t\t\t\t\t\t\t{\"Java\", \"Python\", \"JavaScript\"}");
            System.exit(1);
        }

        this.progLanguage = progLanguage;
    }


    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", batchNum='" + batchNum + '\'' +
                ", groupName=" + groupName +
                ", progLanguage=" + progLanguage +
                '}';
    }
}
/*
5.3 CydeoStudent
					Additional Variables:
						batchNum, groupName, progLanguage

						Encapsulate all the fields
							restrictions for the fields:
								batch number can not be zero or negative
								groupName can not be empty or null
								groupName can not start with a digit or special characters
								progLanguage must be set to one of the followings:
									{"Java", "Python", "JavaScript"}

					Override the toString method to make sure that batchNum, groupName, progLanguage are included when the object of CydeoStudent is printed


 */