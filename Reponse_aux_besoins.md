![](RackMultipart20201120-4-1ltlp64_html_abe7dc43fe914088.gif)

CALLONICO Florian

DIGUET Samuel

KOPTININOV Maxime

PORTEIL Swann

_Réponse aux besoins_

# Partie 1

L&#39;objectif de la partie une est de créer la base de notre agrégateur permettant d&#39;accéder aux réseaux sociaux Facebook et Twitter.

Les différentes fonctionnalités du logiciel seront les suivantes :

Ajouter plusieurs comptes dans l&#39;application :

- Réalisé grâce à une connexion aux réseaux sociaux avec OAuth2 dans Spring Boot.

Création du compte utilisateur et connexion Facebook et Twitter :

- Utilisation des API des réseaux sociaux pour se connecter mais également l&#39;implémentation du système d&#39;authentification propre à l&#39;application SpringBoot.

Accéder et afficher les fils d&#39;actualités des différents réseaux sociaux :

- Utilisation des API de ces réseaux sociaux.

Stockage des données des différents réseaux dans la base propre à l&#39;application :

- Prise en main de la BDD Redis en suivant les différents tutos sur leur site

Approche d&#39;intégration continue et un de déploiement continu :

- Integration de Github Action, Minikube ou DockerDesktop, Kubernetes et AWS

# Partie 2, Sécurité et optimisation de la base de données + test de charge et test attaque application

Une fois la partie une achevée nous allons devoir intégrer à notre application de nouvelles fonctionnalités concernant la base de données, la charge de l&#39;application et enfin les éventuelles attaques à son égard.

Sécurisation de la base de données :

- Contrôler l&#39;accès à la base de données, limiter les autorisations et privilèges au maximum
- Chiffrer les informations sensibles et critiques

Optimisation de la base de données :

- Réalisation du modèle conceptuel et relationnel de la base de données pour l&#39;optimiser au maximum.

Test de charge :

- Programmation d&#39;un nouveau micro-service permettant de connecter plusieurs utilisateurs simultanément pour mesurer la montée en charge de l&#39;application web.

Test de différents types d&#39;attaque :

- XSS
- XXE
- Redis
- Contrôle d&#39;accès
