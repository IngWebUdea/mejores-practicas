package co.edu.udea.iw.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import co.edu.udea.iw.dao.CiudadDAO;
import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.exception.MyException;
 
/**
 * Prueba para la clase CiudadDAOImpl que imprime la lista de ciudades en consola
 * @author andres
 *
 */
public class CiudadDAOImplTest {

	@Test
	public void testGet() {
		
		CiudadDAO ciudadDAO = null;
		List<Ciudad> ciudades = null;
		StringBuffer output = new StringBuffer();
		
		try{
			ciudadDAO = new CiudadDAOImpl();
			ciudades = ciudadDAO.get();
			
			for(Ciudad ciudad : ciudades){		//optamos por el uso de StringBuffer para la impresión de las ciudades
				output.append(ciudad.getCodigo().toString());
				output.append(": ");
				output.append(ciudad.getNombre());
				System.out.println(output.toString());
				
				output.delete(0, output.length());	//Se limpia el buffer para el sisguiente ciclo
				
			}
			
			assertTrue(ciudades.size() > 0);
		}catch(MyException e){
			fail(e.getMessage());
		}		
		
	}

}
