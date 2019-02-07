package ninja.sedzik.tds.controller;

import ninja.sedzik.tds.service.ClientServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class ClientController {

  ClientServiceImpl clientService;

  public ClientController(ClientServiceImpl clientService) {
    this.clientService = clientService;
  }


  @RequestMapping("/all")
  public String getAll(){
    return "index";
  }



}
