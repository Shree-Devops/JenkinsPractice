package streams;

import java.util.ArrayList;
import java.util.function.Predicate;

public class predicateTest {

	public static void main(String[] args) {
		Product prod1 = new Product("product1", 99, "electronics", "grade1");
		Product prod2 = new Product("product2", 1200, "electronics", "grade2");
		Product prod3 = new Product("product3", 2200, "category3", "grade3");
		Product prod4 = new Product("product4", 50, "category4", "grade4");
		ArrayList<Product> productlist = new ArrayList<Product>();
		productlist.add(prod1);
		productlist.add(prod2);
		productlist.add(prod3);
		productlist.add(prod4);
		
		Predicate<Product> pred_priceGreaterThan1000 = prod -> prod.price>1000;
		
		for(Product product: productlist) {
			if(pred_priceGreaterThan1000.test(product))
				System.out.println(product.name);
		}
		Predicate<Product> pred_electronicsCategory = prod -> prod.category.equalsIgnoreCase("electronics");
		for(Product product: productlist) {
			if(pred_electronicsCategory.test(product))
				System.out.println(product.name);
		}
		Predicate<Product> pred_priceGreaterThan100 = prod -> prod.price>100;
		for(Product product: productlist) {
			if(pred_electronicsCategory.or(pred_priceGreaterThan100).test(product))
				System.out.println(product.name);
		}
		Predicate<Product> pred_priceLessThan100 = prod -> prod.price<100;
		for(Product product: productlist) {
			if(pred_electronicsCategory.and(pred_priceLessThan100).test(product))
				System.out.println(product.name);
		}
		Response resp1 = new Response("responsebody1", 400, "JSON");
		Response resp2 = new Response("responsebody2", 200, "XML");
		Response resp3 = new Response("responsebody3", 200, "JSON");
		ArrayList<Response> responselist = new ArrayList<Response>();
		responselist.add(resp1);
		responselist.add(resp2);
		responselist.add(resp3);
		Predicate<Response> pred_statuscode400 = resp -> resp.statuscode==400;
		for(Response response: responselist) {
			if(pred_statuscode400.test(response))
				System.out.println(response.responseBody);
		}
		Predicate<Response> pred_respoTypeJson = resp -> resp.responseType.equals("JSON");
		for(Response response: responselist) {
			if(pred_respoTypeJson.test(response))
				System.out.println(response.responseBody);
		}
		for(Response response: responselist) {
			if(pred_statuscode400.and(pred_respoTypeJson).test(response))
				System.out.println(response.responseBody);
		}
		System.out.println("_____________________");
		for(Response response: responselist) {
			if(pred_respoTypeJson.and(pred_statuscode400.negate()).test(response))
				System.out.println(response.responseBody);
		}
	}

}
