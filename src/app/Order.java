package app;

import app.discount.Discount;
import app.discount.discountCondition.CozDiscountCondition;
import app.discount.discountCondition.DiscountCondition;
import app.discount.discountCondition.KidDiscountCondition;
import app.discount.discountPolicy.FixedAmountDiscountPolicy;
import app.discount.discountPolicy.FixedRateDiscountPolicy;

public class Order {
    private Cart cart;
    //private DiscountCondition[] discountConditions;
    private Discount discount;

//    public Order(Cart cart, DiscountCondition[] discountConditions) {
//        this.cart = cart;
//        this.discountConditions = discountConditions;
//    }


    public Order(Cart cart, Discount discount) {
        this.cart = cart;
        this.discount = discount;
    }

    public void makeOrder() {
//        CozDiscountCondition cozDiscountCondition = new CozDiscountCondition(new FixedRateDiscountPolicy(10));
//        KidDiscountCondition kidDiscountCondition = new KidDiscountCondition(new FixedAmountDiscountPolicy(500));
//
//        cozDiscountCondition.checkDiscountCondition();
//        kidDiscountCondition.checkDiscountCondition();
//
//        int totalPrice = cart.calculateTotalPrice();
//        int finalPrice = totalPrice;
//
//        if(cozDiscountCondition.isSatisfied()) finalPrice = cozDiscountCondition.applyDiscount(finalPrice);
//        if(kidDiscountCondition.isSatisfied()) finalPrice = kidDiscountCondition.applyDiscount(finalPrice);

//        int totalPrice = cart.calculateTotalPrice();
//        int finalPrice = totalPrice;

//        for(DiscountCondition discountCondition : discountConditions) {
//            discountCondition.checkDiscountCondition();
//            if (discountCondition.isSatisfied()) finalPrice = discountCondition.applyDiscount(finalPrice);
//        }

        discount.checkAllDiscountConditions();

        int totalPrice = cart.calculateTotalPrice();
        int finalPrice = discount.discount(totalPrice);

        System.out.println("[π£] μ£Όλ¬Έμ΄ μλ£λμμ΅λλ€. ");
        System.out.println("[π£] μ£Όλ¬Έ λ΄μ­μ λ€μκ³Ό κ°μ΅λλ€. ");
        System.out.println("-".repeat(60));

        cart.printCartItemDetails();

        System.out.println("-".repeat(60));
        System.out.printf("κΈμ‘ ν©κ³      : %dμ\n", totalPrice);
        System.out.printf("ν μΈ μ μ© κΈμ‘ : %dμ\n", finalPrice);
    }
}
