package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.ClienteDto;
import servicios.ClienteImplementacion;
import servicios.ClienteInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

public class Inicio {

		public static void Main(String[] args) {
			
			MenuInterfaz mi = new MenuImplementacion();
            ClienteInterfaz ci = new ClienteImplementacion();
            GestorDeFicherosInterfaz gf = new GestorDeFicherosImplementacion();
            List<ClienteDto> listaCliente = new ArrayList<ClienteDto>();
            int opcionSeleccionada;
            boolean cerrarMenu = false;
			
            while (!cerrarMenu)
            {
                opcionSeleccionada = mi.mostrarMenuYSeleccion();
                //gf.escribirFichero("Acceso a menú principal");

                switch (opcionSeleccionada)
                {
                    case 0:
                        System.out.println("MENU INICIAL");
                        cerrarMenu = true;
                        break;
                    case 1:
                        System.out.println("VERSION CLIENTE");
                        mi.mostrarMenuCliente();
                        break;
                    case 2:
                        System.out.println("VERSION EMPLEADO");
                        mi.mostrarMenuEmpleado();
                        break;
                    default:
                        System.out.println("[INFO] - La opcion seleccionada no coincide con ninguna");
                        break;
                }
			
		}
	

}
