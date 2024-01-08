package gmasi.U5W1D1.decorator;

public abstract class ExtraAdditionDecorator extends Consumation {
    Consumation consumation;

    @Override
    public abstract String getProductName();


    @Override
    public abstract String getIngredients();


}
