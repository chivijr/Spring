package hello;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FSController {

    //    @RequestMapping(value = "/fs",
    //        method = RequestMethod.GET,
    //        produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
    //        consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    //@ResponseBody
    @CrossOrigin(origins = "http://localhost:8081")
    @RequestMapping("/fs")
    public FS fs(@RequestParam(value = "dir", defaultValue = "/") String dir) {
        if (dir.equals("null")) {
            dir = "/";
        }
        return new FS(dir);
    }
}
