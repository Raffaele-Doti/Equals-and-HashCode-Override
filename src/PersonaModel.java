/**
 * Classe PersonaModel che effettua un override dei metodi hashset e equals 
 * @author Raffaele Doti 
 *
 */
public class PersonaModel {
/**
 * Override del metodo equals
 */
@Override
public boolean equals(Object o) {
	   //se o == null allora ritorno false 
	    if(o == null) {
	    	return false;
	    }
		 //Se l'oggetto si compara con sè stesso allora equals è true
        if (o == this) { 
            return true; 
        }
        /*Se l'oggetto passato come parametro non è una istanza di PersonaModel*/
        if (!(o instanceof PersonaModel)) { 
            return false; 
        } 
       //typecast (che riesce sicuramente in quanto se l'ggetto non è istanceof personamodel ritorno false sopra ) to PersonaModel così possiamo effettuare una comparazione delle proprietà 
       PersonaModel c = (PersonaModel) o; 
       //check se nome e cognome sono uguali ritorno true ,false altrimenti
       if(this.Nome == c.Nome && this.Cognome == c.Cognome) {
    	   return true;
       }
       //se sono arrivato fin qui allora non ho trovato corrispondenza fra nome e cognome dei due oggetti quindi ritorno false
       return false;
	}

@Override
public int hashCode() {
	//ritorno l'hashcode di Nome+Cognome
    return Nome.hashCode()+Cognome.hashCode();
}
//Nome della Persona 
String Nome;
public String getNome() {
	return Nome;
}
public void setNome(String nome) {
	Nome = nome;
}
public String getCognome() {
	return Cognome;
}
public void setCognome(String cognome) {
	Cognome = cognome;
}
//Cognome della Persona
String Cognome;
}//End class
