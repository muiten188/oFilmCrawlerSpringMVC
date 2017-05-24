package oFilmSite.common;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Curl {
	public String postRequest(String inputUrl, String urlParam) {
		URL url;
		String responeText = "";
		try {
			String urlParameters = urlParam;
			byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);
			int postDataLength = postData.length;
			url = new URL(inputUrl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setInstanceFollowRedirects(false);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type",
					"application/x-www-form-urlencoded");
			conn.setRequestProperty("charset", "utf-8");
			conn.setRequestProperty("Content-Length",
					Integer.toString(postDataLength));
			conn.setUseCaches(false);
			try (DataOutputStream wr = new DataOutputStream(
					conn.getOutputStream())) {
				wr.write(postData);
				responeText = this.inputStreamToString(conn.getInputStream());
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return responeText;
	}

	private String inputStreamToString(InputStream is) throws IOException {
		int ch;
		StringBuffer sb = new StringBuffer();
		while ((ch = is.read()) != -1) {
			sb.append((char) ch);
		}
		return sb.toString();
	}
}
