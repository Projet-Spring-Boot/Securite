Tests de charge Redis

Pour effectuer des tests de charge sur une base de données Redis nous avons utilisé l&#39;outil « redis-benchmark » livré avec l&#39;installation de la BDD.

Utilisation de l&#39;outil dans un environnement Windows:

- Ouvrir un cmd ou un git bash (les commandes ci-dessous ont était réalisées sur un git bash)
- Déplacez-vous dans le répertoire d&#39;installation de Redis avec la commande : cd <chemin-du-repertoire\> (cd /d/redis)

- Ensuite pour effectuer un test de charge avec une configuration par défaut exécutez la commande : ./redis-benchmark.exe
- A cette commande peut être rajouter des arguments pour modifier la configuration du test de charge, voici la liste des arguments :

![](RackMultipart20201127-4-1im91y2_html_a239c4b819aae99a.png)

Voici un exemple de commande pertinente pour notre application :

- ./redis-benchmark.exe -a -c 10000 -n -d 350

-c 10000 -> nombre de connexion en simultané sur le server Redis

-d 350 -> taille en octet d&#39;un tweet avec le pseudo et l&#39;entête de twitter
