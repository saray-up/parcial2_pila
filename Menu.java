import java.util.Scanner;
import java.util.Stack;

import parcial2_pila.Metodos;
import parcial2_pila.ObjCocina;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<ObjCocina> pila = new Stack<>();
        Metodos m = new Metodos();
        boolean continuar = true;
        while (continuar) {

            System.out.println("bienvenidos a la cocina");
            System.out.println("Que desea realizar");
            System.out.println("1) Ingresar pedido");
            System.out.println("2) Mostrar Pedido ");
            System.out.println("3) Despachar el ultimo pedido ");
            System.out.println("4) Mostrar turno siguiente ");
            System.out.println("5) Salir ");
            int opt = m.ValidarEentero(sc);
            switch (opt) {
                case 1:
                    pila = m.LlenarCocina(pila, sc);
                    break;
                case 2:
                    m.MostrarCocina(pila);
                    System.out.println();
                    m.MostrarPilaObjetual(pila);
                    break;
                    
                case 3:
                    pila = m.EliminarTope(pila);
                    break;
                    
                case 4:
                    System.out.println(pila.peek().getTurno());
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    continuar = false;
                    break;
                default:
                    System.out.println("esta opcion no existe");
                    break;
            }
        }
    }
}