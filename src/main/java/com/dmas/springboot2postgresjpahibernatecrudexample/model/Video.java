package com.dmas.springboot2postgresjpahibernatecrudexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "videos")
public class Video {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id",updatable = false, nullable = false)
  private Long id;
  private String title;
  private String url;
  private String description;

  public Video() { }
  public Video(String title, String url, String description) {
    this.title = title;
    this.url = url;
    this.description = description;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name = "title", nullable = false)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Column(name = "url", nullable = false)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Column(name = "description", nullable = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Employee [id=" + this.id + ", title=" + this.title + ", url=" + this.url + ", description=" + this.description
    + "]";
  }

}
