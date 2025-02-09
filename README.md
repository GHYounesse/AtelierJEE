# AtelierJEE
Atelier JEE

1. Créer un nouveau projet (Spring Initializr) :
a. Language: java,
b. Type: Maven.
c. Group: ma.xproce
2. Ajouter les dépendances suivantes :
a. Spring Web
b. Spring Data Jpa
c. H2 database
d. Lombok
e. Spring Boot Dev Tools
f. ThymeLeaf
3. Créer les package nécessaires.
a. dao
i. entities
ii. repositories
b. service
c. web

4. Dans le package entities créer l’entities :

a. Video (id, name, url, description...).

5. Ajouter les différentes annotations.
6. Ajouter le repository : VideoRepository
7. Alimenter la base de données avec des videos.
8. Configurer le fichier application.properties.
server.port=8090
spring.datasource.url=jdbc:h2:mem:videos-db
spring.h2.console.enabled=true
9. Tester le bon fonctionnement de l’application (la couche dao).
10. Reconfigurer le fichier application.properties en passant du SGBD H2 à MySQL.
11. Créer l’interface VideoService dans le package service.
12. Créer la classe VideoManager qui implémentent l’interfaces VideoService.
13. Intégrer toutes les fonctionnalités nécessaires.
14. Vérifier le bon fonctionnement de l’application (couche de service).



15. Créer le contrôleur VideoController en incluant les différents scénarios possibles :

a. Afficher la liste des vidéos.
b. Ajouter une nouvelle vidéo.
c. Modifier une vidéo déjà existante.
d. Supprimer une vidéo déjà existante.
e. ...

16. Créer les vues nécessaires (dans le dossier Template).
17. Tester le bon fonctionnement de l’application.
