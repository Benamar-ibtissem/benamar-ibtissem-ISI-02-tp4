import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiTraitement extends Remote {

	public double[][] sommeMatrices(double[][] matrice1, double[][] matrice2) throws RemoteException;
    public double[][] produitMatrices(double[][] matrice1, double[][] matrice2) throws RemoteException;
    public double[][] transposeeMatrice(double[][] matrice) throws RemoteException; 
    public void ajouterUtilisateur(String nom,String pass) throws RemoteException;
}
