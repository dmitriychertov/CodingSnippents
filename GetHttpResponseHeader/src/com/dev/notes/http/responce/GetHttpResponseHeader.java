package com.dev.notes.http.responce;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class GetHttpResponseHeader {

	private static final String URL_ADDRESS_01 = "http://habrahabr.ru/post/172123/";

	private static final String URL_ADDRESS_02 = "http://mkyong.com";

	public static void main(String[] args) {
		try {
			URL obj = new URL(URL_ADDRESS_01);
			URLConnection connection = obj.openConnection();
			Map<String, List<String>> map = connection.getHeaderFields();
			for (Map.Entry<String, List<String>> entry : map.entrySet()) {
				System.out.println("Key: " + entry.getKey() + " Value: "
						+ entry.getValue());
			}

			System.out.println("\nGet Responce Header By Key...\n");
			List<String> server = map.get("Server");

			if (server == null) {
				System.out.println("Key 'Server' is not found!");
			} else {
				for (String values : server) {
					System.out.println(values);
				}
			}

			System.out.println("\n Done");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
