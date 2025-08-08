
public class Department extends Professor {
	
	private String depname;
	private int count;
	private Professor professor;
	
	public Department() {
		
	}
	public Department(String depname, int count, Professor professor) {
		super();
		this.depname = depname;
		this.count = count;
		this.professor = professor;
	}
	public String getDepname() {
		return depname;
	}
	public void setDepname(String depname) {
		this.depname = depname;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	@Override
	public String toString() {
		return "Department [depname=" + depname + ", count=" + count + ", professor=" + professor + "]";
	}
	
	
	
	

}
