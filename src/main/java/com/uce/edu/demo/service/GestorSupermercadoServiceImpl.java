package com.uce.edu.demo.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.DetalleVenta;
import com.uce.edu.demo.modelo.Producto;
import com.uce.edu.demo.modelo.ProductoCompras;
import com.uce.edu.demo.modelo.Venta;
import com.uce.edu.demo.repository.IProductoRepository;

@Service
public class GestorSupermercadoServiceImpl implements IGestorSupermercadoService {
	
	@Autowired
	private IProductoRepository productoRepository;
	
	@Autowired
	private IVentaService ventaService;

	@Override
	public void reporteVentas(LocalDateTime fechaVenta, String categoriaProducto, Integer cantidad) {
		// TODO Auto-generated method stub
		
	}
	
}
