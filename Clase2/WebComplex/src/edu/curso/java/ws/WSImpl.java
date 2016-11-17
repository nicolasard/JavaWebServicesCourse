package edu.curso.java.ws;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "EjemploService")
public class WSImpl {
	@WebMethod(operationName = "recuperarPersonaPorId")
	public Persona recuperarPersonaPorId(@WebParam(name = "idPersona") int idPersona) {
		return new Persona(idPersona, "Juan", "Perez");
	}
	
	@WebMethod(operationName = "recuperarPersonas")
	public Persona[] recuperarPersonas() {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona(1, "persona1", "persona1"));
		personas.add(new Persona(1, "persona2", "persona2"));
		personas.add(new Persona(1, "persona3", "persona3"));
		
		return personas.toArray(new Persona[0]);
	}
}