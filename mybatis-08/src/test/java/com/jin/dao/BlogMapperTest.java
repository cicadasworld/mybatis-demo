package com.jin.dao;

import com.jin.pojo.Blog;
import com.jin.util.IdUtil;
import com.jin.util.MybatisUtils;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlogMapperTest {

    @Test
    public void testAddBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        if (true) {
            Blog blog = new Blog();
            blog.setId(IdUtil.getId());
            blog.setTitle("So easy, Mybatis");
            blog.setAuthor("jin");
            blog.setCreateTime(LocalDateTime.now());
            blog.setViews(9999);
            mapper.addBlog(blog);
        }

        if (true) {
            Blog blog = new Blog();
            blog.setId(IdUtil.getId());
            blog.setTitle("So easy, Java");
            blog.setAuthor("jin");
            blog.setCreateTime(LocalDateTime.now());
            blog.setViews(9999);
            mapper.addBlog(blog);
        }

        if (true) {
            Blog blog = new Blog();
            blog.setId(IdUtil.getId());
            blog.setTitle("So easy, Spring");
            blog.setAuthor("jin");
            blog.setCreateTime(LocalDateTime.now());
            blog.setViews(9999);
            mapper.addBlog(blog);
        }

        if (true) {
            Blog blog = new Blog();
            blog.setId(IdUtil.getId());
            blog.setTitle("So easy, Microservice");
            blog.setAuthor("jin");
            blog.setCreateTime(LocalDateTime.now());
            blog.setViews(9999);
            mapper.addBlog(blog);
        }

        sqlSession.close();
    }

    @Test
    public void testQueryBlogIf() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("title", "So easy, Java");
//        map.put("author", "jin");
        List<Blog> blogs = mapper.queryBlogIf(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void testQueryBlogChoose() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("title", "So easy, Java");
        map.put("author", "jin");
        map.put("views", 9999);
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void updateBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("title", "So easy, Mybatis");
        map.put("author", "jin");
        map.put("id", "5d046ce6285144a09231b38cc5c024ca");
        mapper.updateBlog(map);
        sqlSession.close();
    }

    @Test
    public void queryBlogForeach() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, Object> map = new HashMap<>();
        List<String> ids = new ArrayList<>();
        ids.add("5d046ce6285144a09231b38cc5c024ca");
        ids.add("51c6072ba3504411a8311196aea6457b");
        map.put("ids", ids);
        List<Blog> blogs = mapper.queryBlogForeach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
