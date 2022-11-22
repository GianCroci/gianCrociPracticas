package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.LinkedList;


public class CompaniaDeSeguro {

	private String nombreCompania;
	private HashMap<Integer, Poliza> polizas;

	public CompaniaDeSeguro(String nombreCompania) {
		
		this.nombreCompania = nombreCompania;
		polizas = new HashMap<Integer, Poliza>();
	}

	public void agregarPoliza(Poliza poliza) {

		polizas.put(poliza.numeroDePoliza, poliza);
	}
	
    public Integer obtenerLaCantidadDePolizasEmitidas() {
	
	return polizas.size();
   }

   public void denunciarSiniestro(Integer numeroDePoliza) throws PolizaInexistente{

	if(polizas.get(numeroDePoliza)==null) {
		throw new PolizaInexistente("Poliza Inexistente");
	}
	   
	polizas.get(numeroDePoliza).denunciarSiniestro();
	
	
   }

   public Poliza getPoliza(Integer numeroDePoliza) {
	return polizas.get(numeroDePoliza);
   }
   
   

}
