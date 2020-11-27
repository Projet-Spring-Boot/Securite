**CONFIGURATION RENNOMAGE COMMANDE**

Ouvrir le fichier « redis.windows.conf » avec un éditeur de texte.

Modifier la ligne « # rename-command » dans la section « Security » (~ligne 454) en retirant le # et comme procédant comme ça :

_ **rename-command COMMAND COMMAND\_RENAMED** _

Il est possible de rajouter autant de ligne que l&#39;on souhaite pour chaque commande.

_NOTE :_

_Il est préférable de générer une commande renomée aléatoire encodé en base64, pour cela, on peut utiliser la commande suivante dans un bash linux (gitbash fonctionne) :_

_openssl rand 60 | openssl base64 -A_

_Le résultat obtenu ressemble à celui-ci :_

_/ho9BZUZMobjGX1FsnNzFJrNkJ2fuD3Af+GoSj0cSDQeapcAi7GVPa0106kSF1VhgL0FmoWG3qy8zk6u_

Redémarrer Redis en précisant notre fichier conf :

Avec invité de commande :

- Ouvrir un cmd
- Se placer dans le répertoire qui contient redis-server.exe et ses fichiers de conf
- Entrer la commande suivante : redis-server « cheminRedis\redis.windows.conf »
- Pour moi, la commande est la suivante : redis-server E:\redis\redis.windows.conf

Avec git bash :

- Ouvrir un git bash
- Se placer dans le répertoire qui contient redis-server.exe et ses fichiers de conf
- Entrer la commande suivante : ./redis-server.exe "cheminRedis\redis.windows.conf"
- Pour moi, la commande est la suivante : ./redis-server.exe "E:\redis\redis.windows.conf"

**À ce moment, si notre projet Spring est lancé, on peut voir que le site est fonctionnel.**

On peut ouvrir le client redis pour vérifier que les commandes sont bien changées.
