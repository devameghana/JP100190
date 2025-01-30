
public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        StudentUI studentUI = new StudentUI(studentService);
        studentUI.displayMenu();
    }
}
