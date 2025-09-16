package KIET;

public class HRDepartment {
    public static void main(String[] args) {
        EmployeeKIET ehr = new EmployeeKIET();
        ehr.Emp_Name = "Sujal Kumar HR";
        ehr.Emp_ID = 102;
        ehr.Org = "KIET";
        // ehr.Salary = 20000;

        ehr.EmployeeDetails();
    }
}