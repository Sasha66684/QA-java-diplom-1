package config;
public class Config {
    public static final float DELTA = 0;
    public static final float BUN_PRICE = 988;
    public static final float INGREDIENT_PRICE = 100;
    public static final float INGREDIENT_PRICE_SECOND = 100;
    public static final float BURGER_PRICE = BUN_PRICE * 2 + INGREDIENT_PRICE + INGREDIENT_PRICE_SECOND;
    public static final String BUN_NAME = "Флюоресцентная булка R2-D3";
    public static final String INGREDIENT_FILLING_NAME = "cutlet";
    public static final String INGREDIENT_SAUCE_NAME = "hot sauce";

    public static final String RECEIPT = String.format("(==== Флюоресцентная булка R2-D3 ====)%n" +
            "= filling cutlet =%n" +
            "= sauce hot sauce =%n" +
            "(==== Флюоресцентная булка R2-D3 ====)%n" +
            "%nPrice: 2176,000000%n");
}


