package entities;

public class Rent {

	private String nome;
	private String email;
	private int quarto;
	
	public Rent(String nome, String email, int quarto) {
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return quarto
			+ ": "
			+ nome
			+ ", "
			+ email;
	}
	
}
