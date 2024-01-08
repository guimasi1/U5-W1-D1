package gmasi.U5W1D1.decorator;

import lombok.ToString;

public class ExtraVegetablesDecorator extends ExtraAdditionDecorator{
    public ExtraVegetablesDecorator(Consumation consumation) {
        this.consumation = consumation;
    }

    @Override
    public String getProductName() {
        return "Veggie pizza";
    }

    @Override
    public String getIngredients() {
        return consumation.getIngredients() + ", Zucchini, Eggplant, Artichokes";

    }

    @Override
    public double getPrice() {
        return consumation.getPrice() + 1.5;
    }

    @Override
    public String toString() {
        return
                getProductName() +
                "(" + getIngredients() +
                "), price " + getPrice() + "$";
    }
}
