package server;

import study.UserHandler;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author lei.liu
 * @since 19-1-11
 */
public class Server {
    public static void main(String[] args) {
        try {
            /*
             UnicastRemoteObject.exportObject
             负责导出我们定义好的远程对象，并用任意一个tcp端口来接收远程方法调用
             同时它还会返回一个存根，这个存根将会发送给client端进行调用

             当exportObject()方法被执行后，运行时会在一个新的Server Socket或共享Server Socket上进行监听，来接收对远程对象的远程调用。

             返回的存根对象和远程对象继承的是同一套remote接口(为了实现代理模式)，并且还它还包含了供client端口访问的主机IP和端口信息。
            */
            UserHandler userHandlerStub = (UserHandler) UnicastRemoteObject.exportObject(new UserHandlerImpl(), 1234);
            UserHandler userHandlerStub2 = (UserHandler) UnicastRemoteObject.exportObject(new UserHandlerImpl(), 2001);
            LocateRegistry.createRegistry(1099);
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("userHandler", userHandlerStub);
            registry.bind("userHandler2", userHandlerStub2);
            System.out.println("rmi server is ready ...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
