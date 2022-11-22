package ar.edu.unlam.pb2.eva03;

public abstract class Poliza {

	protected Integer numeroDePoliza;
	protected Persona asegurado;
	protected Double sumaAsegurada;
	protected Double prima;
	protected Boolean fueRobado;
	protected Boolean tuvoAccidente;
	
	public Poliza(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		
		this.numeroDePoliza = numeroDePoliza;
		this.asegurado = asegurado;
		this.sumaAsegurada = sumaAsegurada;
		this.prima = prima;
		fueRobado = false;
		tuvoAccidente = false;
	}

	public Persona getAsegurado() {
		return asegurado;
	}
	
	public Boolean fueRobado() {
		return fueRobado;
	}
	
	
	public void agregarBienAsegurado(Vivienda casa) {
		
	}
	
	public void agregarBienAsegurado(Auto auto) {
		
	}

	public boolean tuvoAlgunAccidente() {
		return tuvoAccidente;
	}
	
	public abstract void denunciarSiniestro();
}
