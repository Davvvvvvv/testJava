package poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VehiculeTest {

	@Test
	void test() {
		Voiture v1 = new Voiture(4,2002,2000,105,"Diesel","Peugeot");
		
		Assertions.assertEquals(false /*Valeur attendue */, v1.peutFaireDeLinterfile() /* Valeur constatée */);
		
		Assertions.assertEquals(false /*Valeur attendue */, v1.peutRoulerAParis() /* Valeur constatée */);
	}

}
