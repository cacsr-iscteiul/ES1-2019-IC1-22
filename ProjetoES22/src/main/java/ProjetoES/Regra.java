
package ProjetoES;

public class Regra {
	
	private Comparador comparadorCima;
	private Comparador comparadorBaixo;
	private int valorCima;
	private int valorBaixo;
	private Metrica metricaCima;
	private Metrica metricaBaixo;
	private AndOr andOr;
	
	public AndOr getAndOr() {
		return andOr;
	} 

	public void setAndOr(AndOr andOr) {
		this.andOr = andOr;
	}

	//	public Regra(int id, Comparador comparador, int valor, Metrica metrica) {
//		this.id = id;
//		this.comparador = comparador;
//		this.valor = valor;
//		this.metrica = metrica;
//	}
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

	public Comparador getComparadorCima() {
		return comparadorCima;
	}
	public void setComparadorCima(Comparador comparador) {
		this.comparadorCima = comparador;
	}
	public Comparador getComparadorBaixo() {
		return comparadorBaixo;
	}
	public void setComparadorBaixo(Comparador comparador2) {
		this.comparadorBaixo = comparador2;
	}
	public int getValorCima() {
		return valorCima;
	}
	public void setValorCima(int valor) {
		this.valorCima = valor;
	}
	public int getValorBaixo() {
		return valorBaixo;
	}
	public void setValorBaixo(int valor2) {
		this.valorBaixo = valor2;
	}
	public Metrica getMetricaCima() {
		return metricaCima;
	}
	public void setMetricaCima(Metrica metrica) {
		this.metricaCima = metrica;
	}
	public Metrica getMetricaBaixo() {
		return metricaBaixo;
	}
	public void setMetricaBaixo(Metrica metrica2) {
		this.metricaBaixo = metrica2;
	}
}