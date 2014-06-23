package DB;

import java.rmi.RemoteException;

import dbService.DBServiceProxy;


public class TestHello {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		DBServiceProxy prox = new DBServiceProxy();
		String ss= prox.sayHelloWorld("sdcsdsdcsdcsdcsdcsdcs");
		System.out.println(ss);
	}

}
