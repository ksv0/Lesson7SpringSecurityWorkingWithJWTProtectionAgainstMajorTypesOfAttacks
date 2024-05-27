package willydekeyser.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivatePublicRestController {

    @GetMapping("/public-data")
    public String publicData() {
        return "public data";
    }

    @GetMapping("/private-data")
    public String privateData() {
        return "private data";
    }

}
