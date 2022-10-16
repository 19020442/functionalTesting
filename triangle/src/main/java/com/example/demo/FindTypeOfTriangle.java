package com.example.demo;

public class FindTypeOfTriangle {
	private Triangle triangle;

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

	public boolean isTriangle() {
		if (triangle.getEdge1() <= 0 || triangle.getEdge2() <= 0 || triangle.getEdge3() <= 0)
			return false;
		if (triangle.getEdge1() + triangle.getEdge2() > triangle.getEdge3()
				|| triangle.getEdge1() + triangle.getEdge3() > triangle.getEdge2()
				|| triangle.getEdge3() + triangle.getEdge2() > triangle.getEdge1()) {
			return true;
		}
		
		return false;
	}

	public String getType() {
		var a = this.triangle.getEdge1();
		var b = this.triangle.getEdge2();
		var c = this.triangle.getEdge3();
		if (!isTriangle())
			return "Khong hop le";

		if (a == b && b == c)
			return "Tam giac deu";

		if ((a == b || b == c || a == c))
			return "Tam giac can";
		if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b)
			return "Tam giac vuong";

		if (a * a > b * b + c * c || b * b > a * a + c * c || c * c > a * a + b * b)
			return "Tam giac tu";
		return "Tam giac nhon";

	}

}
