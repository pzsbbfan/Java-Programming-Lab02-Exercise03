public class Student {
    private String firstName;
    private String lastName;
    private int studentID;

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getStudentID(){
        return studentID;
    }
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public void displayInfo(){
        System.out.println("StudentID: "+studentID+" Firstname: " + firstName + " Lastname: "+lastName);
    }

    public static Student generateStudent(String firstName){
        Student student = new Student();
        student.setFirstName(firstName);
        student.displayInfo();
        return student;
    }

    public static Student generateStudent(String firstName, String lastName){
        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.displayInfo();
        return student;
    }
    public static Student generateStudent(int studentID,String firstName, String lastName){
        Student student = new Student();
        student.setStudentID(studentID);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.displayInfo();
        return student;
    }


}
