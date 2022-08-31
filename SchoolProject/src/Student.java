public class Student {
    //student class to set up methods, getters and setters -> created unique student number
    //fields
    private String firstName;
    private String lastName;
    private int grade;
    //se
    private int studentNum = (int)(Math.random() * 1000000);

    //constructor
    public Student(String firstName, String lastName, int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    //getters and setters
    public int getStudentNum() {
        return studentNum;
    }

    public int getGrade(){
        return grade;
    }

    public void setFirstName(String name){
        this.firstName = name;
    }

    public void setLastName(String name){
        this.lastName = name;
    }
    //methods
    //printing name and grade
    public void printStudent(){
        System.out.println("Name: " + this.firstName + " " + this.lastName + "  Grade: " + this.grade);
    }


}
