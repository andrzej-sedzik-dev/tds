package ninja.sedzik.tds.rest;


import ninja.sedzik.tds.model.Client;
import ninja.sedzik.tds.security.model.User;
import ninja.sedzik.tds.security.service.impl.UserService;
import ninja.sedzik.tds.service.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {

  @Autowired
  private ClientServiceImpl clientService;


  @Autowired
  private UserService userService;



  @RequestMapping("/all")
  @ResponseBody
  public Iterable<Client> getAll(){
    return clientService.getAll();
  }



  @RequestMapping("/users")
  @ResponseBody
  public Iterable<User> getUsers(){
    return userService.findAllUsers();
  }



}











