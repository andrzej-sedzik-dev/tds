package ninja.sedzik.tds.repository;


import ninja.sedzik.tds.model.Client;
import ninja.sedzik.tds.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepositoryInterface extends CrudRepository<Employee, Long> {

  List<Employee> findByName(String name);

}
