abstract class College {
  // Abstract methods must be implemented by any concrete subclass.
  abstract void register();

  abstract void infrastructure();

  abstract void students();

  abstract void staff();

  // A concrete method can exist in an abstract class.
  void medicalFacility() {
    System.out.println("Medical facilities are optional.");
  }
}

// KIET is now a top-level class that correctly extends College.
class KIET extends College {
  @Override
  void register() {
    System.out.println("Registration is open for KIET.");
  }

  @Override
  void infrastructure() {
    System.out.println("KIET has a modern infrastructure.");
  }

  @Override
  void students() {
    System.out.println("KIET has a diverse student population.");
  }

  @Override
  void staff() {
    System.out.println("KIET has a qualified staff.");
  }
}

public class AbstractExample {
  public static void main(String[] args) {
    // Instantiation is now simple and correct.
    College college = new KIET();
    college.register();
    college.infrastructure();
    college.students();
    college.staff();
    college.medicalFacility();
  }
}