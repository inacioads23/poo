package one.digitalinnovation.oo;

public class Carro {

	// Atributos
	String cor;
	String modelo;
	int capacidadeTanque;

	// Construtor
	/* Construtor vazio */
	public Carro() {

	}

	/* Constutor com parâmetros - exmplo de sobrecarga */
	public Carro(String cor, String modelo, int capacidadeTanque) {
		this.cor = cor; //o this está dizendo que o valor que entrar através do contrutor, irá ser carregado nos atributos lá encima
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}

	// Getters e Setters
	/* get - me retorne/ devolva */
	public String getCor() {
		return cor;
	}

	/* set - permite inserir um valor no atributos */
	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	// Métodos de négocios
	/* método calcula o valor para encher o tanque do carro */
	public double totalValorTanque(double valorCombustível) {
		return capacidadeTanque * valorCombustível;
	}

}