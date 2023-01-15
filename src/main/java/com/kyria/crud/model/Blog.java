package com.kyria.crud.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Length;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String titre;

  @Column(length = Integer.MAX_VALUE)
  private String contenu;

  private String Auteur;

  @Column(length = Integer.MAX_VALUE)
  private String preview;

}
