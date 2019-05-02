package fr.epita.quiz.services;

import fr.epita.quiz.datamodel.Users;


public class UsersDAO extends GenericORMDao<Users> {

	@Override
	protected WhereClauseBuilder getWhereClauseBuilder(Users entity) {
		return null;
	}

}
