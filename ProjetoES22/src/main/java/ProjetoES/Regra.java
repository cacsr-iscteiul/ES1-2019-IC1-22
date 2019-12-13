package ProjetoES;

/**Representa as regras aplicadas
*author Marta Cabral
*/


public class Regra {
	
	private Comparador comparadorCima;
	private Comparador comparadorBaixo;
	private int valorCima;
	private int valorBaixo;
	private Metrica metricaCima;
	private Metrica metricaBaixo;
	private AndOr andOr;
	
	
	/**Devolve um valor da classe AndOr que pode ser And ou Or.
	*@return O valor and ou or.
	*/

	
	public AndOr getAndOr() {
		return andOr;
	} 
	
	/**Altera valor AndOr.
	*@param andOr valor que vai ser atribuído.
	*/


	public void setAndOr(AndOr andOr) {
		this.andOr = andOr;
	}

	//	public Regra(int id, Comparador comparador, int valor, Metrica metrica) {
//		this.id = id;
//		this.comparador = comparador;
//		this.valor = valor;
//		this.metrica = metrica;
//	}
	
	/**Aplica a regra.
	*@param comparador valor que vai ser comparado na regra.
	*@param comparador2 valor que vai ser comparado na regra.
	*@param valor valor do threshold.
	*@param valor2 valor do threshold.
	*@param metrica metrica utilizada.
	*@param metrica2 metrica utilizada.
	*@param a valor atribuido.
	*/
	
	
	
	public Regra(Comparador comparador, Comparador comaparador2, int valor, int valor2, Metrica metrica,
			Metrica metrica2,AndOr a) {
		this.comparadorCima = comparador;
		this.comparadorBaixo = comaparador2;
		this.valorCima = valor;
		this.valorBaixo = valor2;
		this.metricaCima = metrica;
		this.metricaBaixo = metrica2;
		this.andOr=a;
	}
	
	/**Devolve valor do Comparador.
	 * @return O valor que vai ser comparado na regra.
	*/


	public Comparador getComparadorCima() {
		return comparadorCima;
	}
	
	/**Altera valor do Comparador.
	*@param comparador valor que vai ser atribuído.
	*/

	public void setComparadorCima(Comparador comparador) {
		this.comparadorCima = comparador;
	}
	/**Devolve valor do Comparador.
	 * @return O valor que vai ser comparado na regra.
	*/

	public Comparador getComparadorBaixo() {
		return comparadorBaixo;
	}
	
	/**Altera valor Comparador.
	*@param comparador2 valor que vai ser comparado na regra.
	*/

	public void setComparadorBaixo(Comparador comparador2) {
		this.comparadorBaixo = comparador2;
	}
	
	/**Devolve um valor do threshold.
	*@return O valor do threshold de cima.
	*/

	public int getValorCima() {
		return valorCima;
	}
	
	/**Altera valor do thershold.
	*@param valor valor do threshold de cima.
	*/

	public void setValorCima(int valor) {
		this.valorCima = valor;
	}
	
	/**Devolve um valor do threshold.
	*@return O valor do threshold de baixo.
	*/

	public int getValorBaixo() {
		return valorBaixo;
	}
	
	/**Altera valor2.
	*@param valor2 valor do threshold de baixo.
	*/

	public void setValorBaixo(int valor2) {
		this.valorBaixo = valor2;
	}
	
	/**Devolve um valor da classe Metrica.
	*@return O valor da metrica.
	*/

	public Metrica getMetricaCima() {
		return metricaCima;
	}
	
	/**Altera valor Metrica.
	*@param metrica metrica utilizada.
	*/

	public void setMetricaCima(Metrica metrica) {
		this.metricaCima = metrica;
	}
	
	/**Devolve um valor da classe Metrica.
	*@return O valor da metrica utilizada.
	*/

	public Metrica getMetricaBaixo() {
		return metricaBaixo;
	}
	
	/**Altera valor Metrica.
	*@param metrica2 metrica utilizada.
	*/

	public void setMetricaBaixo(Metrica metrica2) {
		this.metricaBaixo = metrica2;
	}
}
