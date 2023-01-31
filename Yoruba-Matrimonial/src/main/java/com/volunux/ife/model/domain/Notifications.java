package com.volunux.ife.model.domain;

public class Notifications {

    private String slug;
    private String receiver;
    private String initiator;
    private String read; // We store this value to know if the Receiver has unread notifications or whether he/she is up to date.
    /*
    Activity (Activity): We link back to the activity to enrich the Notification message and give more context to the receiver. With that link back to an Activity, we can also go back to the Post on which that activity took place. Linking back to this activity creates several possible call-to-actions.
     */
    private String activity;
}
