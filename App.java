import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        // making student
        Student s1 = new Student("2024001", "Thabo", "CS", 3.2);
        Student s2 = new Student("2024002", "Goitse", "Maths", 2.8);
        
        // test invalid GPA in constructor
        System.out.println("Testing invalid GPA constructor:");
        Student s3 = new Student("2024003", "Kabelo", "Physics", 5.5);
        System.out.println(s3);  
        
        System.out.println("\nStudents:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        // test methods
        s1.updateGpa(3.5);
        s1.changeMajor("Software");
        System.out.println("After update: " + s1);
        
        // test invalid GPA update
        System.out.println("\nTesting invalid GPA update:");
        s2.updateGpa(6.0);
        System.out.println(s2);  
        
        // arraylist
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        
        System.out.println("\nLooping through list:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        
        // bank account
        BankAccount acc = new BankAccount("ACC123", "Thabo", 500.0);
        System.out.println("\nBalance: P" + acc.getBalance());
        
        acc.deposit(200);
        System.out.println("After deposit: P" + acc.getBalance());
        
        boolean worked = acc.withdraw(100);
        System.out.println("Withdraw P100 success? " + worked);
        System.out.println("Final balance: P" + acc.getBalance());
        
        // test failed withdraw
        boolean failed = acc.withdraw(1000);
        System.out.println("Withdraw P1000 success? " + failed);
        
        // test invalid initial balance
        System.out.println("\nTesting invalid initial balance:");
        BankAccount acc2 = new BankAccount("ACC999", "Test", -50.0);
        System.out.println(acc2);  
    }
}
