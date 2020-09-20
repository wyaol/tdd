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

    @Test
    void should_return_self_with_have_aeiou_but_not_enough_0_3() {
        // given
        String str = "keppp";
        Mommifier mommifier = new Mommifier();

        // when
        String res = mommifier.convert(str);

        // then
        assertEquals("keppp", res);
    }

    @Test
    void should_inset_when_have_aeiou_and_enough_0_3() {
        // given
        String str = "keep";
        Mommifier mommifier = new Mommifier();

        // when
        String res = mommifier.convert(str);

        // then
        assertEquals("kemommyep", res);
    }
}
