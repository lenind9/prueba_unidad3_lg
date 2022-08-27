package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Producto;
import com.uce.edu.demo.modelo.ProductoSencillo;

public interface IProductoService {
	public void insertar(Producto producto);
	
	public void ingresarProducto(Producto producto);
	public ProductoSencillo consultarStock(String codigoBarras);
	
}
