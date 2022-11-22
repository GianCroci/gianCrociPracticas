package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.Map;

public class PolizaAccidentesPersonales extends Poliza implements SegurosDeVida{
	
	private Map<TipoDeBeneficiario, Persona> beneficiarios;

	public PolizaAccidentesPersonales(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima);
		beneficiarios = new HashMap<TipoDeBeneficiario, Persona>();
	}

	@Override
	public void agregarBeneficiario(Persona beneficiario, TipoDeBeneficiario tipoDeBeneficiario) {
		
		beneficiarios.put(tipoDeBeneficiario, beneficiario);
	}

	

	@Override
	public Object getPremio() {

		Double impuesto = prima * 0.2;
		return prima + impuesto;
	}

	@Override
	public Object obtenerCantidadDeBeneficiario() {
		return beneficiarios.size();
	}

	@Override
	public void denunciarSiniestro() {

		super.tuvoAccidente = true;
	}
	
	

}
