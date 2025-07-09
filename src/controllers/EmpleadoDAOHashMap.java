package controllers;

import java.util.HashMap;
import java.util.Map;

import DAO.EmpleadoDAO;
import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO {
    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOHashMap() {
        this.empleados = new HashMap<>();
    }


    @Override
    public void crear(Empleado empleado) {
        empleados.put(empleado, empleado);
    }

    @Override
    public void listar() {
        for(Empleado empleado : empleados.values()) {
            System.out.println(empleado);
        }
    }

    @Override
    public void eliminar(int id) {
        Empleado tEmpleado = new Empleado(id);
        empleados.remove(tEmpleado);
    }
}
