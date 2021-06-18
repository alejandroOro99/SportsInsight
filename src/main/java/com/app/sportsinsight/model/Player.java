package com.app.sportsinsight.model;

import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Player {

	
	String name;
	int age;
	Sport sport;
	Nationality nationality;
	double value;
	
	
}
