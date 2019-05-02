package fr.epita.quiz.services;

import java.util.Map;

public class WhereClauseBuilder<T> {

	private Map<String, Object> parameters;
	private String queryString;

		public Map<String, Object> getParameters() {
		return parameters;
	}

		public void setParameters(Map<String, Object> parameters) {
		this.parameters = parameters;
	}

		public String getQueryString() {
		return queryString;
	}

	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}

}
