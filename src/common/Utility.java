package common;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Utility {
	public static String ConvertToJson(Object oData) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		String sResult;
		try {
			sResult = mapper.writeValueAsString(oData);
		} catch (Exception e) {
			throw e;
		};
		return sResult;
	}
}
