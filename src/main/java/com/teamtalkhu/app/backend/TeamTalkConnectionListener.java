
package com.teamtalkhu.app.backend;

public interface TeamTalkConnectionListener {

    void onServiceConnected(TeamTalkService service);
    void onServiceDisconnected(TeamTalkService service);

}