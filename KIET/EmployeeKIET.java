package KIET;

public class EmployeeKIET {
    public String Emp_Name;
    protected int Emp_ID;
    String Org;
    private int Salary;

    void EmployeeDetails() {
        System.out.println(Emp_Name + " " + Emp_ID + " " + Org + " " + Salary);
    }

    public static void main(String[] args) {
        EmployeeKIET ek = new EmployeeKIET();
        ek.Emp_Name = "Sujal Kumar KIET";
        ek.Emp_ID = 707;
        ek.Org = "KIET";
        ek.Salary = 18000;

        ek.EmployeeDetails();
    }
}