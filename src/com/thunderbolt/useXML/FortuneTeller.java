package com.thunderbolt.useXML;

import java.util.List;

interface FortuneTeller {

	String getFortune(int index);

	void setFortunes(List<String> fortunes);	
}
