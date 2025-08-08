
public class Test {

 public static void main(String[] args) {
	 
	 Professor professor = new Professor("Ramesh",10, "Java");
	 
	Department d1 = new Department();
    d1.setDepname("CSE");
    d1.setCount(102);
	d1.setProfessor(professor);
	
	System.out.println(d1.toString());
	
	Department d2 = new Department();
    d2.setDepname("ECE");
    d2.setCount(115);
	d2.setProfessor(new Professor("Sandeep", 8, "Maths"));
	System.out.println(d2.toString());
	
	
	Professor p = new Professor("Pranneth",6,"Electronics");
	Department d3 = new Department("EEE", 120, p);
	System.out.println(d3);
	
	
}
}
