package entites;

public class PessoaJuridica extends Pessoa {
	
	private Integer numFuncionario;
	
	public PessoaJuridica () {
		super();
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionario) {
		super(nome, rendaAnual);
		this.numFuncionario = numFuncionario;
	}

	public Integer getNumFuncionario() {
		return numFuncionario;
	}

	public void setNumFuncionario(Integer numFuncionario) {
		this.numFuncionario = numFuncionario;
	}

	@Override
	public Double calcularTaxa() {
		double total = 0;
		if (this.numFuncionario > 10) {
			total += getRendaAnual() * 14/100;
		} else {
			total += getRendaAnual() * 16/100;
		}
		return total;
	}

}
