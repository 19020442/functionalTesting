package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TriangleApplicationTests {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	FindTypeOfTriangle findTypeOfTriangle = new FindTypeOfTriangle();
	@Test
	void equiTriangle() {
		Triangle triangle = new Triangle(8, 8, 8);
		findTypeOfTriangle.setTriangle(triangle);
		String type = findTypeOfTriangle.getType();
		logger.info(type);
		assertEquals("Tam giac deu", type);

	}
	
	@Test
	void rightTriangle() {
		Triangle triangle = new Triangle(5, 12, 13);
		findTypeOfTriangle.setTriangle(triangle);
		String type = findTypeOfTriangle.getType();
		logger.info(type);
		assertEquals("Tam giac vuong", type);

	}
	@Test
	void isosTriangle() {
		Triangle triangle = new Triangle(11, 11, 9);
		findTypeOfTriangle.setTriangle(triangle);
		String type = findTypeOfTriangle.getType();
		logger.info(type);
		assertEquals("Tam giac can", type);

	}
	@Test
	void failInputTriangle() {
		Triangle triangle = new Triangle(-2, 8, 8);
		findTypeOfTriangle.setTriangle(triangle);
		String type = findTypeOfTriangle.getType();
		logger.info(type);
		assertEquals("Khong hop le", type);

	}
	
	@Test
	void pointedTriangle() {
		Triangle triangle = new Triangle(8, 11, 13);
		findTypeOfTriangle.setTriangle(triangle);
		String type = findTypeOfTriangle.getType();
		logger.info(type);
		assertEquals("Tam giac nhon", type);

	}
	@Test
	void obtuseTriangle() {
		Triangle triangle = new Triangle(9, 14, 21);
		findTypeOfTriangle.setTriangle(triangle);
		String type = findTypeOfTriangle.getType();
		logger.info(type);
		assertEquals("Tam giac tu", type);

	}
	
	
	
	

}
