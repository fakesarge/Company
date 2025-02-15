package company;

public class AtoARM extends Employee{
	protected double hourlyrate;
	
	/**
	 * AtoARM
	 * @param name of the AtoARM
	 * @param active status of the AtoARM
	 * @param yearsOfExp
	 * @param hourlyrate
	 */
	public AtoARM(String name, Boolean active, int yearsOfExp,double hourlyrate) {
		super(name,active,yearsOfExp);
		this.hourlyrate = hourlyrate;
	}
	
	public AtoARM() 
	{
		super("name",false,0);
		this.hourlyrate = 0;
	}
	
	/**
	 * Gets the salary of AtoARM
	 */
	public double getSalary(){
		return 40*hourlyrate*52;	
	}
	
	/**
	 * Promote 
	 * @param person to promote
	 * @param hourlyRate of the promoted person.
	 * @return
	 */
	public static AtoARM promote(Employee person,double hourlyRate) 
	{
		AtoARM output = new AtoARM(person.getName(),person.getActive(),person.getYearsOfExp(), hourlyRate);
		person.setActive(false);
		Employee.totalEmp--;
		return output; 
	}
	
	
	@Override
	public double getSeverance() {
		if(this.active){return 0;}else{
		return ((4.5*3)*40)* this.hourlyrate;}
	}
	
	
	@Override
	public String toString() {
		return "Employee - AtoARM \n"
			+ "Name: "+name+"\n"
			+ "Active: "+active+"\n"
			+ "Years Of Exp: "+yearsOfExp+"\n"
			+ "Hourly Rate: "+ hourlyrate+"\n"
			+ "Severance Pay: $"+this.getSeverance()
			;	
	}
}
