package com.uce.edu.demo.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.PruebaU3LgApplication;
import com.uce.edu.demo.modelo.Producto;
import com.uce.edu.demo.modelo.ProductoSencillo;
import com.uce.edu.demo.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService {
	
	private static Logger LOG = Logger.getLogger(ProductoServiceImpl.class);
	
	@Autowired
	private IProductoRepository productoRepository;

	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepository.insertar(producto);
	}

	@Override
	public void ingresarProducto(Producto producto) {
		// TODO Auto-generated method stub
		Producto prod = this.productoRepository.buscarPorCodigoBarras(producto.getCodigoBarras());
		
		try {
			if(prod == null) {
				this.productoRepository.insertar(producto);
			}else {
				prod.setStock(prod.getStock() + producto.getStock());
				this.productoRepository.actualizar(prod);
			}
		}catch(Exception e) {
			LOG.info(e.getMessage());
		}
	}

	@Override
	public ProductoSencillo consultarStock(String codigoBarras) {
		// TODO Auto-generated method stub
		return this.productoRepository.buscarProdSencillo(codigoBarras);
	}
	
}
