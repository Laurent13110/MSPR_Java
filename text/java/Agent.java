package text.java;
import java.util.List;
import java.util.Objects;

public class Agent {
  private String nickname;
  private String name;
  private String surname;
  private String job;
  private String password;
  

  private List<String> items;

  public Agent(String name, String surname, String job, String password, List<String> items) {
    this.name = name;
    this.surname = surname;
    this.job = job;
    this.password = password;
    this.items = items;
    this.nickname = name.substring(0, 1).toLowerCase() + surname.toLowerCase();
  }

  public String getName() 
  {
    return this.name;
  }

  public void setName(String name) 
  {
    this.name = name;
  }

  public String getSurname() 
  {
    return this.surname;
  }

  public void setSurname(String surname) 
  {
    this.surname = surname;
  }

  public String getJob() {
    return this.job;
  }

  public void setJob(String job) 
  {
    this.job = job;
  }

  public String getPassword()
  {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<String> getItems() {
    return this.items;
  }

  public void setItems(List<String> items) {
    this.items = items;
  }

  public  String getNickname() {
    return  this.nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }
}