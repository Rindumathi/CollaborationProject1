package com.niit.CollaborationBackend.Dao;

import java.util.List;

import com.niit.CollaborationBackend.Model.Friend;

public interface FriendDao 
{
public boolean CreateFriend(Friend friend);
public Friend getFriend(Friend friend);
public List<Friend> getFriend(int Friend_Id);
public boolean approveFriend(Friend friend);
public boolean editFriend(int Friend_Id);
public boolean deleteFriend(int Friend_Id);
}
