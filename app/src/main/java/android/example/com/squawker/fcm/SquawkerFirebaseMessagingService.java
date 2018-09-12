package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;

public class SquawkerFirebaseMessagingService extends FirebaseMessagingService {

    private static String LOG_TAG = SquawkerFirebaseMessagingService.class.getSimpleName();

    @Override
    public void onNewToken(String token) {
        Log.d(LOG_TAG, "Refreshed token: " + token);
    }
}
