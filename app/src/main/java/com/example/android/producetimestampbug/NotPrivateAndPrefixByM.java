package com.example.android.producetimestampbug;

import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;

public class NotPrivateAndPrefixByM {
    @ServerTimestamp
    Date mCreateTime;

    public NotPrivateAndPrefixByM() {
    }

    public Date getCreateTime() {
        return mCreateTime;
    }

    public void setCreateTime(Date createTime) {
        this.mCreateTime = createTime;
    }
}
