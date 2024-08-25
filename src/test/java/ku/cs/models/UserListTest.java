package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("pleng","0789");
        userList.addUser("pong","0123");
        userList.addUser("bob","0456");
        // TODO: find one of them
        User user = userList.findUserByUsername("pleng");

        // TODO: assert that UserList found User
         String expected = "pleng";
         String actual = user.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("pleng","0789");
        userList.addUser("pong","0123");
        userList.addUser("bob","0456");
        // TODO: change password of one user
        boolean actual = userList.changePassword("pleng","0789","5555");

        // TODO: assert that user can change password
         assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("pleng","0789");
        userList.addUser("pong","0123");
        userList.addUser("bob","0456");
        // TODO: call login() with correct username and password
        User user = userList.login("pleng","0789");

        // TODO: assert that User object is found
        String expected = userList.findUserByUsername("pleng").getUsername();
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("pleng","0789");
        userList.addUser("pong","0123");
        userList.addUser("bob","0456");
        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("pleng","5555");

        // TODO: assert that the method return null
         assertNull(actual);
    }

}