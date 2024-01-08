package gmasi.U5W1D1.decorator;


public class ExtraSausageDecorator extends ExtraAdditionDecorator {

    public ExtraSausageDecorator(Consumation consumation) {
        this.consumation = consumation;
    }

    @Override
    public String getProductName() {
        return "Sausage pizza";
    }

    @Override
    public String getIngredients() {
        return consumation.getIngredients() + ", Sausage";
    }



    @Override
    public double getPrice() {
        return consumation.getPrice() + 2.0;
    }

    @Override
    public String toString() {
        return getProductName() +
                        "(" + getIngredients() + ')' +
                ", price " + getPrice() + "$";
    }
}
