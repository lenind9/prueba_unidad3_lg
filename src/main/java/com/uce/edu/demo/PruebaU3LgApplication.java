package com.uce.edu.demo;

import java.math.BigDecimal;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Producto;
import com.uce.edu.demo.modelo.ProductoSencillo;
import com.uce.edu.demo.service.IGestorSupermercadoService;
import com.uce.edu.demo.service.IProductoService;

@SpringBootApplication
public class PruebaU3LgApplication implements CommandLineRunner {
	
	private static Logger LOG = Logger.getLogger(PruebaU3LgApplication.class);
	
	@Autowired
	private IGestorSupermercadoService gestorSupermercadoService;
	
	@Autowired
	private IProductoService productoService;

	public static void main(String[] args) {
		SpringApplication.run(PruebaU3LgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//a)
		Producto prod1 = new Producto();
		prod1.setCodigoBarras("154");
		prod1.setNombre("Dr Pepper");
		prod1.setCategoria("Bebidas");
		prod1.setStock(25);
		prod1.setPrecio(new BigDecimal(2.5));
		
		this.productoService.insertar(prod1);
		this.productoService.ingresarProducto(prod1);
		
		//b)
		
		
		//c)
		ProductoSencillo prodSencillo = this.productoService.consultarStock("154"); 
		LOG.info("Producto encontrado: " + prodSencillo);
		
		//d)
		
		
	}

}
