package oFilmSite.model;

import oFilmSite.common.Utility;

public class ApiResult {
	public boolean isSuccess = true;
	public String message;
	public String data;

	public boolean isIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getData() {
		return data;
	}

	public void setData(Object oData) {
		data = Utility.ConvertToJson(oData);
	}
}
