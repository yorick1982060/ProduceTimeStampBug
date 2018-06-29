package com.example.android.producetimestampbug;

import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;

public class NoPrefix {
    @ServerTimestamp
    private Date createTime;

    public NoPrefix() {
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
