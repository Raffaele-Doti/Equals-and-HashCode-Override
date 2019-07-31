import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/**
 * Main class
 * @author Raffaele Doti
 *
 */
public class Program {
/**
 * Main method 
 * @param args
 */
public static void main(String args[]) {
	//Creo una nuova istanza di persona 
	PersonaModel persona = new PersonaModel();
	//modifico nome e cognome della persona 1
	persona.Nome = "Raffaele";
	persona.Cognome = "Doti";
	//creo persona 2
	PersonaModel persona2 = new PersonaModel();
	//modifico nome e cognome di persona2 
	persona2.Nome = "Raffaele";
	persona2.Cognome = "Doti";
	//Assert  
	System.out.println("PersonaModel ha nome"+persona.Nome+" e cognome "+persona.Cognome);
	System.out.println("PersonaModel2 ha nome"+persona2.Nome+" e cognome "+persona2.Cognome);
	System.out.println("PersonaModel è uguale a PersonaModel2? "+persona.equals(persona2));
	//lista di persona model
	HashSet<PersonaModel> lista = new HashSet<PersonaModel>();
	lista.add(persona);
	System.out.println("lista contiene PersonaModel2?"    +lista.contains(persona2));
	System.out.println("Hashcode PersonaModel1 "+persona.hashCode()+" hashcode PersonaModel2 "+persona2.hashCode());
	System.out.println("Dopo l'add la lista ha "+lista.size() + " PersonaModel");
	lista.remove(persona2);
	System.out.println("Dopo il remove la lista ha "+lista.size() + " PersonaModel");
	PersonaModelNotOverride persona3 = new PersonaModelNotOverride();
	persona3.nome = "Raffaele";
	persona3.cognome = "Doti";
	PersonaModelNotOverride persona4 = new PersonaModelNotOverride();
	persona4.nome = "Raffaele";
	persona4.cognome = "Doti";
	System.out.println("PersonaModelNotOverride ha nome"+persona3.nome+" e cognome "+persona3.cognome);
	System.out.println("PersonaModelNotOverride2 ha nome"+persona4.nome+" e cognome "+persona4.cognome);
	System.out.println("PersonaModelNotOverride è uguale a PersonaModelNotOverride2? "+persona3.equals(persona4));
	System.out.println("Hashcode PersonaModelNotOverride "+persona3.hashCode()+" hashcode PersonaModelNotOverride2 "+persona4.hashCode());
	//Creo una lista di person not override
	HashSet<PersonaModelNotOverride> lista2 = new HashSet<PersonaModelNotOverride>();
	//aggiungo la persona
	lista2.add(persona3);
	System.out.println("Lista 2 contiene personaModelNotOverride2? "+lista2.contains(persona4));
	
}
//End class
}
