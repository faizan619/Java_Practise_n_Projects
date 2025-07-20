package com.springJPA.model;

@Entity
@Table(name = "buyers")
public class Buyer{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String text;

}