package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.ClienteDto;

public class MenuImplementacion implements MenuInterfaz {

	
			Scanner sc = new Scanner(System.in);
		 	List<ClienteDto> listaClientes = new ArrayList<ClienteDto> ();
	        
	        public int mostrarMenuYSeleccion()
	        {
	            int opcionIntroducida;

	            System.out.println("##########################");
	            System.out.println("0. Cerra aplicacion");
	            System.out.println("1. Acceder a versión cliente");
	            System.out.println("2. Acceder a versión empleado");
	            System.out.println("Selecciona una opcion: ");

	            opcionIntroducida =sc.nextInt();

	            return opcionIntroducida;
	        }
	        
	        
	        public void mostrarMenuCliente()
	        {
	            ClienteInterfaz ci = new ClienteImplementacion();
	            gf.sobreEscribir("Acceso a menú cliente");
	            int opcionClientes;
	            opcionClientes = mostrarMenuClienteYSeleccion();
	            switch (opcionClientes)
	            {
	                case 0:
	                    break;
	                case 1:
	                    ci.registroCliente(listaClientes);
	                    break;
	                case 2:
	                    ci.accesoCliente(listaClientes);
	                    break;
	                default:
	                	System.out.println("Introduzca una opcion alida");
	                    break;
	            }

	        }
	        private int mostrarMenuClienteYSeleccion()
	        {
	            int opcionCliente;

	            System.out.println("##########################");
	            System.out.println("0. Volver al inicio");
	            System.out.println("1. Registrar Cliente");
	            System.out.println("2. Acceso a cuenta");
	            System.out.println("Selecciona una opcion: ");

	            opcionCliente = sc.nextInt();

	            return opcionCliente;


	        }
	        public void mostrarMenuEmpleado()
	        {
	            EmpleadoInterfaz ei = new EmpleadoImplementacion();
	            gf.sobreEscribir("Acceso a menú empleado");
	            int opcionEmpleado;
	            opcionEmpleado = mostrarMenuEmpleadoYSeleccion();
	            switch( opcionEmpleado)
	            {
	                case 0:
	                    break;
	                case 1:
	                    ei.validarCliente(listaClientes);
	                    break;
	                case 2:
	                    ei.borrarCliente(listaClientes);
	                    break;
	                case 3:
	                    ei.mostrarCliente(listaClientes);
	                    break;
	                default:
	                	System.out.println("Introduzca una opcion valida");
	                    break;
	            }

	        }
	        private int mostrarMenuEmpleadoYSeleccion()
	            {
	                int opcion;
	                System.out.println("##########################");
	                System.out.println("0. Volver al inicio");
	                System.out.println("1. Validar Cliente");
	                System.out.println("2. Borrar cliente");
	                System.out.println("3. Mostrar clientes");
	                System.out.println("Selecciona una opcion: ");
	            opcion= sc.nextInt();
	            return opcion;
	            }

	}


