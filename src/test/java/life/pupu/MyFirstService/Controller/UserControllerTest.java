package life.pupu.MyFirstService.Controller;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class UserControllerTest {
  @Test
  public void getUsersMustReturn5Users() {
    UserController userController = new UserController();
    Assert.assertEquals(5, userController.getUsers().size());
  }

  @Test
  public void getUsersMustReturnInOrder() {
    LinkedList<User> list = new LinkedList<User>();
    list.add(new User(1, "Pureewat Kaewpoy"));
    list.add(new User(2, "Pureewat Junior"));
    list.add(new User(3, "Pureewat Senior"));
    list.add(new User(4, "Doge"));
    list.add(new User(5, "Eiei"));
    UserController userController = new UserController();
    for(int i=0; i < 5; i++) {
      Assert.assertEquals(list.get(i).getId(), userController.getUsers().get(i).getId());
      Assert.assertEquals(list.get(i).getName(), userController.getUsers().get(i).getName());
    }
  }

  @Test
  public void getUser1MustReturn1User() {
    UserController userController = new UserController();
    Assert.assertEquals(1, userController.getUser1().size());
  }
}