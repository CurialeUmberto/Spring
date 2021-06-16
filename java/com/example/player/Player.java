package com.example.player;

public class Player {
	
	
	private int id;
	private String firstname;
	private String lastname;
	private String team;
	
	public Player(int id, String firstname, String lastname, String team) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.team = team;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	
}
