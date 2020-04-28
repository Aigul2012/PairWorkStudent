package PairWorkClasses;

import java.util.ArrayList;

public class Group {
    ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(Student student){
        students.add(student);
    }
    public void deleteStudent(Student student){
        students.remove(student);
    }
    public void changeID(Student student, int studentID){
        student.setStudentID(studentID);
    }
    public Student getStudentID(int id){
        for (Student student:students) {
            if (student.getStudentID()==id)
                return student;
        }
        return new Student();
    }
    public void printAllStudents(){
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
