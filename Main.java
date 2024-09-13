package project;
import java.sql.SQLOutput;

public class Main{
    public static void main(String args[]){
        PayrollSystem payrollSystem= new PayrollSystem();
        FullTimeEmployee emp1=new FullTimeEmployee("john",101,50000.0);
        PartTimeEmployee emp2=new PartTimeEmployee("sam",102,30,15);
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("initial employee details :");
        payrollSystem.displayEmpoyees();

        System.out.println("\n removing Employee....");
        payrollSystem.removeEmployee(101);

        System.out.println("\n remaining employee details :");
        payrollSystem.displayEmpoyees();

    }
}