package ninja.sedzik.tds.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {

  @Id
  @GeneratedValue
  private Long id;
  private String username;

  public Client(){}

  public Client(String username) {
    this.username = username;
  }

  public Client(Long id, String username) {
    this.username = username;
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}
