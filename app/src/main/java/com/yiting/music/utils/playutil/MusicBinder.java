package com.yiting.music.utils.playutil;

import android.os.Binder;

import com.yiting.music.base.MusicBean;
import com.yiting.music.utils.EventCallback;

/**
 * Date: 2018/4/9.
 * Author: Zhanglibin
 */

public class MusicBinder extends Binder implements Playback {
    private PalyerService service;
    public MusicBinder(PalyerService service) {
        this.service = service;
    }

    @Override
    public void start(MusicBean music) {

    }

    @Override
    public void stop() {
        service.stop();
        service.stopTiming();
    }

    @Override
    public void setState(int state) {

    }

    @Override
    public int getState() {
        return service.getplayerState();
    }

    @Override
    public boolean isConnected() {
        return false;
    }

    @Override
    public boolean isPlaying() {
        return false;
    }

    @Override
    public long getCurrentStreamPosition() {
        return service.getDuration();
    }

    @Override
    public void setCurrentStreamPosition(int pos) {

    }

    @Override
    public void updateLastKnownStreamPosition() {

    }

    @Override
    public void play(MusicBean music) {
        service.play(music);
        service.startTiming();
    }

    @Override
    public void pause() {
        service.pause();
        service.stopTiming();
    }

    @Override
    public void resume() {
        service.resume();
        service.startTiming();
    }

    @Override
    public void seekTo(long position) {

    }

    @Override
    public void getProgress(EventCallback<Integer>  callback) {
       service.getCurrentPosition(callback);
    }

    @Override
    public void setCurrentMediaId(String mediaId) {

    }

    @Override
    public String getCurrentMediaId() {
        return null;
    }

    @Override
    public void setCallback(Callback callback) {

    }

    @Override
    public void onPrepared(EventCallback callback) {
      service.getPrepared(callback);
    }
}
