package ninja.sedzik.tds.controller;

import ninja.sedzik.tds.service.ClientServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {

  ClientServiceImpl clientService;

  public ClientController(ClientServiceImpl clientService) {
    this.clientService = clientService;
  }


  @RequestMapping("/")
  public String getAll(){
    return "index";
  }



}
