class EmployeePoly {
  String empName;

  void details() {
    System.out.println("Name: " + empName);
  }

  // Overloaded method
  void details(int salary, String company) {
    System.out.println("Salary: " + salary + ", Company: " + company);
  }

  // Overloaded method with different parameter order
  void details(String company, int salary) {
    System.out.println("Institute name: " + company + ", Salary: " + salary);
  }
}

class FacultyMember extends EmployeePoly {
  @Override
  void details() {
    super.details();
    System.out.println("Welcome Faculties");
  }
}

public class Polymorphism {
  public static void main(String[] args) {
    FacultyMember f = new FacultyMember();
    f.empName = "Dr. Smith";

    // This calls the overridden details() method in the FacultyMember class.
    f.details();

    // These call the overloaded details() methods from the EmployeePoly class.
    f.details(90000, "KIET");
    f.details("KIET", 90000);
  }
}