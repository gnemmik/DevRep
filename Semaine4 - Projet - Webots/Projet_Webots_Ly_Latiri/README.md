Pour exécuter notre générateur de code, il faut : 
 * créer une instance dynamique de RobotConfiguration
 * dans le _main_ qui se trouve dans la classe _MainClass_ charger l'instance dynamique en une instance java
 * appeler la méthode _generateJavaFile_ avec l'instance chargée en paramètre, un fichier .java contenant le code exécutable dans webots est généré à la racine du projet
 * enfin exécuter ce code sur webots 