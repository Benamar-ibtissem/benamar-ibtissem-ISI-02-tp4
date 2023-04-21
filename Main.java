import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

         // Demande d'identification
         System.out.print("Identifiant : ");
         String nom = scanner.nextLine();
         System.out.print("Mot de passe : ");
         String pass = scanner.nextLine();
         
         
		//recoi lapelle le lien 
RmiTraitement stub =(RmiTraitement) Naming.lookup("rmi://localhost:1099/RMI");
stub.ajouterUtilisateur(nom,pass);
if( nom.equals("nom") && pass.equals("pass")) {
double[][] matrice1 = new double[][]{{1, 2, 3}, {4, 5, 6}};
double[][] matrice2 = new double[][]{{7, 8}, {9, 10}, {11, 12}};

double[][] resultatMatrice = stub.produitMatrices(matrice1,matrice2);
for (int i = 0; i < resultatMatrice.length; i++) {
    for (int j = 0; j < resultatMatrice[0].length; j++) {
        System.out.print(resultatMatrice[i][j] + " ");
    }
    System.out.println();
}
	}
	}
}
