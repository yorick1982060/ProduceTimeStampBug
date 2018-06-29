package com.example.android.producetimestampbug;

import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;

public class PrefixByM {
    @ServerTimestamp
    private Date mCreateTime;

    public PrefixByM() {
    }

    public Date getCreateTime() {
        return mCreateTime;
    }

    public void setCreateTime(Date createTime) {
        this.mCreateTime = createTime;
    }
}
