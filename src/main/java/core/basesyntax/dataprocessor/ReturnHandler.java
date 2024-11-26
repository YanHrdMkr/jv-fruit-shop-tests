package core.basesyntax.dataprocessor;

import core.basesyntax.service.FruitDB;

public class ReturnHandler implements OperationHandler {
    private final FruitDB fruitDB;

    public ReturnHandler(FruitDB fruitDB) {
        this.fruitDB = fruitDB;
    }

    @Override
    public void apply(String fruit, int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        fruitDB.add(fruit, quantity);
    }
}
