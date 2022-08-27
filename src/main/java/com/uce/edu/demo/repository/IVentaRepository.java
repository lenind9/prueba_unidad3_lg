package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Venta;

public interface IVentaRepository {
	public void insertar(Venta venta);
	public Venta buscar(Integer id);
	public void actualizar(Venta venta);
	public void eliminar(Integer id);
}
