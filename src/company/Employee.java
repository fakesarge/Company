package company;

public class Employee {
	public String name;
	public Boolean active;
	public int yearsOfExp;
	public static int totalEmp,activeEmp,baseSal = 5000;
	
	/**
	 * Employee 
	 */
	public Employee() 
	{
		super();
		this.name = "Michael";
		this.active = false;
		this.yearsOfExp = 0;
		activeEmp--;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public int getYearsOfExp() {
		return yearsOfExp;
	}

	public void setYearsOfExp(int yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}

	/**
	 * Employee
	 * @param name of the employee
	 * @param active status of the employee
	 * @param yearsOfExp
	 */
	public Employee(String name, Boolean active, int yearsOfExp) {
		super();
		this.name = name;
		this.active = active;
		this.yearsOfExp = yearsOfExp;
		Employee.totalEmp++;
		if(active) {
			Employee.activeEmp++;
		}
	}
	
	/**
	 * Gets the base salary of employee
	 * @return
	 */
	public double getSalary(){
		return baseSal;	
	}
	
	@Override
	public String toString() {
		return "Employee \n"
			+ "Name: "+name+"\n"
			+ "Active: "+active+"\n"
			+ "Years Of Exp: "+yearsOfExp+"\n"
			+ "Severance Pay: $"+this.getSeverance()	
			;	
	}
	
	/**
	 * Employees Severance pay.
	 * @return the amount of severance pay.
	 */
	public double getSeverance() 
	{
		return 0;
	}

	
}
