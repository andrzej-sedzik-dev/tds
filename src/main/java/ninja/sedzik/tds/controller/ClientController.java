package ninja.sedzik.tds.controller;

import ninja.sedzik.tds.model.Client;
import ninja.sedzik.tds.service.ClientServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/client")
public class ClientController {

  ClientServiceImpl clientService;

  public ClientController(ClientServiceImpl clientService) {
    this.clientService = clientService;
  }


  @RequestMapping("/all")
  @ResponseBody
  public Iterable<Client> getAll(){
    return clientService.getAll();
  }



}
