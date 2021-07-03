package com.app.sportsinsight.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.app.sportsinsight.enums.Nationality;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Player {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int age;
	//private Sport sport;
	private Nationality nationality;
	private double marketValue;
	
	
}
