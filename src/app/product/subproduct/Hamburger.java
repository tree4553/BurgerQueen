package app.product.subproduct;

import app.product.Product;

public class Hamburger extends Product {
    private boolean isBurgerSet;
    private int burgerSetPrice;

    public Hamburger(int id, String name, int price, int kcal, boolean isBurgerSet, int burgetSetPrice) {
        super(id, name, price, kcal);
        this.isBurgerSet = isBurgerSet;
        this.burgerSetPrice = burgetSetPrice;
    }

    public boolean isBurgerSet() {
        return isBurgerSet;
    }

    public int getBurgerSetPrice() {
        return burgerSetPrice;
    }

    public void setIsBurgerSet(boolean burgerSet) {
        isBurgerSet = burgerSet;
    }

    public void setIsBurgerSetPrice(int burgetSetPrice) {
        this.burgerSetPrice = burgetSetPrice;
    }
}
