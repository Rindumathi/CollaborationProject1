package com.niit.CollaborationBackend.Dao;

import java.util.List;

import com.niit.CollaborationBackend.Model.Forum;

public interface ForumDao 
{
public boolean CreateForum(Forum forum);
public Forum getForum(Forum forum);
public List<Forum> getForum(int Forum_Id);
public boolean approveForum(Forum forum);
public boolean editForum(int Forum_Id);
public boolean deleteForum(int Forum_Id);
	
}
