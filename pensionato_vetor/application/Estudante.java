package entities;

public class Estudante {
	private String name = null;
	private String email = null;
	
	public Estudante() {		
	}
	
	public Estudante(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return name + ", " + email;
	}
	
	
	
	
}
