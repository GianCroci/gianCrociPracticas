package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PolizaCombinadoFamiliar extends Poliza implements SegurosGenerales, SegurosDeVida{

	private HashSet<Vivienda> casaAsegurada;
	private Map<TipoDeBeneficiario, Persona> beneficiarios;
	
	public PolizaCombinadoFamiliar(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima);
		beneficiarios = new HashMap<TipoDeBeneficiario, Persona>();
		casaAsegurada = new HashSet<Vivienda>();
	}
	
	
	
	
	@Override
	public void agregarBeneficiario(Persona beneficiario, TipoDeBeneficiario tipoDeBeneficiario) {

		beneficiarios.put(tipoDeBeneficiario, beneficiario);
	}

	@Override
	public Integer obtenerCantidadDeBeneficiario() {
		return beneficiarios.size();
	}

	@Override
	public void agregarBienAsegurado(Vivienda casa) {

		casaAsegurada.add(casa);
	}

	@Override
	public Integer getNumeroDePoliza() {
		return numeroDePoliza;
	}

	@Override
	public Auto getAuto() {
		// TODO Auto-generated method stub
		return null;
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
	public void agregarBienAsegurado(Auto auto) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void denunciarSiniestro() {
		// TODO Auto-generated method stub
		
	}






}
