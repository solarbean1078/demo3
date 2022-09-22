package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class Maincontroller {
@RequestMapping("/main")
public ModelAndView main() {
ModelAndView mv=new ModelAndView("/main");
return mv;
}

}
