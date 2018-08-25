package life.pupu.MyFirstService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class UserController {

  @GetMapping("/user/1")
  public LinkedList<User> getUsers() {
    LinkedList<User> list = new LinkedList<User>();
    list.add(new User(1, "Pureewat Kaewpoy"));
    list.add(new User(2, "Pureewat Junior"));
    list.add(new User(3, "Pureewat Senior"));
    list.add(new User(4, "Doge"));
    list.add(new User(5, "Eiei"));
    return list;
  }
}