package entities;

public class Triangulo {

	private Double base;
	private Double altura;

	public Triangulo() {
	}

	public Triangulo(Double base, Double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double area() {
		return getBase() * getAltura() / 2;
	}

}
