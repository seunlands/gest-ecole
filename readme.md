Installation / Lancement application
----------------------------------------
Pré-requis
----------
* Avoir une BDD Noethys
* Exécuter le fichier SQL src/main/sql/01_create_tables.sql
	* pensez à changer le mot de passe de l'administrateur (par défaut, admin/admin)
		* le mots de passe sont hashés avec BCrypt. Utiliser la classe PasswordGenerator pour les générer.
		* par exemeple, admin = $2a$11$B7pndaIk/dynIpMrJRnJd.aqsJT.lnLAkNUfVnhLxClGCkaSgL1CK 
* Installer Maven (v3 ou supérieur)
* Installer JDK v8
* Installer git

Compilation
-----------
* Pull des sources
* à la racine des sources, ouvrir une ligne de commande
	* lancer la commande mvn clean install
		* création de l'artefact dans target/gestecole-0.0.1-SNAPSHOT.jar

Lancement
---------
* copier l'artefact vers un répertoire pour l'exécution
* lancer la commande java -jar gestecole-0.0.1-SNAPSHOT
* url application : http://localhost:8080/

