package com.edd.gwt.server.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String getIndexPage() {
        return "/GwtWebApp.html";
    }

}
