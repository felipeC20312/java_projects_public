package comFactoryMethod;

public abstract class Jogador {
	    private String nome;
	    private String classe;

	    public Jogador(String nome, String classe) {
	        this.setNome(nome);
	        this.setClasse(classe);
	    }

	    public abstract void escolherClasse();

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getClasse() {
			return classe;
		}

		public void setClasse(String classe) {
			this.classe = classe;
		}
	
}
