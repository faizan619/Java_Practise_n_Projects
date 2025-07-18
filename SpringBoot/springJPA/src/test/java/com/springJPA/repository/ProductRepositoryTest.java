package com.springJPA.repository;

import com.springJPA.model.Product;

import java.util.List;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import com.springJPA.repo.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
// @DataJpaTest			// it is use to test the repository layer component. now it is not use because we have springboottest to manage everything
class ProductRepositoryTest{

	@Autowired
	private ProductRepository productRepository;

	@Test 
	void saveMethod(){
		// Create Product

		Product product = new Product();
		product.setName("product 1");
		product.setDescription("Product's Description");
		product.setSku("10BABC");
		product.setPrice(new BigDecimal(180));
		product.setActive(true);
		product.setImageUrl("product1.png");

		 // save product
		Product saveObject = productRepository.save(product);


		System.out.println(saveObject.getId());
		System.out.println(saveObject.toString());
	}

	@Test
	void updateUsingSaveMethod(){
		// find and retrive an entity by id;
		Long id = 1L;
		Product product = productRepository.findById(id).get();

		// update entity information
		product.setName("update product 1 name");
		product.setDescription("updated product 1 description");

		// save updated entity 
		productRepository.save(product);
	}

	@Test
	void findByIdMethod(){
		Long id = 1L;
		Product product = productRepository.findById(id).get(); 
	}

	@Test
	void saveAllMethod(){

		// Create Product

		Product product1 = new Product();
		product1.setName("product 2");
		product1.setDescription("Product 2 Description");
		product1.setSku("12BABC");
		product1.setPrice(new BigDecimal(290));
		product1.setActive(true);
		product1.setImageUrl("product2.png");

		// Create Product

		Product product3 = new Product();
		product3.setName("product 3");
		product3.setDescription("Product's Description");
		product3.setSku("13BABC");
		product3.setPrice(new BigDecimal(120));
		product3.setActive(true);
		product3.setImageUrl("product3.png");


		productRepository.saveAll(List.of(product1, product3));
	}

	@Test
	void findAllMethod(){
		List<Product> products = productRepository.findAll();

		products.forEach((p) -> {
			System.out.println(p.getName());
		})
	}

	@Test
	void deleteByIdMethod(){
		Long id = 1L;
		productRepository.deleteById(id);
	}

	@Test
	void deleteMethod(){
		// find an entity by id
		Long id = 2L;
		Product product = productRepository.findById(id);
		
		// delete(entity)
		productRepository.delete(product);
	}

	@Test
	void countMethod(){
		long count = productRepository.count();
		System.out.println(count);
	}
}