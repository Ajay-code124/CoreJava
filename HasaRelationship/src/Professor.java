
public class Professor {
	
	private String name;
	
	private int exp;
	
	private String subject;
	
	

	public Professor() {
		super();
	}

	public Professor(String name, int exp, String subject) {
		super();
		this.name = name;
		this.exp = exp;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Professor [name=" + name + ", exp=" + exp + ", subject=" + subject + "]";
	}
	
	

}
