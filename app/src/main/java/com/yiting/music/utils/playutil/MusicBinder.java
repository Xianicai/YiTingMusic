package com.yiting.music.utils.playutil;

import android.os.Binder;

import com.yiting.music.base.MusicBean;
import com.yiting.music.utils.playback.Playback;

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
    public void stop(boolean notifyListeners) {
        service.stop();
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
        return service.getplayerState();
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
    }

    @Override
    public void pause() {
        service.pause();
    }

    @Override
    public void resume() {
        service.resume();
    }

    @Override
    public void seekTo(long position) {

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
}
