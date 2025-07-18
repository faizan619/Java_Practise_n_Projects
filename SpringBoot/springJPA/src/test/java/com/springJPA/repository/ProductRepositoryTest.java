package com.springJPA.repository;

import com.springJPA.model.Product;

import java.util.List;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.springJPA.repo.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;
import org.springframework.data.domain.Sort;

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
		product.forEach((p) -> {
			System.out.println(p.getName);
		});
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
		});
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
 
		Product product = productRepository.findById(id).get();
		
		// delete(entity)
		productRepository.delete(product);
	}

	@Test
	void deleteAllMethod(){
		// productRepository.deleteAll();

		// other method
		Product product2 = productRepository.findById(5L).get();
		Product product1 = productRepository.findById(6L).get();
		productRepository.deleteAll(List.of(product1, product2));
	}

	@Test
	void countMethod(){
		long count = productRepository.count();
		System.out.println(count);
	}

	@Test
	void existByIdMethod(){
		Long id = 1L;

		boolean result1 = productRepository.existsById(id);
		System.out.println(result1);
	}

	@Test
	void findByDateCreatedBetweenMethod(){
		LocalDateTime startDate = LocalDateTime.of(2022,02,12,17,15,48,33);
		LocalDateTime endDate = LocalDateTime.of(2022,02,16,17,15,48,33);

		List<Product> products = productRepository.findByDateCreatedBetween(startDate, endDate);

		products.forEach((p) -> {
			System.out.println(p.getId());
			System.out.println(p.getName());
		});
	}

	@Test
	void sortingByMultipleFields(){
		String sortBy = "name";
		String sortByDesc = "description";
		String sortDir = "desc";

		Sort sortByName = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())?
							Sort.by(sortBy).ascending(): Sort.by(sortBy).descending();

		Sort sortByDescription = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())?
							Sort.by(sortByDesc).ascending(): Sort.by(sortByDesc).descending();

		Sort groupBySort = sortByName.and(sortByDescription);

		List<Product> products = productRepository.findAll(groupBySort);

		products.forEach((p) -> {
			System.out.println(p);
		});
	}
}