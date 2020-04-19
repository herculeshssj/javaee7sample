Hero Pokémon
============

Aplicação exemplo de REST API usando Spring Boot com Groovy.

Configurando a base de dados
----------------------------

```
docker run --name hero-pokemon-db -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=hero_pokemon postgres
```

Executando a aplicação
----------------------

Instale o Gradle e no terminal execute o seguinte comando:

```
gradle bootRun
```

No Docker, execute o seguinte comando:

```
docker run --rm --name hero-pokemon --link hero-pokemon-db -p 8080:8080 -u gradle -v "$PWD":/home/gradle/project -w /home/gradle/project gradle:jdk11 gradle bootRun
```