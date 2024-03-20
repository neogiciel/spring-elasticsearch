<h1>Application Spring Boot Redis MySQL</h1>
***
<img src="https://user.oc-static.com/upload/2017/10/10/15076639807937_Elasticsearch-Logo-Color-V.jpg.png" alt="drawing" width="280px"/>

## Informations Générales
***
Mise en place d'un moteur de recherche avec Spring-boot
## Technologies
***
Technologies utilisées:
* Java 17 
* Maven 3.6
* Spring-boot: 3.2.3
## Instalation
***
Instalation et lancement du service elasticsearch sur le port 9200
```
Utilisation d'un docker-compose
version: '3'
services:
  elasticsearch:
    image: elasticsearch:8.8.0
    ports:
      - 9200:9200
      - 9300:9300
    environment:
      - discovery.type=single-node
      - xpack.security.enabled=false
```
Le lancement service elasticsearch<br>
```
docker-compose up -d
```
Lancement de l'application Spring-boot<br>
```
$ mvn  clean
$ mvn spring-boot:run
```
Le service est accessible sur http://localhost:8080

## FAQs
***
Remarques
1. **Aucune Remarque**
Answer of the first question with _italic words_. 
2. __Second question in bold__ 
To answer this question we use an unordered list:
* First point
* Second Point
* Third point
3. **Third question in bold**
Answer of the third question with *italic words*.
4. **Fourth question in bold**
| Headline 1 in the tablehead | Headline 2 in the tablehead | Headline 3 in the tablehead |
|:--------------|:-------------:|--------------:|
| text-align left | text-align center | text-align right |
