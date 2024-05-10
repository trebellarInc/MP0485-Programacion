package Ejercicios.Entrega2_UD09;

import java.util.ArrayList;

public class Principal {


    public static void main(String[] args) {
        System.out.println("Inicio Entrega 02 - UD09");

        ArrayList<Cliente> listaClientes =  new ArrayList<>();

        Cliente c1 = new Cliente(1,"Pablo",20803450316149607520d);
        Cliente c2 = new Cliente(1,"Juan",20802633852972888707d);
        Cliente c3 = new Cliente(1,"Pablo",20803648154689192430d);





         listaClientes.add(c1);
         listaClientes.add(c2);
         listaClientes.add(c3);



         for (Cliente c : listaClientes){
             System.out.println(c.getCuenta());
        c.show();
         }


    }
}
