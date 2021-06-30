package com.app.sportsinsight.service;

import java.util.Optional;

import com.app.sportsinsight.model.Player;

public interface PlayerService {
	
	//CRUD
	Player add(Player player);
	Optional<Player> getById(int id);
	void deleteById(int id);
	Player updateById(int id, Player player);
}
