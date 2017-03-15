package co.edu.udea.iw.dto;

/**
 * Clase DTO para gestionar los datos de la tabla Ciudad
 * @author Andr�s Castro andres.castrop@udea.edu.co
 * 
 */
public class Ciudad {

	private Long codigo;			//C�digo de la ciudad en la DB, uso de Long en lugar de long
	private String nombre;			//Nombre de la ciudad en lal DB
	private String codigoArea;		//C�digo de �rea dela ciudad en la DBS
	
	public Long getCodigo() {
		return codigo;
	}
	/**
	 * Se ha modificado el m�todo para el uso de la clase Long en lugar del tipo primitivo long
	 * @param codigo
	 */
	public void setCodigo(long codigo) {
		this.codigo = Long.valueOf(codigo);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigoArea() {
		return codigoArea;
	}
	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}

}
