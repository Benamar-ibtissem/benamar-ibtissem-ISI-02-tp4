import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RmiTraitementImpl extends UnicastRemoteObject implements RmiTraitement {

	public RmiTraitementImpl() throws RemoteException {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double[][] sommeMatrices(double[][] matrice1, double[][] matrice2) throws RemoteException {
		// TODO Auto-generated method stub
		 if (matrice1.length != matrice2.length || matrice1[0].length != matrice2[0].length) {
	            throw new RemoteException("Les dimensions des matrices ne correspondent pas.");
	        }

	        int nbLignes = matrice1.length;
	        int nbColonnes = matrice1[0].length;
	        double[][] resultat = new double[nbLignes][nbColonnes];

	        for (int i = 0; i < nbLignes; i++) {
	            for (int j = 0; j < nbColonnes; j++) {
	                resultat[i][j] = matrice1[i][j] + matrice2[i][j];
	            }
	        }

	        return resultat;
	    }
	@Override
	public double[][] produitMatrices(double[][] matrice1, double[][] matrice2) throws RemoteException {
		// TODO Auto-generated method stub
        if (matrice1[0].length != matrice2.length) {
            throw new RemoteException("Les dimensions des matrices ne correspondent pas.");
        }

        int nbLignes = matrice1.length;
        int nbColonnes = matrice2[0].length;
        int nbCommun = matrice1[0].length;
        double[][] resultat = new double[nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                double sum = 0;
                for (int k = 0; k < nbCommun; k++) {
                    sum += matrice1[i][k] * matrice2[k][j];
                }
                resultat[i][j] = sum;
            }
        }

        return resultat;
    }


	@Override
	public double[][] transposeeMatrice(double[][] matrice) throws RemoteException {
		// TODO Auto-generated method stub
		 int nbLignes = matrice.length;
	        int nbColonnes = matrice[0].length;
	        double[][] resultat = new double[nbColonnes][nbLignes];

	        for (int i = 0; i < nbLignes; i++) {
	            for (int j = 0; j < nbColonnes; j++) {
	                resultat[j][i] = matrice[i][j];
	            }
	        }

	        return resultat;
	    }


	@Override
	public void ajouterUtilisateur(String nom, String pass) throws RemoteException {
		// TODO Auto-generated method stub
	if( nom.equals("rania") && pass.equals("rania")) {
			System.out.println("Authentification réussie");
System.out.println("matrix produit");
      double[][] matrice1 = new double[][]{{1, 2, 3}, {4, 5, 6}};
double[][] matrice2 = new double[][]{{7, 8}, {9, 10}, {11, 12}};

double[][] resultatMatrice = produitMatrices(matrice1,matrice2);
for (int i = 0; i < resultatMatrice.length; i++) {
    for (int j = 0; j < resultatMatrice[0].length; j++) {
        System.out.print(resultatMatrice[i][j] + " ");
    }
    System.out.println();
}
		}else {
			System.out.println("nom et mote de passe incorrecte .-.");
		}
			
	}

}
