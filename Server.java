import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		// TODO Auto-generated method stub
		LocateRegistry.createRegistry(1099);
RmiTraitementImpl rmi =new RmiTraitementImpl();
Naming.rebind("rmi://localhost:1099/RMI",rmi);
System.out.println(rmi.toString());
	}

}
