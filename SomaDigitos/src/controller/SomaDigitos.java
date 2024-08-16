package controller;

public class SomaDigitos {

	public SomaDigitos() {
		super();}
	
	public int somaDig(int num, int quantia, String serie) {
		
		if (quantia==0) {
			String valor = String.valueOf(num);
			
			serie = valor.substring(quantia, quantia+1 )+"+"+ serie;
			System.out.println(serie.substring(0,serie.length()-1)+ "=");
			/* muitas gambiarras na hora de mostrar a serie
			 * condicao de parada=0 porque corresponde com o indice da string
			 */
	return(Integer.parseInt(valor.substring(quantia, quantia+1 )));}
	else {
		String valor = String.valueOf(num);
		serie =  valor.substring(quantia, quantia+1 ) +"+" + serie; 
		return Integer.parseInt(valor.substring(quantia, quantia+1 )) + somaDig(num, quantia-1,serie);
	}
		   }
	// digito + digito anterior
	/*
	 *ex: 478
	 *8+7+4 sendo o 4 dado pela primeira condicional  
	 *
	 */

	


}
