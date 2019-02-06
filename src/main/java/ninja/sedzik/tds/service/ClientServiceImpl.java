package ninja.sedzik.tds.service;

import ninja.sedzik.tds.model.Client;
import ninja.sedzik.tds.repository.ClientsRepositoryImpl;
import ninja.sedzik.tds.repository.ClientsRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientServieInterface {

  @Autowired
  ClientsRepositoryImpl clientsRepository;


  @Override
  public Iterable<Client> getAll() {
    return clientsRepository.findAll();
  }





}
