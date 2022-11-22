package ar.edu.unlam.pb2.eva03;

public class PolizaDeAuto extends Poliza implements SegurosGenerales {


	private Auto autoAsegurado;

	public PolizaDeAuto(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima);
	}

	@Override
	public void agregarBienAsegurado(Auto auto) {

		this.autoAsegurado = auto;
	}

	

	@Override
	public Auto getAuto() {
		return autoAsegurado;
	}

	@Override
	public Persona getAsegurado() {
		return asegurado;
	}

	@Override
	public Double getPremio() {

		Double impuesto = prima * 0.2;
		return prima + impuesto;
	}

	@Override
	public Integer getNumeroDePoliza() {
		return numeroDePoliza;
	}

	@Override
	public void denunciarSiniestro() {
		super.fueRobado = true;
	}
	
	

}
