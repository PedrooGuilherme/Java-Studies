
public class Usuario {
	String cpf;
	String nome;
	int id;
	
	
	public Usuario(String cpf,String nome,int id) {
		this.cpf = cpf;
		this.id = id;
		this.nome = nome;
		
	}
	
	public boolean equals(Object outro) {
		// Compara consigo mesmo
		if (outro == this) {
			return true;
		}
		// Objeto Outro é uma instância de usuário?
		if(!(outro instanceof Usuario)) {
			return false;
		}
		
		// TypeCast para usuario:
		Usuario o = (Usuario) outro;
		
		// Compara os atributos são iguais:
		if(this.id == o.id && this.nome==o.nome&& this.cpf==o.cpf) {
			return true;
			
		}
		return false;
	}
}
