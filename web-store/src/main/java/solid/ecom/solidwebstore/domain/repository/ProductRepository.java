package solid.ecom.solidwebstore.domain.repository;

import java.util.List;
import java.util.Map;

import solid.ecom.solidwebstore.domain.Product;

public interface ProductRepository {
	List<Product> getAllProducts();

	void updateStock(String productId, long noOfUnits);

	void addProduct(Product product);

	List<Product> getProductsByCategory(String category);

	List<Product> getProductsByFilter(Map<String, List<String>> filterParams);

	Product getProductById(String productID);

}
