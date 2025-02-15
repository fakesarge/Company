package company;

public class ARM extends Employee{

	/**
	 * ARM Class
	 * @param Name of the ARM
	 * @param Activity of the ARM (true,false)
	 * @param Years of exp.
	 */
	public ARM(String name, Boolean active, int yearsOfExp) {
		super(name,active,yearsOfExp);
	}
	
	/**
	 * Default Constructor makes a ARM Employee named default, not active and 0 years of exp.
	 */
	public ARM() 
	{
		super("name",false,0);
	}
	
	public double getSeverance() {
		if (this.active) {return 0;}else {
		return (this.getSalary()/4);
		}
	}
	
	public double getSalary()
	{
		int years = super.getYearsOfExp();
		return super.getSalary()*Math.pow(1.05, years);
	}
	
	
	/**
	 * Demote
	 * @param person to demote
	 * @return
	 */
	public static Employee demote(ARM person) 
	{
		Employee output = new Employee(person.getName(),person.getActive(),person.getYearsOfExp());
		person.setActive(false);
		Employee.totalEmp--;Employee.activeEmp--;
		return output; 
		
	}

	@Override
	public String toString() {
		return "Employee - ARM \n"
			+ "Name: "+name+"\n"
			+ "Active: "+active+"\n"
			+ "Years Of Exp: "+yearsOfExp+"\n"
			+ "Severance Pay: $"+this.getSeverance()
			;	
	}
	
	
	
}
