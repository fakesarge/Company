package company;

public class Manager extends ARM{

	/**
	 * Manager
	 * @param name of the manager.
	 * @param true or false for active status.
	 * @param years of exp. 
	 */
	public Manager(String name, Boolean active, int yearsOfExp) {
		super(name, active, yearsOfExp);
	}
	
	public Manager() 
	{
		super("name", false, 0);
	}

	/**
	 * Managers Salary
	 */
	public double getSalary() 
	{
		int years = super.getYearsOfExp();
		return super.getSalary() + 1000*years;
	}
	
	/**
	 * Terminate method.
	 * @param the person to terminate.
	 */
	public void terminate(Employee person){
		if(!(person instanceof Manager))
		{
			person.setActive(false);
			Employee.activeEmp--;
			return;
		}
	}
	
	
	@Override
	public String toString() {
		return "Employee - Manager \n"
			+ "Name: "+name+"\n"
			+ "Active: "+active+"\n"
			+ "Years Of Exp: "+yearsOfExp+"\n"
			+ "Severance Pay: $"+this.getSeverance()
			;	
	}
	
	
}
