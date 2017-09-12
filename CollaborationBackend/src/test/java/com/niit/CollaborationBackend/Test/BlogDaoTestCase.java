package com.niit.CollaborationBackend.Test;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.CollaborationBackend.Dao.BlogDao;
import com.niit.CollaborationBackend.Model.Blog;

import junit.framework.TestCase;

public class BlogDaoTestCase extends TestCase 
{
  static BlogDao blogDao;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.scan("com.niit.CollaborationBackend");
		annotationConfigApplicationContext.refresh();
		blogDao =(BlogDao)annotationConfigApplicationContext.getBean("blogDao");
	}
	@Test
	public void CreateBlogTest()
	{
		Blog blog=new Blog();
		blog.setBlog_Id(101);
		blog.setBlog_Name("Selenium");
		blog.setBlog_Content("Selenium is a testing tool");
		blog.setBlog_Status("NA");
		blog.setBlog_Username("Madhu");
		blog.setLikes(0);
		blog.setCreateDate(new java.util.Date());
		assertTrue("Problem in Blog Creation",blogDao.CreateBlog(blog));
	}
	
	@Test
	public void approveBlogTest()
	{
		Blog blog=new Blog();
		blog.setBlog_Id(101);
		blog.setBlog_Name("Selenium");
		blog.setBlog_Content("Selenium is a testing tool");
		blog.setBlog_Status("NA");
		blog.setBlog_Username("Madhu");
		blog.setLikes(0);
		blog.setCreateDate(new java.util.Date());
		assertTrue("Problem in Approving Blog",blogDao.approveBlog(blog));
	}
	@Test
	public void getAllApprovedBlogTest()
	{
		List<Blog> listBlog =blogDao.getBlog(101);
		assertTrue("No Approved Blogs",listBlog.size()>0);	
	}
	
	}


