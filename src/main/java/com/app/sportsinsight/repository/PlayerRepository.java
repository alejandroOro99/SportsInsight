package com.app.sportsinsight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.sportsinsight.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

	
	
}
