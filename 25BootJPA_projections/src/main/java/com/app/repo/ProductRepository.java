package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	/**1...static projection
	interface ViewA{
		String getProdCode();
		String getProdName();
		Double getProdCost();
		Integer getProdId();
		String getProdVer();
	}
	interface ViewB{
		String getProdCode();
		String getProdName();
		Double getProdCost();
		Integer getProdId();
		String getProdVer();
	}
	List<ViewA> findByprodName(String prodName);
	List<ViewB> findByProdCost(Double prodCost);
	 ******/
	/***********************************************************************************************/
	/**2...... Dynamic projection 
	interface ViewA{
		String getProdCode();
		String getProdName();
		String getProdVer();
	}
	interface ViewB{
		String getProdCode();
		String getProdName();
		Double getProdCost();
		Integer getProdId();
		String getProdVer();
	}
	<T> List<T> findByProdName(String prodName,Class<T> cls);
	 ********/
	interface A{
		String getProdName();
		String getProdVer();
		Double getProdCost();
	}
	interface B{
		String getProdName();
		String getProdVer();
	}
	<T> List<T> findByProdName(String prodName,Class<T> cls);










}