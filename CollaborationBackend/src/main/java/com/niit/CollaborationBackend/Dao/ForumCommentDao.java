package com.niit.CollaborationBackend.Dao;

import java.util.List;

import com.niit.CollaborationBackend.Model.ForumComment;

public interface ForumCommentDao 
{
	public boolean CreateForumComment(ForumComment forumComment);
	public ForumComment getForumComment(ForumComment forumComment);
	public List<ForumComment> getForumComment(int Fc_Id);
	public boolean approveForumComment(ForumComment forumComment);
	public boolean editForumComment(int Fc_Id);
	public boolean deleteForumComment(int Fc_Id);

}
