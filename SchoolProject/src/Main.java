public class Main {
    public static void main(String[] args) {
        //instantiating teachers (3)
        Teacher happy = new Teacher("Happy", "Calculator", "math");
        Teacher melody = new Teacher("Melody", "Sanrio", "science");
        Teacher harmony = new Teacher("Harmony", "Alto", "music");

        //instantiating students (10)
        Student cale = new Student("Cale", "Makar", 4);
        Student nathan = new Student("Nathan", "Mackinnon", 12);
        Student elias = new Student("Elias", "Pettersson", 10);
        Student jonathan = new Student("J.T.", "Miller", 9);
        Student taylor = new Student("Taylor", "Swift", 7);
        Student olivia = new Student("Olivia", "Rodrigo", 11);
        Student quinn = new Student("Quinn", "Hughes", 8);
        Student conan = new Student("Conan", "Gray", 3);
        Student justin = new Student("Justin", "Trudeau", 2);
        Student elizabeth = new Student("Elizabeth", "Blackwell", 12);

        School myschool = new School("churchill");
        //adding 3 teachers to teacher list
        myschool.addTeacher(happy);
        myschool.addTeacher(melody);
        myschool.addTeacher(harmony);

        //adding 10 students to student list
        myschool.addStudent(cale);
        myschool.addStudent(nathan);
        myschool.addStudent(elias);
        myschool.addStudent(jonathan);
        myschool.addStudent(taylor);
        myschool.addStudent(olivia);
        myschool.addStudent(quinn);
        myschool.addStudent(conan);
        myschool.addStudent(justin);
        myschool.addStudent(elizabeth);

        //displaying both lists
        myschool.showTeacher();
        myschool.showStudents();

        //myschool.getStudentGrade(4); - getting student grade
        //myschool.setTeacherName(1, "Kitty"); - setting teacher first name

        //removing two students
        myschool.removeStudent(conan);
        myschool.removeStudent(justin);

        //removing a teacher
        myschool.removeTeacher(harmony);

        //displaying both lists
        System.out.println("\nAfter removing:");
        myschool.showStudents();
        myschool.showTeacher();
    }
}