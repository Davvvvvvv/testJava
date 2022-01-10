package poo;

public abstract class Vehicule {
	public int nbrRoues;
	public double annee;
	public double kmParcourus;
	public int ch; 
	public String carburant;
	public String marque; 
	
	
	public Vehicule(int nbrRoues, double annee, double kmParcourus, int ch, String carburant, String marque) {
		super();
		this.nbrRoues = nbrRoues;
		this.annee = annee;
		this.kmParcourus = kmParcourus;
		this.ch = ch;
		this.carburant = carburant;
		this.marque = marque;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	public int getNbrRoues() {
		return nbrRoues;
	}
	
	public void setNbrRoues(int nbrRoues) {
		this.nbrRoues = nbrRoues;
	}
	public double getAnnee() {
		return annee;
	}
	public void setAnnee(double annee) {
		this.annee = annee;
	}
	public double getKmParcourus() {
		return kmParcourus;
	}
	public void setKmParcourus(double kmParcourus) {
		this.kmParcourus = kmParcourus;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public String getCarburant() {
		return carburant;
	}
	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}
	abstract boolean peutFaireDeLinterfile(); 
	
	
	
	
}
