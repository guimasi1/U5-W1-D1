package gmasi.U5W1D1.decorator;

import lombok.ToString;

public class PizzaXL extends Consumation{
    public PizzaXL() {
        productName = "Pizza";
        ingredients = "Mozzarella, Tomato";
        price = 9.0;
        isXL = true;
    }
}
