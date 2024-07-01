import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;
import static config.Config.DELTA;
import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

@RunWith(Parameterized.class)
public class IngredientTest {
    private final Ingredient ingredient;
    private final IngredientType type;
    private final String name;
    private final float price;

    public IngredientTest(Ingredient ingredient, IngredientType type, String name, float price) {
        this.ingredient = ingredient;
        this.type = type;
        this.name = name;
        this.price = price;
    }

       @Parameterized.Parameters
       public static Object[][] getIngredientData() {
           return new Object[][]{
                   {new Ingredient(SAUCE, "Кратор", 100), SAUCE, "Кратор", 100},
                   {new Ingredient(SAUCE, "Barbecue", 0.0000001F), SAUCE, "Barbecue", 0.0000001F},
                   {new Ingredient(FILLING, "Котлета с очень длинным названием, " +
                           " придется переносить на следующую строку", 9999999999.99F),FILLING, "Котлета с очень длинным названием, " +
                           " придется переносить на следующую строку", 9999999999.99F },
                   {new Ingredient(null, "", 0),null, "", 0 },
                   {new Ingredient(SAUCE, null, 3), SAUCE, null, 3},
                   {new Ingredient(FILLING, "गøᛖน∂ổ₱ $0  $πÊц-символами!", -1), FILLING, "गøᛖน∂ổ₱ $0  $πÊц-символами!", -1}
           };
       }
@Test
    public void getPrice() {
        float actual = ingredient.getPrice();
        assertEquals(price, actual, DELTA);
}
@Test
    public void getName(){
        String actual = ingredient.getName();
        assertEquals(name, actual);
}
@Test
    public void getType() {
    IngredientType actual = ingredient.getType();
    assertEquals(type, actual);

    }
}

