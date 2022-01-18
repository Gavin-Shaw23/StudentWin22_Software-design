package studentwin22;

public class StudentWin22 {
    public static void main(String [] args){

        Student[] studentList = new Student[3]; //creating an array 

        studentList[0] = new Student ("S1","Ronak Sheth");
        studentList[1] = new Student (" S2","Ben Dover");
        studentList[2] = new Student (" S3","Joe Mama");

        for (int i=0 ;i<studentList.length;i++){
            System.out.print(studentList[i].getStudentId());
            System.out.print("    ");
            System.out.print(studentList[i].getStudentName());

        }
    }
}