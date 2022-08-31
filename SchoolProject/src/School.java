import java.util.ArrayList;

public class School {
    //school class, to access teacher and student class methods, then called in main class to use
    //fields and stuff
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<String> courses = new ArrayList<>();

    private String schoolName;

    //constructor
    public School(String schoolName){
        this.schoolName = schoolName;
    }

    //getters and setters
    //setting teacher first name
    public void setTeacherName(int number, String name){
        int i = number;
        teachers.get(i).setTeacherName(name);
    }

    //getting student number
    public int getStudentNum(int number){
        int i = number;
        int num = students.get(i).getStudentNum();
        System.out.print(num);
        return num;
    }

    //getting student grade
    public int getStudentGrade(int number){
        int i = number;
        int num = students.get(i).getGrade();
        System.out.print(num);
        return num;
    }


    //methods

    //adds teacher to list
    public void addTeacher(Teacher nameT){
        teachers.add(nameT);
    }

    //adds students to list

    public void addStudent(Student nameS){
        students.add(nameS);
    }

    //remove teacher from a list
    public void removeTeacher(Teacher nameT){
        int loc = teachers.indexOf(nameT);
        teachers.remove(loc);
    }

    //removing a student from list
    public void removeStudent(Student nameS){
        int loc = students.indexOf(nameS);
        students.remove(loc);
    }

    //printing out teacher list
    public void showTeacher(){
        System.out.println("\nTeacher list:");
        for (int i = 0; i< teachers.size(); i++){
            teachers.get(i).printTeacher();
        }
    }

    //printing out student list
    public void showStudents(){
        System.out.println("\nStudent list: ");
        for (int i = 0; i< students.size(); i++){
            students.get(i).printStudent();
        }
    }




}
