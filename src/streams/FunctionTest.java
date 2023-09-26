package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionTest {

	public static void main(String[] args) {
		Product prod1 = new Product("product1*", 3999, "electronics", "grade1");
		Product prod2 = new Product("product2", 1200, "electronics", "premium");
		Product prod3 = new Product("product3*", 3200, "category3", "premium");
		Product prod4 = new Product("product4", 50, "category4", "grade4");
		ArrayList<Product> productlist = new ArrayList<Product>();
		productlist.add(prod1);
		productlist.add(prod2);
		productlist.add(prod3);
		productlist.add(prod4);
		
//		BiFunction<Integer, Integer, Integer > sumOfPrice = (p1,p2) -> {
//			return p1 + p2;
//		};
//		int totalprice = 0;
//		for(Product product: productlist) {
//			totalprice = sumOfPrice.apply(product.price, totalprice);
//		}
//		System.out.println("Total price of all products: " + totalprice);
//		
//		Predicate<Product> pred_priceGreaterThan1000 = prod -> prod.price>1000;
//		Predicate<Product> pred_electronicsProduct = prod -> prod.category.equalsIgnoreCase("electronics");
//		totalprice = 0;
//		for(Product product: productlist) {
//			if(pred_priceGreaterThan1000.test(product)) {
//				totalprice = sumOfPrice.apply(product.price, totalprice);
//				System.out.println(product.name);
//			}
//		}
//		System.out.println("Total price of all products whose prices is > 1000: " + totalprice);
//		
//		totalprice = 0;
//		for(Product product: productlist) {
//			if(pred_electronicsProduct.test(product)) {
//				totalprice = sumOfPrice.apply(product.price, totalprice);
//				System.out.println(product.name);
//			}
//		}
//		System.out.println("Total price of all products of Electronics category: " + totalprice);
//		
//		totalprice = 0;
//		for(Product product: productlist) {
//			if(pred_priceGreaterThan1000.and(pred_electronicsProduct).test(product)) {
//				totalprice = sumOfPrice.apply(product.price, totalprice);
//				System.out.println(product.name);
//			}
//		}
//		System.out.println("Total price of all products whose price is is > 1000/- and belongs to electronic category: " + totalprice);
		
//		Supplier<Integer> randonOTP = () -> {
//			String fourDigitOTP = "";
//			for(int i=1; i<=4; i++)
//			{
//				int ii = (int) (Math.random() *10);
//				fourDigitOTP = fourDigitOTP + ii;
//			}
//			
//			return Integer.parseInt(fourDigitOTP);
//		};
//		
//		System.out.println(randonOTP.get());
		
//		Supplier<Product> randomProduct = () -> {
//			int i = (int) (Math.random() * productlist.size());
//			return productlist.get(i);
//		};
//		System.out.println(randomProduct.get().name);
		
//		BiFunction<String, Integer, Product > createProduct = (name, price) -> {
//			Product p = new Product (name, price, "category1", "grade1");
//			return p; };
//			System.out.println(createProduct.apply("Comb", 50).category);
		
//		BiFunction<Product, Integer, Integer > calculatecost = (product, quantity) -> {
//			int productcost = product.price * quantity;
//			return productcost; };	
//		
//			int totalcost = 0; 
//		for(Product product: productlist)
//		{
//			totalcost = totalcost + calculatecost.apply(product, 2);
//		}
//		System.out.println(totalcost);
	
//		IntSupplier randomProduct = () -> {
//			int i = (int) (Math.random() * 5000);
//			return i;};
//		System.out.println(randomProduct.getAsInt());
		
//		IntConsumer intconsumer = i -> {
//			System.out.println("Square of " + i + " is : " + i*i);
//		};
//		intconsumer.accept(3);
//		boolean flag = false;
//		int num=6;
//		IntPredicate intpred = i -> {
//			return num%i==0;};
//			
//		for(int j=2; j< num; j++)
//		{
//			if(intpred.test(j))
//			{
//				flag=true;
//				break;
//			}
//		}
//		if(flag)
//			System.out.println(num+ " is not a prime number.");
//		else
//			System.out.println(num+ " is a prime number.");
		
//		Consumer<Product> premiumproduct = prod ->{
//			if(prod.grade.equalsIgnoreCase("premium"))
//				System.out.println(prod.name);
//		};
//		Consumer<Product> namesuffix = prod ->{
//			if(prod.name.endsWith("*") && prod.grade.equalsIgnoreCase("premium"))
//				System.out.println(prod.name);
//		};
//		for(Product product: productlist)
//		{
//			namesuffix.andThen(premiumproduct).accept(product);
//		}
//		
//		List<Product> filteredproducts = productlist.stream()
//				.filter(product -> product.category.equalsIgnoreCase("electronics"))
//						.collect(Collectors.toList());
//		
//		System.out.println(filteredproducts.size());
	
	}

}
