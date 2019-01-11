package study;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UserHandler extends Remote {
    void helloWorld() throws RemoteException;

    User getUser() throws RemoteException;
}
