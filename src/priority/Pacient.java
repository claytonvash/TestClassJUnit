package priority;

public class Pacient implements Comparable<Object>{
    
    
	private String nome;
	private Integer idade;
	private String  classificacao;
	private Integer prioridade;
					

	public Pacient() {}
	
	   public String toString() {
	   return this.getNome()+ ' '+ this.getPrioridade();
	    }

	public Pacient(String nome, Integer idade, String classificacao, Integer prioridade) {
		this.nome = nome;
		this.idade = idade;
		this.classificacao = classificacao;
		this.prioridade = prioridade;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	public String getClassificacao() {
		return classificacao;
	}


	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}


	public Integer getPrioridade() {
		return prioridade;
	}


	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}

	@Override
	public int compareTo(Object o) {
		
		Pacient p = (Pacient) o;
	
		 if (this.prioridade > p.prioridade) {
	            return -1;
	        }
	        if (this.prioridade < p.prioridade) {
	            return 1;
	        }
	        return 0;
		
	}
        public Pacient getPacient(){
            return new Pacient(nome,idade,classificacao,prioridade);
        }
}