package com.uce.edu.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.modelo.ProductoCompras;

public interface IGestorSupermercadoService {
	public void reporteVentas(LocalDateTime fechaVenta, String categoriaProducto, Integer cantidad);
}
