
import java.util.*;
import java.util.ArrayList;

public class Main {

    private static final ArrayList<Student> students = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("\n===== Student Record Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudent();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        }while(choice != 5);
    }

    private static void addStudent(){
        System.out.print("Enter ID : ");
        int Id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name : ");
        String Name = sc.nextLine();
        System.out.print("Enter Marks : ");
        double Marks = sc.nextDouble();

        students.add(new Student(Id, Name, Marks));
        System.out.println("Student record added successfully");
    }

    private static void viewStudent(){
        if(students.isEmpty()){
            System.out.println("No records found!");
        }else{
            System.out.printf("%-10s %-20s %-10s\n", "ID", "Name", "Marks");
            System.out.println("------------------------------------------------");
            for(Student s : students){
                s.display();
            }
        }
    }

    private static void updateStudent(){
        System.out.print("Enter Student Id to update : ");
        int Id = sc.nextInt();
        boolean found = false;

        for(Student s : students){
            if(s.getId() == Id){
                sc.nextLine();
                System.out.print("Enter new name: ");
                s.setName(sc.nextLine());
                System.out.print("Enter new marks: ");
                s.setMarks(sc.nextDouble());
                System.out.println("Student updated successfully");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Student not found");
        }
    }

    private static void deleteStudent(){
        System.out.print("Enter Student Id to delete : ");
        int Id = sc.nextInt();
        boolean removed = students.removeIf(s -> s.getId() == Id);

        if(removed){
            System.out.println("Student Id removed successfully");
        }else{
            System.out.println("Student not found");
        }
    }
}