package oFilmSite.common;

public class HandlerException {
	public static Exception handlingException(Exception e,String message) throws Exception{
		throw new Exception(message);
	}
}
