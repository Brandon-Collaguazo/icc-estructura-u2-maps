
import java.util.Arrays;

import controllers.Ejercicios;
// import controllers.EmpleadoContoller;
// import controllers.EmpleadoDAOHashMap;
// import controllers.EmpleadoDAOTreeMap;
// import controllers.Mapa;
// import models.Empleado;
// import DAO.EmpleadoDAO;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        //runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    // private static void runEmpleadoExample() {
    //     EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHashMap();
    //     EmpleadoContoller empleadoContoller = new EmpleadoContoller(empleadoDAOHash);
    //     EmpleadoDAOTreeMap empleadoDAOTreeMap = new EmpleadoDAOTreeMap();
    //     EmpleadoContoller empleadoContoller2 = new EmpleadoContoller(empleadoDAOTreeMap);

    //     Empleado emp1 = new Empleado(5, "Pedro", "Dev");
    //     Empleado emp2 = new Empleado(3, "Juan", "Dev");
    //     Empleado emp3 = new Empleado(1, "Jose", "Dev");
    //     Empleado emp4 = new Empleado(2, "Pedro", "Dev");
    //     Empleado emp5 = new Empleado(4, "Pedro", "Dev");


        
    //     empleadoContoller.agregarEmpleados(emp1);
    //     empleadoContoller.agregarEmpleados(emp2);
    //     empleadoContoller.agregarEmpleados(emp3);
    //     empleadoContoller.agregarEmpleados(emp4);
    //     empleadoContoller.agregarEmpleados(emp5);

        
    //     empleadoContoller2.agregarEmpleados(emp1);
    //     empleadoContoller2.agregarEmpleados(emp2);
    //     empleadoContoller2.agregarEmpleados(emp3);
    //     empleadoContoller2.agregarEmpleados(emp4);
    //     empleadoContoller2.agregarEmpleados(emp5);
        
    //     System.out.println("HashMap");
    //     empleadoContoller.listarEmpleados();
    //     System.out.println("\nTreeMap");
    //     empleadoContoller2.listarEmpleados();

    // }

    // private static void runMapExamlpe() {
    //     Mapa mapa = new Mapa();
    //     mapa.ejemploConHashMap();
    //     mapa.ejemploConLinkedHashMap();
    //     mapa.ejemplosConTreeMap();
    // }

    private static void runEjerccios() {
        Ejercicios ejercicios = new Ejercicios();

        System.out.println("===Ejercicio 1===");

        System.out.println("listen y silent son anagramas? " + 
        Ejercicios.areAnagrams("listen", "silent"));

        System.out.println("hello y bello son anagramas? " + 
        Ejercicios.areAnagrams("hello", "bello"));

        System.out.println("triangle e integral son anagramas? " + 
            Ejercicios.areAnagrams("triangle", "integral"));
        
        System.out.println("\n===Ejercicio 2===");
        int[] prueba1 = {9, 2, 3, 6};
        int objetivo1 = 5;
        int objetivo2 = 10;
        System.out.println("Prueba 1 -> nums=[9, 2, 3, 6] | objetivo = 5 -> " + Arrays.toString(ejercicios.sumatoriaDeDos(prueba1, objetivo1)));

        System.out.println("Prueba 2 -> nums[9, 2, 3, 6] | objetivo = 10 -> " + Arrays.toString(ejercicios.sumatoriaDeDos(prueba1, objetivo2)));

        System.out.println("\n===Ejercicio 3===");
        String texto = "hola";
        ejercicios.contarCaracteres(texto);

        System.out.println("\n===Ejercicio 4===");
        String palabra1 = "roma";
        String palabra2 = "amor";
        System.out.println("roma y amor son anagramas? " + ejercicios.sonAnagramas(palabra1, palabra2));    
    }
}
