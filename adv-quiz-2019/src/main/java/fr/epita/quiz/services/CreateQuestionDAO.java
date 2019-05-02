package fr.epita.quiz.services;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import fr.epita.quiz.datamodel.Question;


public class CreateQuestionDAO extends GenericORMDao<Question> {
	@Inject
	@Named("questionQuery")
	String query;


	@Override
	protected WhereClauseBuilder getWhereClauseBuilder(Question entity) {
		// TODO Auto-generated method stub
		final WhereClauseBuilder<Question> wcb = new WhereClauseBuilder<Question>();
		wcb.setQueryString(query);
		final Map<String, Object> parameters = new LinkedHashMap<String, Object>();
		parameters.put("type", entity.getType());
		wcb.setParameters(parameters);
		return wcb;
	}

}
