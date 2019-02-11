package ninja.sedzik.tds.repository;


import ninja.sedzik.tds.model.Client;
import ninja.sedzik.tds.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ClientsRepositoryImpl implements ClientsRepositoryInterface{

  private List<Client> clients = new ArrayList<Client>();

  @PostConstruct
  private void init() {
    clients.add(new Client(1L, "Klient Andrzej"));
    clients.add(new Client(2L, "Klient Wojtek"));
    clients.add(new Client(3L, "Klient Lidia"));
    clients.add(new Client(4L, "Klient Jolanta"));
    clients.add(new Client(5L, "Klient Angelina"));
    clients.add(new Client(6L, "Klient Rafał"));
  }


  @Override
  public List<Client> findByUsername(String username) {
    return clients;
  }


  @Override
  public <S extends Client> S save(S s) {
    return null;
  }

  @Override
  public <S extends Client> Iterable<S> saveAll(Iterable<S> iterable) {
    return null;
  }

  @Override
  public Optional<Client> findById(Long aLong) {
    return Optional.empty();
  }

  @Override
  public boolean existsById(Long aLong) {
    return false;
  }

  @Override
  public Iterable<Client> findAll() {
    return clients;
  }

  @Override
  public Iterable<Client> findAllById(Iterable<Long> iterable) {
    return null;
  }

  @Override
  public long count() {
    return 0;
  }

  @Override
  public void deleteById(Long aLong) {

  }

  @Override
  public void delete(Client client) {

  }

  @Override
  public void deleteAll(Iterable<? extends Client> iterable) {

  }

  @Override
  public void deleteAll() {

  }


}
