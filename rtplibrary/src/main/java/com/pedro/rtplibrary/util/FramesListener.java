package com.pedro.rtplibrary.util;

import com.pedro.encoder.Frame;

public class FramesListener {

    private Callback callback;

    public interface Callback {
        void onGetFrame(Frame frame);
    }

    public void setCallback(FramesListener.Callback callback) {
        this.callback = callback;
    }

    public void getFrames(Frame frame) {
        callback.onGetFrame(frame);
    }

}
