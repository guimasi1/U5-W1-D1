package gmasi.U5W1D1.decorator;


import lombok.Getter;

@Getter
public abstract class Consumation {

    String productName = "";
    String ingredients = "";
    double price;
    boolean isXL;

    @Override
    public String toString() {
        return
                productName +
                "(" + ingredients + ')' +
                ", price " + price + "$";
    }
}
