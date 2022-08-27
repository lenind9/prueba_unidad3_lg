package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.DetalleVenta;

public interface IDetalleVentaService {
	public void insertar(DetalleVenta detalleVenta);
	public DetalleVenta buscar(Integer id);
	public void actualizar(DetalleVenta detalleVenta);
	public void eliminar(Integer id);
}
