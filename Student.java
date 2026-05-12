public class Student {
    private String id;
    private String name;
    private String major;
    private double gpa;
    
    // constructor
    public Student(String id, String name, String major, double gpa) {
        this.id = id;
        this.name = name;
        this.major = major;
        // check gpa
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            this.gpa = 0.0;
        }
    }
    
    // getters
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getMajor() {
        return major;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    // change major 
    public void changeMajor(String newMajor) {
        if (newMajor != null && !newMajor.equals("")) {
            major = newMajor;
        }
    }
    
    // update gpa
    public void updateGpa(double newGpa) {
        if (newGpa >= 0.0 && newGpa <= 4.0) {
            gpa = newGpa;
        } else {
            gpa = 0.0;
        }
    }
    
    // for printing
    public String toString() {
        return id + " | " + name + " | " + major + " | " + gpa;
    }
}
