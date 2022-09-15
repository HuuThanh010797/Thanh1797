package solid.ecom.solidwebstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import solid.ecom.solidwebstore.domain.Cart;
import solid.ecom.solidwebstore.domain.repository.CartRepository;
import solid.ecom.solidwebstore.dto.CartDto;
import solid.ecom.solidwebstore.service.CartService;

@Service
public class CartServiceImpl implements CartService {
	@Autowired
	private CartRepository cartRepository;

	public void create(CartDto cartDto) {
		cartRepository.create(cartDto);
	}

	@Override
	public Cart read(String id) {
		return cartRepository.read(id);
	}

	@Override
	public void update(String id, CartDto cartDto) {
		cartRepository.update(id, cartDto);
	}

	@Override
	public void delete(String id) {
		cartRepository.delete(id);
	}

	@Override
	public void addItem(String cartId, String productId) {
		cartRepository.addItem(cartId, productId);
	}

	@Override
	public void removeItem(String cartId, String productId) {
		cartRepository.removeItem(cartId, productId);
	}
}
