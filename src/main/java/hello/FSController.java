package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FSController {

    @RequestMapping("/fs")
    public FS fs(@RequestParam(value="dir", defaultValue = "/") String dir) {
        return new FS(dir);
    }
}
