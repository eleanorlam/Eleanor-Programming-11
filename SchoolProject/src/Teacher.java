public class Teacher {
    //teacher class to set up methods, getters and setters
    //fields
    private String firstName;
    private String lastName;
    private String subject;

    //constructor
    public Teacher(String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    //getters and setters
    public void setTeacherName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    //methods
    //printing teacher name and subject
    public void printTeacher(){
        System.out.println("Name: " + this.firstName + " " + this.lastName + " Subject: " + this.subject);
    }

}
