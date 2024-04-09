package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.ClienteDto;

public class EmpleadoImplementacion implements EmpleadoInterfaz {
	
	Scanner sc = new Scanner (System.in);
	public void validarCliente(List<ClienteDto> listaClientes)
    {
		System.out.println("Clientes no validados");
        List <ClienteDto> listaAuxiliar= new ArrayList<ClienteDto>();

        for(ClienteDto cliente : listaClientes)
        {
            if (cliente.EsValidado== false)  
            {
            	System.out.println("///////////////////////");
            	System.out.println("DNI: " + cliente.DniCliente);
            	System.out.println("Nombre: " + cliente.NombreCompletoCliente);
            	System.out.println("///////////////////////");
                listaAuxiliar.add(cliente);
            }
        }
        if(listaAuxiliar.Count>0)
        System.out.println("Indica el dni del cliente a validar: ");
        String  dniClienteAValidar = sc.next();
        for(ClienteDto clienteDto : listaClientes)
        {
            clienteDto.EsValidado =true;
            System.out.println("Cliente con dni " + dniClienteAValidar);
        }

        gf.sobreEscribir("Validacion nuevo cliente");
    }
	
    public void borrarCliente(List<ClienteDto> listaClientes)
    {
    	System.out.println("Borrar Cliente");
        if (listaClientes.size > 0)
        {
        	System.out.println("Indica el dni del cliente a borrar: ");
            String dniClienteABorrar = sc.next();
            ClienteDto clienteAuxiliar = new ClienteDto();
            for(ClienteDto clienteDto :listaClientes)
            {
                if (clienteDto.DniCliente.Equals(dniClienteABorrar))
                {
                    clienteAuxiliar = clienteDto;
                }
                
            }
            listaClientes.remove(clienteAuxiliar);
            System.out.println("Cliente con dni " + dniClienteABorrar);
        }

        //gf.escribirFichero("Cliente borrado");
    }
    
    
    public void mostrarCliente(List<ClienteDto> listaClientes)
    {
        for(ClienteDto cliente: listaClientes)
        {
        	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        	System.out.println("DNI: " + cliente.DniCliente);
        	System.out.println("Nombre: " + cliente.Apellido1Cliente + " " + cliente.Apellido2Cliente + " " + cliente.NombreCliente);
            String sn;
            if (cliente.EsValidado == true)
            {
                sn = "si";
            }
            else
            {
                sn = "no";
            }
            System.out.println("ESTADO VALIDACIÓN: " + sn );
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        }

       // gf.escribirFichero("Mostrar lista de clientes");
    }
}
