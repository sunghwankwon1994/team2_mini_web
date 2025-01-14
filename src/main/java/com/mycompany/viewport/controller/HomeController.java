package com.mycompany.viewport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/")
public class HomeController {
  @RequestMapping("")
  public String Home() {
    log.info("Home() 실행");
    return "Home";
  }

}
