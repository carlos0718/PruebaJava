package daoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.PersonaBancoDao;
import entidad.Persona;
import entidad.PersonaCliente;

public class PersonaBancoDaoImpl implements PersonaBancoDao {

	public PersonaBancoDaoImpl()  {
		// TODO Auto-generated constructor stub
	}
	
	private static final String readAll = "SELECT * FROM usuario";

	@Override
	public ArrayList<Persona> readAllUser() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		PreparedStatement statement;
		ResultSet resultSet;
		ArrayList<Persona> clientes = new ArrayList<Persona>();
		ConexionDB cn = ConexionDB.getConexion();
		
		try 
		{
			statement = cn.getSqlConexion().prepareStatement(readAll);
			resultSet = statement.executeQuery();
			while(resultSet.next())
			{
				clientes.add(getCuenta(resultSet));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return clientes;

	}
	
	private Persona getCuenta(ResultSet resultSet) throws SQLException
	{
		int dni = resultSet.getInt("Dni");
		int cuil = resultSet.getInt("Cuil");
		String nombre = resultSet.getString("Nombre");
		String apellido = resultSet.getString("Apellido");
		String tipoCuenta = resultSet.getString("Tipo de Cuenta");
		return new Persona();
	}
}
