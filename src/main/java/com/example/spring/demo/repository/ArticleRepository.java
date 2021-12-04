package com.example.spring.demo.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sbs.exam.demo.vo.Article;

@Mapper
public interface ArticleRepository {

	public void writeArticle(@Param("title") String title, @Param("body") String body);

	public Article getArticle(@Param("id") int id);

	public void deleteArticle(@Param("id") int id);

	public void modifyArticle(int id, String title, String body);

	public List<Article> getArticles();

	public int getLastInsertId();
}
