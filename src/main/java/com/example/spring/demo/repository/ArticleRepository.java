package com.example.spring.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.sbs.exam.demo.vo.Article;

@Mapper
public interface ArticleRepository {
	
	//INSERT INTO article WHERE id = ?
	public Article writeArticle(String title, String body);
	
	@Select("SELECT * FROM article WHERE id = #{id}")
	public Article getArticle(@Param("id") int id);
	
	//DELETE FROM article WHERE id = ?
	public void deleteArticle(int id);
	
	//UPDATE article SET title = ?, body = ? WHERE id = ?
	public void modifyArticle(int id, String title, String body);
	
	//SELECT * FROM article ORDER BY id DESC;
	public List<Article> getArticles();
}
