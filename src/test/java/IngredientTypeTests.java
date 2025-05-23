package praktikum;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(Parameterized.class)

public class IngredientTypeTests {
    private final String typeName;

    @Parameterized.Parameters(name = "Наличие типа ингредиента {0}")
    public static Object[][] typesForTests() {
        return new Object[][]{
                {"SAUCE"},
                {"FILLING"}
        };
    }

    public IngredientTypeTests(String typeName) {
        this.typeName = typeName;
    }

    @Test
    public void ingredientTypesIsCorrectTest() {
        MatcherAssert.assertThat("Отсутствует тип " + typeName, IngredientType.valueOf(typeName.toUpperCase()).toString(), equalTo(typeName));
    }
}
