package com.sophos.api.backend.models;

import java.io.Serializable;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "afiliados")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AffiliateModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
        
        @Column(name="name", nullable=false, length=30)
	private String name;
        
        @Column(name="age")
	private int age;
        
        @Column(name="mail")
	private String mail;
}