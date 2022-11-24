package com.abm.component;

import org.springframework.stereotype.Component;

@Component("splchckr")
public class SpellChecker {
	public void checkSpellingMistakes(String document) {
		System.out.println("Spell checker executed for" +document);
		
	}
	
	

}
