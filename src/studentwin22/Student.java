package studentwin22;

public class Student {    //creating a student class 
    //this class will have two 
    private String studentId;
    private String studentName;
    private String studentAddress;
 
    public Student(String studentId,String studentName){  //this is the constructor

        this.studentId=studentId;
        this.studentName=studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

}