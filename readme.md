Projet Servlet - Déploiement sur Tomcat

Présentation

J'ai développé une application Java EE avec une Servlet, déployée sur Apache Tomcat, en utilisant IntelliJ IDEA Ultimate.

Outils Utilisés

IntelliJ IDEA Ultimate

Apache Tomcat 9+

JDK 8+

Git & GitHub

Étapes

1. Création du Projet

Nouveau projet Web Application (Servlet)

Configuration de Tomcat

2. Version 1

index.jsp contient mon bonjour alain trad initial.
Elle sera affiché quand le server s'initialise.

3. Version 2

HelloServlet.java contient ma page initiale.
index.jsp a un 'a' tag qui quand activar va appeler HelloServlet.java.
Donc, j'ai fait un matching avec les endpoints pour que l'api soit utiliser correctement.

4. Le GitHub

Il contient des commits apres chaque version et vous pouvez meme voir la difference.