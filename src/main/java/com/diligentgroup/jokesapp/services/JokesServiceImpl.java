package com.diligentgroup.jokesapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesServiceImpl implements JokesService {
	
	private ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
	

	public String getRandomQuote() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
