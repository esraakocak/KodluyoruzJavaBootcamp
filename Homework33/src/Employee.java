
public class Employee {
	private String name;
	private int salary;
	private int workHours;
	private int hireYear;
	
	public Employee () {
		
	}
	
	public Employee(String name, int salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public int tax () {
		int tax;
		if(this.salary <1000) {
			System.out.println("vergi uygulanmadý");
			tax=0;
		}else {
			tax=(int) (this.salary*0.03);
			
		}
		return tax;
		
		
	}
 public int bonus() {
     return (int) (this.workHours*0.30);
 }
 
 public int  raiseSalary(){
     int tmp = 2021 - this.hireYear;
   int zam = 0;
     if (tmp < 10) {
         zam = (int) (this.salary * 0.05);
     }else if(tmp > 9 && tmp < 20){
         zam = (int) (this.salary * 0.10);
     }else if(tmp > 19){
         zam = (int) (this.salary * 0.15);
     }
     return zam;
 }
	
	public String toString() {
		
		return "adý"+this.name+" "+"çalýþsanýn maaþý"+this.salary+" "+"haftalýk çalýþma saati"+this.workHours+" "+"iþe baþlangýç yýlý "+this.hireYear;
		
	}
	
	
	

}
