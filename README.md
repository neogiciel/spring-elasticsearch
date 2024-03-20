<h1>Application Spring Boot Redis MySQL</h1>
<img src="https://user.oc-static.com/upload/2017/10/10/15076639807937_Elasticsearch-Logo-Color-V.jpg.png" alt="drawing" style="width:280px;"/>

## Informations Générales
***
Mise en place d'un moteur de recherche avec Spring-boot
## Technologies
***
Technologies utilisées:
* Java 17 
* Maeven 3.6
* Spring-boot: 3.2.3
## Instalation
***
Instalation et lancement du service
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
L'utilisation
```
$ npm install
$ npm start
```
Side information: To use the application in a special environment use ```lorem ipsum``` to start
## Collaboration
***
Give instructions on how to collaborate with your project.
> Maybe you want to write a quote in this part. 
> It should go over several rows?
> This is how you do it.
## FAQs
***
A list of frequently asked questions
1. **This is a question in bold**
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
