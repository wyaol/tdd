import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {

    @Test
    void should_return_self_with_no_aeiou() {
        // given
        String str = "wfrb";
        Mommifier mommifier = new Mommifier();

        // when
        String res = mommifier.convert(str);

        // then
        assertEquals("wfrb", res);
    }
}
