package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class FSTest {
    private FS fs = new FS("/");

    @Test
    public void greeterSaysHello() {
        assertThat(fs.getFicheros(), containsString("bin"));
    }
}
