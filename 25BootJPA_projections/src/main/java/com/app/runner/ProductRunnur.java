package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
import com.app.repo.ProductRepository.B;
@Component
public class ProductRunnur implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		/*repo.save(new Product("A","GOOD",1.1,"XX"));
		repo.save(new Product("B","AVE",2.1,"YY"));
		repo.save(new Product("C","FINE",1.1,"ZZ")); 
		repo.save(new Product("C","FINE",3.1,"ZZ")); 
		repo.save(new Product("C","FINE",3.1,"ZZ")); 
		repo.save(new Product("C","FINE",3.1,"ZZ")); 
		repo.save(new Product("C","FINE",3.1,"ZZ"));*/ 
		/****** static projections 
		   //repo.findByprodName("A").forEach(p->System.out.println(p.getProdCost()));
		    repo.findByProdCost(1.1).forEach(p->System.out.println(p.getProdCode()+"   "+p.getProdVer()));
		 **********/
		/**** Dynamic projection
		repo.findByProdName("A",ViewA.class).forEach(p->System.out.println(p.getProdCode()));
		 * *******/
		repo.findByProdName("A", B.class).forEach(p->System.out.println(p.getProdVer()));

	}

}
