package ninja.sedzik.tds.repository;

import ninja.sedzik.tds.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;


public interface ClientsRepositoryInterface extends CrudRepository<Client, Long> {

  List<Client> findByUsername(String username);


}
