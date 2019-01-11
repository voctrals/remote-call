package client;

import study.UserHandler;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author lei.liu
 * @since 19-1-11
 */
public class Client {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry();
            UserHandler hello = (UserHandler) registry.lookup("userHandler");
            UserHandler hello2 = (UserHandler) registry.lookup("userHandler2");

            hello.helloWorld();

            System.out.println(hello.getUser());


            hello2.helloWorld();

            System.out.println(hello2.getUser());


        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }
}
