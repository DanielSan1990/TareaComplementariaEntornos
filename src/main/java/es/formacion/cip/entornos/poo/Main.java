package es.formacion.cip.entornos.poo;

import java.util.Scanner;

public class Main {
    /**
     * Clase Main (Principal)
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Creamos un obejeto tienda:
         * Variable para controlar la salida del menu
         * Variable para controlar que el menu ya está lleno
         * Guardaremos la opcion del usuario
         * Objeto con el que escaneamos las entradas por de teclado por consola
         */
        Tienda t = new Tienda();
        boolean salir = false;
        boolean inventarioLleno = false;
        int opcion;
        Scanner escaner = new Scanner(System.in);

        /**
         * Menu Consola
         */
        while (!salir) {

            System.out.println("Bienvenido a la Tienda");
            System.out.println("---------------------------------------------------------");
            System.out.println("1. LLenar inventario");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Salir");

            System.out.println("Elija una de las opciones: ");
            opcion = escaner.nextInt();
            switch (opcion) {
                /**
                 * Case 1:  llmamos a la función llenar almacen
                 */
                case 1:
                    if(!inventarioLleno){
                        inventarioLleno = true;
                        t.llenarAlmacen();
                        System.out.println("----Has llenado el inventario");
                    }else {
                        System.out.println("----Ya está lleno...");
                    }
                    break;
                /**
                 * Case 2: llamamos a la función mostrar inventario
                 */
                case 2:
                    System.out.println("----Este es tú inventario");
                    t.mostrarInventario();
                    break;
                /**
                 * Case 3: Salimos de la aplicación
                 */
                case 3:
                    System.out.println("Gracias, vuelva pronto...");
                    salir = true;
                    break;
                default:
                    System.out.println("Seleccione una opción válida");
            }

        }

    }
}
