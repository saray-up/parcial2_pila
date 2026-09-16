package parcial2_pila;

import java.util.Scanner;
import java.util.Stack;

public class Metodos {
       
        public Stack<ObjCocina> LlenarCocina(Stack<ObjCocina> p, Scanner sc) {
            
        boolean bandera = true;
        int opt = 0;
        int turno=1;
        while (bandera) {
            
            ObjCocina o = new ObjCocina();
            System.out.println("ingrese la comida que desea el dia de hoy");
            o.setComida(sc.next());
            System.out.println("ingrese la bebida que desea el dia de hoy");
            o.setBebida(sc.next());
            System.out.println("ingrese el precio");
            o.setPrecioUnidad(sc.nextInt());
            o.setTurno(turno);
            turno++;
            p.push(o);

            System.out.println("desea continuar 1:si, 2:NO");
            opt = sc.nextInt();
            if (opt == 2) {
                bandera = false;
            }
            turno++;
        }
        return p;
    }
                    

    public void MostrarCocina(Stack<ObjCocina> p) {
        for (ObjCocina objCocina : p) {
            System.out.println(objCocina.getComida());
            System.out.println(objCocina.getBebida());
            System.out.println(objCocina.getPrecioUnidad());
            System.out.println();

        }
    }

     public void MostrarPilaObjetual(Stack<ObjCocina> pila) {
        for (ObjCocina o : pila) {
            System.out.println(o.getTurno());
        }
    }

    public Stack<ObjCocina> EliminarTope(Stack<ObjCocina> pila) {
        pila.pop();
        System.out.println("Pedido despachado...");
        return pila;
    }



    public int ValidarEentero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println(
                    "Por favor tenga en cuenta que se le esta pidiendo un dato numerico ojala en el rango de 1 a 5 ");
            sc.next();
        }
        return sc.nextInt();
    }
}
