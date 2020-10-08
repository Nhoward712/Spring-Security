package edu.wctc.instructions.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "authorities")
public class Authorities {
    @Id
    @Column(name = "username")
    private String username;


    @Column(name = "authority")
    private String authority;


}
