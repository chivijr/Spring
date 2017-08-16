package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class FSTest {
    private FS FS = new FS("/");

    @Test
    public void greeterSaysHello() {
        //assertThat(FS.getFicheros(), containsString("bin"));
    }
}
