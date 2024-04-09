package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.ClienteDto;

public class ClienteImplementacion implements ClienteInterfaz {
	
		Scanner sc = new Scanner (System.in);
	 public void registroCliente(List<ClienteDto> listaAntigua)
     {
         listaAntigua.add(crearNuevoCliente(listaAntigua));
     }

     private ClienteDto crearNuevoCliente(List<ClienteDto> listaAntigua)
     {
         long idCliente;
         String dniCliente;
         String nombreCompletoCliente;
         String emailCliente;
         String contraseniaCliente;

         System.out.println("Introduzca su ID");
         idCliente = calcularNuevoId(listaAntigua);
         System.out.println("Introduzca su DNI");
         dniCliente = sc.next();
         System.out.println("Introduzca nombre completo separado por espacios");
         nombreCompletoCliente=sc.next();
         System.out.println("Introduzca su email");
         emailCliente =sc.next();
         System.out.println("Introduzca su contraseña");
         contraseniaCliente =sc.next();

         gf.sobreEscribir("Alta nuevo cliente");

         ClienteDto cliente = new ClienteDto(idCliente, dniCliente, nombreCompletoCliente, emailCliente, contraseniaCliente);
         return cliente;
     }
     private long calcularNuevoId(List<ClienteDto> listaAntigua)
     {
         long idCalculado;
         int tamanioLista= listaAntigua.size();
         if (tamanioLista == 0)
         {
             idCalculado = 1;
         }
         else
         {
             idCalculado = listaAntigua[tamanioLista-1].IdCliente + 1;
         }
         return idCalculado;

     }
     public void accesoCliente(List<ClienteDto> listaAntigua)
     {
    	 System.out.println("ACCESO CLIENTE");
    	 System.out.println("Email: ");
         String emailAcceso =sc.next();
         System.out.println("Contraseña: ");
         String contraseniaAcceso=sc.next();   

         for(ClienteDto cliente : listaAntigua)
         {
             if (cliente.EmailCliente.Equals(emailAcceso) &
                     cliente.ContraseniaCliente.Equals(contraseniaAcceso) &
                     cliente.EsValidado == true) {
            	 System.out.println("INICIO DE SESION CORRECTO");
             }
         }

         gf.sobreEscribir("Acceso del cliente");
     }

}
