package solid.ecom.solidwebstore.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import solid.ecom.solidwebstore.domain.Product;

@Component
public class UnitsInStockValidator implements Validator {
	public boolean supports(Class<?> clazz) {
		return Product.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		Product product = (Product) target;
		errors.rejectValue("unitsInStock", "solid.ecom.solidwebstore.validator.UnitsInStockValidator.message");
		// if (product.getUnitPrice() != null && new
		// BigDecimal(1000).compareTo(product.getUnitPrice()) <= 0
		// && product.getUnitsInStock() > 99) {
		// errors.rejectValue("unitsInStock",
		// "solid.ecom.solidwebstore.validator.UnitsInStockValidator.message");
		// }
	}
}