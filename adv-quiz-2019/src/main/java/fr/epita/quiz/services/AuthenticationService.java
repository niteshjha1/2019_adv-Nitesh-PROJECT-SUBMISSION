package fr.epita.quiz.services;

import org.springframework.stereotype.Repository;


@Repository
public class AuthenticationService {
	
	public boolean authenticate(String login, String password) {
		return true;
	}

}
