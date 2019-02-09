package ninja.sedzik.tds.controller;

import ninja.sedzik.tds.service.ClientServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ClientController {

  ClientServiceImpl clientService;

  public ClientController(ClientServiceImpl clientService) {
    this.clientService = clientService;
  }

  @RequestMapping("/admin")
  public String admin(){
    return "admin";
  }


  @RequestMapping("/index")
  public String index(){
    return "index";
  }


  @RequestMapping("/settings")
  public String settings(){
    return "settings";
  }


  @RequestMapping("/logout")
  public String logout(){
    return "logout";
  }



}
