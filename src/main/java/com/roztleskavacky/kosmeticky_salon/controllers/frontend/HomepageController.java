
package com.roztleskavacky.kosmeticky_salon.controllers.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomepageController {

    @RequestMapping("/")
    public String homepage() {
        return "frontend/index";
    }
}
