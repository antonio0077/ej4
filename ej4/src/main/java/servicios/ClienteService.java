package servicios;

import java.util.List;

import entidades.Cliente;


public interface ClienteService {
	
	void guardar(Cliente cliente);
	List<Cliente> buscarTodos();
	List<Cliente> buscarNombreApellido(String nombre, String apellido);
	void borrar(Cliente cliente);
	void crearDatosDummy();
	void mostrarTodos();
}
