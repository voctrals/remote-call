package server;

import study.User;
import study.UserHandler;

import java.rmi.RemoteException;

/**
 * @author lei.liu
 * @since 19-1-11
 */
public class UserHandlerImpl implements UserHandler {


    public void helloWorld() throws RemoteException {
        System.out.println("Hello World~");
    }

    public User getUser() throws RemoteException {
        User user = new User();
        user.setAge(10);
        user.setName("voctrals");
        return user;
    }
}
