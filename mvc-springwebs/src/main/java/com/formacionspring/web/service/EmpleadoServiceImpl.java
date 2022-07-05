package com.formacionspring.web.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionspring.web.dao.EmpleadoRepository;
import com.formacionspring.web.entity.Empleado;
@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	@Autowired
	private EmpleadoRepository repositorio;
	
	@Override
	public List<Empleado> listaEmpleado() {
		return repositorio.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return repositorio.save(empleado);
	}

	@Override
	public Empleado obtenerEmpleadoPorId(Long id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		repositorio.deleteById(id);
			
	}

 

}
