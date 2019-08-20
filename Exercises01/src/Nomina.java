package clases;

import java.util.Date;

public class Nomina {

	private Date fecha_alta;
    private Date fecha_baja;
    private long sueldo_base;
    private long complemento;
    private final float porcentaje=0.10f;
    
	public float calculaNomina (Date fechaAlta, Date fechaBaja, String categoria) {
		
		if (fechaBaja.compareTo(fechaAlta)>5) {complemento=1000;}
		
		
		long nomina=10_000;
		
		return nomina;
	}
    
}
