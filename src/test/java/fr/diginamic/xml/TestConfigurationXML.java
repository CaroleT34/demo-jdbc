/**
 * TestConfigurationXML.java
 */
package fr.diginamic.xml;

import java.util.Iterator;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

/**
 * @author Krol
 *
 */
public class TestConfigurationXML {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws ConfigurationException{
		Configurations configurations = new Configurations();
		// Chargement configuration XML
		Configuration confXML = configurations.xml("database.xml");
		
		//Affichez la valeur du premier paramètre de votre fichier
		System.out.println(confXML.getString("database.url"));
		// Boucle de parcours de la conf properties
				Iterator<String> iterkeys = confXML.getKeys();
				while (iterkeys.hasNext()) { // tant qu'on n'est pas au bout cela retourne true
					String key = iterkeys.next(); // Je retourne l'élément courant et j'avance d'un cran
					String valeur = confXML.getString(key);

					System.out.println(key + " : " + valeur);
				}
	}

}
