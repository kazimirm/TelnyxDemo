package com.example.telnyxdemo;

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.api.MessagesApi;
import com.telnyx.sdk.auth.HttpBearerAuth;
import com.telnyx.sdk.model.CreateMessageRequest;
import com.telnyx.sdk.model.MessageResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TelnyxDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelnyxDemoApplication.class, args);
		initiateTelnyxConnection();
	}

	private static void initiateTelnyxConnection() {
		ApiClient defaultClient = Configuration.getDefaultApiClient();
		defaultClient.setBasePath("https://api.telnyx.com/v2");

		// Configure HTTP bearer authorization: bearerAuth
		HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
//		bearerAuth.setBearerToken(YOUR_TELNYX_API_KEY);

		MessagesApi apiInstance = new MessagesApi(defaultClient);
		// CreateMessageRequest | Message payload
//		CreateMessageRequest createMessageRequest = new CreateMessageRequest()
//				.from(YOUR_TELNYX_NUMBER)
//				.to(YOUR_MOBILE_NUMBER)
//				.text("Hello From Telnyx");
//		try {
//			MessageResponse result = apiInstance.createMessage(createMessageRequest);
//			System.out.println(result);
//		} catch (ApiException e) {
//			System.err.println("Exception when calling MessagesApi#createMessage");
//			System.err.println("Status code: " + e.getCode());
//			System.err.println("Reason: " + e.getResponseBody());
//			System.err.println("Response headers: " + e.getResponseHeaders());
//			e.printStackTrace();
//		}
	}

}
