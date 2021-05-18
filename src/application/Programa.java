package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Pessoa;
import entites.PessoaFisica;
import entites.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Insira o número de contribuintes: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.print("Dados do contribuinte nº " +  i + ": ");
			System.out.print("Pessoa física ou jurídica (f / j)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			String nome = sc.next();
			sc.nextLine();
			System.out.print("Renda Anual: ");
			Double rendaAnual = sc.nextDouble();
			
			if(ch == 'f') {
				
				System.out.print("Renda Saúde: ");
				Double gastoSaude = sc.nextDouble();
				
				list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
				
			} else {
				
				System.out.print("Número de empregados: ");
				int numFuncionario = sc.nextInt();
				
				list.add(new PessoaJuridica(nome, rendaAnual, numFuncionario));
				
			} 
		}
		
		double sum = 0.0;
		
		System.out.println();
		System.out.println("IMPOSTOS PAGOS: ");
		for (Pessoa p : list) {
			System.out.println(p.getNome() + " $ " + String.format("%.2f", p.calcularTaxa()));
			sum += p.getRendaAnual();
		}
		
		System.out.println("Total de imposto " + String.format("%.2f", sum));
		
		sc.close();

	}

}
