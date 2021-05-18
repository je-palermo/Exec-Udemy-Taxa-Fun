package entites;

public class PessoaFisica extends Pessoa {
	
	private Double gastoSaude;
	private static Double imposto = 20000.00;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double calcularTaxa() {
		
		double total = 0;
		
		if (this.getRendaAnual() <= imposto && this.gastoSaude > 0) {
			total += (this.getRendaAnual() * 15 /100) - (this.gastoSaude * 50 / 100);
		} else {
			total += (this.getRendaAnual() * 25 /100) - (this.gastoSaude * 50 / 100);
		}
		return total;
	}

}
