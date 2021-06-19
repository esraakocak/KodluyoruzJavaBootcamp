package Homework30;

public class Teacher {
	
	String name;
    String mpno;
    String branch;
    
    
	public Teacher(String name, String mpno, String branch) {
		super();
		this.name = name;
		this.mpno = mpno;
		this.branch = branch;
	}
  void print() {
	  System.out.println("adý "+this.name);
  }
}

