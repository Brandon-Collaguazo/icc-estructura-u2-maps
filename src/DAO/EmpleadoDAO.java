package DAO;

import java.util.List;

import models.Empleado;

public interface EmpleadoDAO {

    void crear(Empleado empleado);

    void listar();

    void eliminar(int id); 
    
}
