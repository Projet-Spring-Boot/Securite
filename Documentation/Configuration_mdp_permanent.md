**CONFIGURATION MOT DE PASSE PERMANENT**

Ouvrir le fichier « redis.windows.conf » avec un éditeur de texte.

Modifier la ligne « # requirepass foobared » dans la section « Security » (~ligne 443) en retirant le # et en remplaçant « foobared » par votre mot de passe.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
NOTE :

Il est préférable de générer un mot de passe aléatoire encodé en base64, pour cela, on peut utiliser la commande suivante dans un bash linux (gitbash fonctionne) :

openssl rand 60 | openssl base64 -A

Le résultat obtenu ressemble à celui-ci :

/ho9BZUZMobjGX1FsnNzFJrNkJ2fuD3Af+GoSj0cSDQeapcAi7GVPa0106kSF1VhgL0FmoWG3qy8zk6u

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Ne pas oublier de remplacer ce mot de passe dans votre code.

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

On peut ouvrir le client redis pour vérifier que le mot de passe est bien enregistré.

Si on essaye d&#39;entrer la commande suivante dans notre client :

**set key1 10**

On obtient une erreur d&#39;authentification.

Il faut alors se connecter avec la commande :

**auth password**

En précisant notre mot de passe.

On peut alors de nouveau tester la commande :

**set key1 10**

Ça fonctionne.
