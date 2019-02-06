package ninja.sedzik.tds.rest;


import ninja.sedzik.tds.model.Client;
import ninja.sedzik.tds.service.ClientServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {


  ClientServiceImpl clientService;

  public RestController(ClientServiceImpl clientService) {
    this.clientService = clientService;
  }


  @RequestMapping("/all")
  @ResponseBody
  public Iterable<Client> getAll(){
    return clientService.getAll();
  }




}
