package com.tts.report.beans;

import java.util.List;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "post", type = "post", shards = 1, replicas = 0)
public class Post {
@Idprivate String id;    private String title;// 
@Field(type= FieldType.Nested)
private List<Tag> tags;   
 public String getId() {
        return id;
}

    public void setId(String id) {
        this.id = id;
}

    public String getTitle() {
        return title;
}

    public void setTitle(String title) {
        this.title = title;
}

    public List<Tag> getTags() {
        return tags;
}

    public void setTags(List<Tag> tags) {
        this.tags = tags;}
}