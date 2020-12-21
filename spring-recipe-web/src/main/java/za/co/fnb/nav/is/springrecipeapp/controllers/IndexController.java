package za.co.fnb.nav.is.springrecipeapp.controllers;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = {"index", "", "/"})
public class IndexController {

    @RequestMapping(path = {"/index", "", "/"})
    public ModelAndView getIndexPage() {
        System.out.println("Test 111");
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        return model;
    }
}
