package ninja.sedzik.tds.controller;

import ninja.sedzik.tds.service.ClientServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springtds.herokuapp.com")
public class ClientController {

  ClientServiceImpl clientService;

  public ClientController(ClientServiceImpl clientService) {
    this.clientService = clientService;
  }

  public String getAll(){
    return "index";
  }



}
