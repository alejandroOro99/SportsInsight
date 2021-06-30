package com.app.sportsinsight.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.sportsinsight.model.Player;
import com.app.sportsinsight.repository.PlayerRepository;

public class PlayerServiceImplementation implements PlayerService{

	private final PlayerRepository playerRepository;
	
	@Autowired
	public PlayerServiceImplementation(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}
	
	@Override
	public Player add(Player player) {
		// TODO Auto-generated method stub
		return playerRepository.save(player);
	}

	@Override
	public Optional<Player> getById(int id) {
		// TODO Auto-generated method stub
		return playerRepository.findById(id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		playerRepository.deleteById(id);
	}

	@Override
	public Player update() {
		// TODO Auto-generated method stub
		return null;
	}

}
