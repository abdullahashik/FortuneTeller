package com.thunderbolt.useAnnotations;

import java.util.List;

public class FortuneTellerImpl implements FortuneTeller {

	String[] fortunes = { "What is given comes back to be taken",
			"Did you had breakfast? I can see you will not feel hunger for a while...!",
			"You are soaked to rain! I'm sensing your cloths will take time to dry off!",
			"You got CGPA 4.00? Well, in your future you will be admired as A+ Grade student!",
			"Fool! Stop using these tools, build your own future! " };

	@Override
	public String getFortune(int index) {
		return fortunes[index];
	}

	@Override
	public void setFortunes(String[] fortunes) {
		this.fortunes = fortunes;
	}

}
