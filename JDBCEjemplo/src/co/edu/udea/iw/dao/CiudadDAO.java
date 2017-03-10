package co.edu.udea.iw.dao;


import java.util.List;

import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.exception.MyException;

/**
 * Interface que define los m�todos permitidos para la Ciudades en el sistema 
 * 
 * @author Andr�s Castro andres.castrop@udea.edu.co
 *
 */
public interface CiudadDAO {
	
	/**
	 * Obtiene la lista de ciudades en el sistema, ordenadas alfab�ticamente por nombre.
	 * @return Lista de ciudades.
	 * @throws MyException Ocurre cuando hay probelas con la conexi�n a la DB.
	 */
	public List<Ciudad> get() throws MyException;
}
