package controllers;

import java.util.Map;
import java.util.TreeMap;

import DAO.EmpleadoDAO;
import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {

    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOTreeMap() {
        this.empleados = new TreeMap<>();
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
