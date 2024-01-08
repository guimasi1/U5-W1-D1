package gmasi.U5W1D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Drink {

    String productName;
    double price;

    @Override
    public String toString() {
        return productName + ", price " + price + "$";
    }
}
