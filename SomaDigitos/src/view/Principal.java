 package view;

import javax.swing.JOptionPane;

import controller.SomaDigitos;

public class Principal {

	public static void main(String[] args) {
		int numA;
		int quantidade=0;
		do {
		numA = Integer.parseInt(JOptionPane.showInputDialog("insira numero entre 10 e 999999"));
		}while (numA<0||numA>999999);
		String x= String.valueOf(numA);
		quantidade= x.length()-1;
		
		String serie= "";
		SomaDigitos sn= new SomaDigitos();
		int resp = sn.somaDig(numA, quantidade, serie);
		System.out.println(resp );
	}
	
}
