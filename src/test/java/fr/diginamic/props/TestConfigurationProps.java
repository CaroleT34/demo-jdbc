/**
 * TestConfigurationProps.java
 */
package fr.diginamic.props;

import java.util.Iterator;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
/**
 * @author Krol
 *
 */
public class TestConfigurationProps {

	/**
	 * @param args
	 * @throws ConfigurationException 
	 */
	public static void main(String[] args) throws ConfigurationException {
		Configurations configurations = new Configurations();

		// Chargement configuration properties
		Configuration confprops = configurations.properties("configuration.properties");
		
		//Affichez la valeur du premier paramètre de votre fichier
		System.out.println(confprops.getString("nom"));
		// Boucle de parcours de la conf properties
		Iterator<String> iterkeys = confprops.getKeys();
		while (iterkeys.hasNext()) { // tant qu'on n'est pas au bout cela retourne true
			String key = iterkeys.next(); // Je retourne l'élément courant et j'avance d'un cran
			String valeur = confprops.getString(key);

			System.out.println(key + " : " + valeur);
		}

	}

}
