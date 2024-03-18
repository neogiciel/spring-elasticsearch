package com.neogiciel.springelastic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


//@Document(indexName = "livre", shards = 1, replicas = 0, refreshInterval = "-1")
@Document(indexName = "livre")
public class Livre {

    @Id
    private String id;

    private String titre;
    private String auteur;
    private String resume;

    //@Field(type = Keyword)
    //private String[] tags;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }


    public Livre() {
    }

    public Livre(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }


    /*/
    public String[] getTags() {
        return tags;
    }

    public void setTags(String... tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Livre{" + "id='" + id + '\'' + ", title='" + title + '\'' + ", authors=" + authors + ", tags=" + Arrays.toString(tags) + '}';
    }*/
}