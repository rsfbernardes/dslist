package com.devrbernardes.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devrbernardes.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

	
}
