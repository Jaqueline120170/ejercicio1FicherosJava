package servicios;

import java.util.List;

import dtos.ClienteDto;

public interface EmpleadoInterfaz {
	public void validarCliente(List<ClienteDto> listaClientes);
	public void borrarCliente(List<ClienteDto> listaClientes);
	public void mostrarCliente(List<ClienteDto> listaClientes);
}
