package com.example.app.notifications;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAnA8-Cas:APA91bH9U4NRPirRJ1WXcMzQuLauWZJiV3q8MaXmOr2G5XhclRZWz9brCJTGhPz-gwIGaZ6UJAtgcSVbDz6Mn2g_pmvwB47DEYGWxuAD9F36jGlmeZ-JtoNoW8F8y-6hjrRaqt9ummSu"
    })

    @POST("fcm/send")
    Call<Response> sendNotification(@Body Sender body);

}

