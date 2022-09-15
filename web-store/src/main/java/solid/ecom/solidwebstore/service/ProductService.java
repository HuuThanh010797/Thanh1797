package solid.ecom.solidwebstore.service;

import java.util.List;
import java.util.Map;

import solid.ecom.solidwebstore.domain.Product;

public interface ProductService {
	void updateAllStock();

	List<Product> getAllProducts();

	void addTheProduct(Product product);

	List<Product> getProductsByCategory(String category);

	List<Product> getProductsByFilter(Map<String, List<String>> filterParams);

	Product getProductById(String productID);

}
