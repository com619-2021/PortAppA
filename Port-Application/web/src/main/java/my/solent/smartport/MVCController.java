/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.solent.smartport;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author gallenc
 */
@Controller
public class MVCController {

    @RequestMapping(value = "/home")
    public String hello(Model model, @RequestParam(value = "name") String name) {
        model.addAttribute("name", name);
        return "home";
    }

}
