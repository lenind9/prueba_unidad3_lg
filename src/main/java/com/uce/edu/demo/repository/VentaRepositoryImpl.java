package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Venta;

@Repository
@Transactional
public class VentaRepositoryImpl implements IVentaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Venta venta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(venta);
	}

	@Override
	public Venta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Venta.class, id);
	}

	@Override
	public void actualizar(Venta venta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(venta);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}
	
}
