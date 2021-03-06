package com.formacionspring.web.service;

import java.util.List;



import com.formacionspring.web.entity.Empleado;
public interface EmpleadoService {

	//metodo para listar todos los empleados
	List<Empleado> listaEmpleado();
	

	//metodo para guardar empleado
	public Empleado guardarEmpleado(Empleado empleado);
	
	//metodo para obtener empleado por id
	public Empleado obtenerEmpleadoPorId(Long id);
	
	//metodo para eliminar un empleado por id
	public void eliminarEmpleado(Long id);

	
}
