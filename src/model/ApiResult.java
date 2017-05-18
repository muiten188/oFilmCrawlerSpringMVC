package model;

import common.Utility;

public class ApiResult {
	public boolean IsSuccess;
	public String Message;
	public String Data;

	public boolean isIsSuccess() {
		return IsSuccess;
	}

	public void setIsSuccess(boolean isSuccess) {
		IsSuccess = isSuccess;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public String getData() {
		return Data;
	}

	public void setData(Object oData) {
		try {
			Data = Utility.ConvertToJson(oData);
		} catch (Exception e) {
			Data = "";
		}

	}
}
