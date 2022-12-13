import org.example.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        // given
        String positiveNumber = "25";

        // when
        StringUtils stringUtils = new StringUtils();
        boolean result = stringUtils.isPositiveNumber(positiveNumber);

        //then
        assertTrue(result);
    }
}
