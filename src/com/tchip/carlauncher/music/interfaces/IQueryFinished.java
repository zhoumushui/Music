package com.tchip.carlauncher.music.interfaces;

import java.util.List;

import com.tchip.carlauncher.music.model.MusicInfo;

public interface IQueryFinished {

	public void onFinished(List<MusicInfo> list);

}
