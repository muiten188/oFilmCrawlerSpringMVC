package ofilmsite.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import ofilmsite.common.Utility;

public class ApiResult {
	@JsonProperty("IsSuccess")
	public boolean IsSuccess = true;
	@JsonProperty("Message")
	public String Message;
	@JsonProperty("Data")
	public String Data;
	@JsonProperty("IsSuccess")
	public boolean getIsSuccess() {
		return IsSuccess;
	}

	public void setIsSuccess(boolean isSuccess) {
		this.IsSuccess = isSuccess;
	}
	@JsonProperty("Message")
	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		this.Message = message;
	}
	@JsonProperty("Data")
	public String getData() {
		return Data;
	}

	public void setData(Object oData) {
		if (String.class.isInstance(oData)) {
			Data = oData.toString();
		} else {
			Data = Utility.ConvertToJson(oData);
		}
	}
}
