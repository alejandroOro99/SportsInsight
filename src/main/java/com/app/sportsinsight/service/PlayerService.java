package com.app.sportsinsight.service;

import java.util.Optional;

import com.app.sportsinsight.model.Player;

public interface PlayerService {
	
	//CRUD
	Player add(Player player);
	Optional<Player> getById(int id);
	void delete(int id);
	Player update();
}
