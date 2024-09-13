package project;
abstract class Employee{
	private String Ename;
	private int id;
	public Employee(String Ename, int id){
		this.id=id;
		this.Ename=Ename;
	}
	public int getid(){
		return id;
	}
	public String getEname(){
		return Ename;
	}
	public abstract double calculateSalary();
	public String toString(){
		return "Employee[name="+Ename+",id="+id+",salary="+calculateSalary()+"]";
	}

}
 class FullTimeEmployee extends Employee{

	private double MonthlySalary;
	public FullTimeEmployee(String name, int id,double monthlysalary){
		super(name,id);
		this.MonthlySalary=monthlysalary;
	}
	
	public double calculateSalary(){
		return MonthlySalary;
	}
}
 class PartTimeEmployee extends Employee{
	private int hoursWorked;
	private double hourlyRate;
	public PartTimeEmployee(String name,int id,int hoursWorked, double hourlyRate){
		super(name,id);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
	}
	
	public double calculateSalary(){
		return hoursWorked*hourlyRate;
	}
}
