package hello;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

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

        return new FS(dir);
    }
}
