# Optimisation de la base de données

### Mise en cache

Pour optimiser la base de données, on peut mettre en cache les données récupérées par les requêtes de l’application.

On a besoin d'ajouter les dépendances dans le fichier pom.xml

```xml
<dependencies>
	...
	<dependency>
		<groupId>redis.clients</groupId>
		<artifactId>jedis</artifactId>
		<version>3.3.0</version>
	</dependency>
	<dependency>
		<groupId>org.projectlombok</groupId>
		<artifactId>lombok</artifactId>
		<optional>true</optional>
	</dependency>
	...
</dependencies>
```

On doit ajouter l’annotation <ins>@EnableCaching</ins> dans le fichier SpringApplication.java

```java
...
@SpringBootApplication
@EnableCaching
public class SpringRedisExampleApplication 
{
	...
}
```


On peut utiliser l'annotation <ins>@Cacheable</ins> pour mettre en cache une requête.
Par exemple la requête <strong>findById()</strong>

```java
...
@GetMapping("/{id}")
@Cacheable("USER")
public Map<String, User> find(@PathVariable String id) 
{
    return userRepository.findById(id);
}
...
```
<strong>USER</strong> est la clé hashé par Redis. On peut retrouver cet élément dans le fichier <ins>UserRepositoryImpl.java</ins>.

```java
...
@Override
   public User findById(String id) 
   {
       	return (User)hashOperations.get("USER", id);
   }
...
```

On peut rajouter la ligne suivante pour afficher dans la console d'exécution du programme lorsque l'utilisateur va chercher une donnée dans la base de données: 

```java
System.out.println("called findById() from DB");
```

Par exemple :
```java
...
@Override
   public User findById(String id) 
   {
       	return (User)hashOperations.get("USER", id);
   }
...
```

Lorsque l'utilisateur saisie une première fois l'URL http://localhost:8082/rest/user/{id}, où {id} correspond à l'id de l'utilisateur de la base de données, la console affichera le message
```sh
called findById() from DB
```

S'il resaisie l'adresse, l'application ira chercher la donnée en cache et le message n'apparaitera pas dans la console.
