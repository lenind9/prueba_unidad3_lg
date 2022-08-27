package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.modelo.ProductoCompras;
import com.uce.edu.demo.modelo.Venta;

public interface IVentaService {
	public void insertar(Venta venta);
	public Venta buscar(Integer id);
	public void actualizar(Venta venta);
	public void eliminar(Integer id);
	
	public void realizarVenta(List<ProductoCompras> listaProductos, String cedulaCliente, String numeroVenta);
}
