package ofilmsite.common;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Utility {
	public static String ConvertToJson(Object oData) {
		ObjectMapper mapper = new ObjectMapper();
		String sResult;
		try {
			sResult = mapper.writeValueAsString(oData);
		} catch (Exception e) {
			sResult = "Convert to json Error";
		}
		;
		return sResult;
	}
}
