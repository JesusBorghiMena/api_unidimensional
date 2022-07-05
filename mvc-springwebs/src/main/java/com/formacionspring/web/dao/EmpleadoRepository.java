package com.formacionspring.web.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import org.springframework.stereotype.Repository;

import com.formacionspring.web.entity.Empleado;
@Repository
public interface EmpleadoRepository extends JpaRepositoryImplementation<Empleado, Long>{

	
}
