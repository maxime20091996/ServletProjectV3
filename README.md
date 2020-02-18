# ServletProjectV3

Telecharger apache-tomcat-7.0.91

Telecharger jdk1.8.0_144

Récuperer le WAR du projet en exécutant la commande suivante dans un invité de commande :

mkdir C:\ServletJspProject cd C:\ServletJspProject

mvn scm:checkout -DconnectionUrl=scm:git:https://github.com/maxime20091996/ServletProjectV3

Aller dans target\checkout\ServletJspProject

mvn install

Deposer le fichier ServletJspProject.war dans le dossier webapps du serveur Tomcat

Dans le dossier bin du serveur Tomcat lancer le startup.bat

Dans un navigateur web saisir l'adresse suivante : http://localhost:8080/ServletJspProject/Accueil

Liste des méthodes HTTPRequest :

LocalName

ContextPath

ServerName

LocalAddr

RemoteAddr

ContentType

Protocol

RemoteUser

RequestURI

RemoteHost


Les réponses aux méthodes sont affchées sur le lien cité ci-dessus
