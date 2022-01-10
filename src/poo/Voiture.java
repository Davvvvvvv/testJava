package poo;

public class Voiture extends Vehicule{

	public Voiture(int nbrRoues, double annee, double kmParcourus, int ch, String carburant, String marque) {
		super(nbrRoues, annee, kmParcourus, ch, carburant, marque);
		// TODO Auto-generated constructor stub
	}
	
	public boolean peutFaireDeLinterfile() {
		return false;
	}
	
	public boolean peutRoulerAParis() {
		if (this.annee<2006 && this.carburant == "Diesel") {
			return false;
		}else {
			return true;
		}
	}
	

}
