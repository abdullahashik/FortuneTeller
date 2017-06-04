package com.thunderbolt.useXML;

import java.util.List;

public class FortuneTellerImpl implements FortuneTeller {

	List<String> fortunes = null;

	@Override
	public String getFortune(int index) {
		return fortunes.get(index);
	}

	@Override
	public void setFortunes(List<String> fortunes) {
		this.fortunes = fortunes;
	}

}
