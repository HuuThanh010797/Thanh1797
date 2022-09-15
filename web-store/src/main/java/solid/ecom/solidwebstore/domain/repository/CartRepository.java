package solid.ecom.solidwebstore.domain.repository;

import solid.ecom.solidwebstore.domain.Cart;
import solid.ecom.solidwebstore.dto.CartDto;

public interface CartRepository {
	void create(CartDto cartDto);

	Cart read(String id);

	void update(String id, CartDto cartDto);

	void delete(String id);

	void addItem(String cartId, String productId);

	void removeItem(String cartId, String productId);
}
