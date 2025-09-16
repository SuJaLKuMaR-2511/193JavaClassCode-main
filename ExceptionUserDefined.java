

class InvalidEmployeeId extends Exception{
    InvalidEmployeeId(String message){
        super(message);
    }
}

class Emp_loyee{
    int empid;
    String name;

    Emp_loyee(int empid, String name) throws InvalidEmployeeId{
        if(empid<=0){
            throw new InvalidEmployeeId("Employee ID must be positive");
        }
        this.empid = empid;
        this.name = name;
        System.out.println("Employee created: " + empid + " - " + name);
    }
}

//3. tester class
public class ExceptionUserDefined {
    public static void main(String[] args){
        try{
            Emp_loyee e1 = new Emp_loyee(101,"C++");
            Emp_loyee e2 = new Emp_loyee(0,"JAVA");
        }
        catch(InvalidEmployeeId e){
            System.out.println("Custom Exception: "+e);
        }
    }
    
}

