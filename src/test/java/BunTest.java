import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;
import static config.Config.DELTA;

@RunWith(Parameterized.class)
public class BunTest {

    private final String name;
    private final float price;

    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }
    @Parameterized.Parameters
    public static Object[][] getBunData() {
        return new Object[][]{
                {"Обычная булочка", 100},
                {"English bun", 0.0000001F},
                {null, 300},
                {"Булочка  длинным названием " +
                        "перенос названия на следующую строку", 9999999999.99F},
                {"", 0},
                {"БуJIo4ka $0 $πÊц-символами!", -1},
                {"Cheap bun", Float.MIN_VALUE},
                {"Expensive bun", Float.MAX_VALUE}
        };
    }
    @Test
    public void getName() {
        Bun bun = new Bun(name, price);
        String actualName = bun.getName();
        Assert.assertEquals(actualName, name);
    }

    @Test
    public void getPrice() {
        Bun bun = new Bun(name, price);
        float actualPrice = bun.getPrice();
        Assert.assertEquals(actualPrice, price, DELTA);
    }
}
