package com.example.player;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerPlayer {
	

	@RequestMapping("/players")
	public ArrayList<Player> getAllPlayers(){
		
		 ArrayList<Player> players = new ArrayList<Player>();
			 players.add(new Player(1,"Giorgio","Chiellini","Juventus"));
			 players.add(new Player(2,"leonardo","Bonucci","Juventus"));
			 players.add(new Player(3,"Cristiano","Ronaldo","Juventus"));
			 players.add(new Player(4,"Paulo","Dybala","Juventus"));
			 players.add(new Player(5,"Alvaro","Morata","Juventus"));
			 players.add(new Player(6,"Adrien","Rabiot","Juventus"));
			 players.add(new Player(7,"Alex","Sandro","Juventus"));
			 players.add(new Player(8,"Juan","Cuadrado","Juventus"));
			 players.add(new Player(9,"Federico","Chiesa","Juventus"));
			 players.add(new Player(10,"Dejan","Kuluseski","Juventus"));
			 players.add(new Player(11,"Rodrigo","Bentancur","Juventus"));
			 players.add(new Player(12,"Federico","Bernardeschi","Juventus"));
			 players.add(new Player(13,"Melo","Arthur","Juventus"));
			 players.add(new Player(14,"Merih","Demiral","Juventus"));
			 players.add(new Player(15,"Weston","Mckennie","Juventus")); 
			 players.add(new Player(16,"Carlo","Pinsoglio","Juventus"));
			 players.add(new Player(17,"Mathias","De light","Juventus"));
			 players.add(new Player(18,"Luiz Da Silva","Danilo","Juventus"));
			 players.add(new Player(19,"Gianluigi","Buffon","Juventus"));
			 players.add(new Player(20,"Aaron","Ramsey","Juventus"));
		return players;
		
		
		
		
	}

}
