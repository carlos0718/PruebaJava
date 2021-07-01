package dao;

import java.util.List;

import entidad.Cuenta;
import entidad.Persona;
import entidad.PersonaCliente;

public interface PersonaBancoDao {
	
	public List<Persona> readAllUser();
}
