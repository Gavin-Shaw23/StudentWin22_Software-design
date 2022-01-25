/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentwin22;

/**
 *
 * @author shawg
 */
public class PartTimeStudent extends Student{
    
    private int numCourses;

    public PartTimeStudent(String studentId, String studentName,int numCourses) {
        //special word super for the constructor 
        super(studentId, studentName);
        this.numCourses = numCourses;
    }
    

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
}
