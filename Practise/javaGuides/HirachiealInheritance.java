// Superclass
class Employee {
    String name;
    int employeeId;

    // Constructor
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Employee ID: " + employeeId);
    }
}

// Subclass 1
class Manager extends Employee {
    String department;

    // Constructor
    public Manager(String name, int employeeId, String department) {
        super(name, employeeId); // Call to superclass constructor
        this.department = department;
    }

    public void displayDetails() {
        super.displayDetails(); // Call to superclass method
        System.out.println("Department: " + department);
    }
}

// Subclass 2
class Developer extends Employee {
    String programmingLanguage;

    // Constructor
    public Developer(String name, int employeeId, String programmingLanguage) {
        super(name, employeeId); // Call to superclass constructor
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDetails() {
        super.displayDetails(); // Call to superclass method
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class HirachiealInheritance {
    public static void main(String[] args) {
        // Creating objects of Manager and Developer classes
        Manager manager = new Manager("Alice", 101, "HR");
        Developer developer = new Developer("Bob", 102, "Java");

        // Displaying details
        manager.displayDetails();
        developer.displayDetails();
    }
}