package cn.bdqn.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class News_detail { // 新闻详情类
	private Integer id; // 新闻编号
	private String title; // 新闻标题
	private String summary; // 新闻摘要
	private String author; // 新闻作者
	private Date createDate; // 新闻创建时间

	// 一个新闻下面有多条评论
	private Set<News_comment> comments = new HashSet();

	public News_detail() {
		super();
	}

	public News_detail(Integer id, String title, String summary, String author,
			Date createDate, Set<News_comment> comments) {
		super();
		this.id = id;
		this.title = title;
		this.summary = summary;
		this.author = author;
		this.createDate = createDate;
		this.comments = comments;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Set<News_comment> getComments() {
		return comments;
	}

	public void setComments(Set<News_comment> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "News_detail [id=" + id + ", title=" + title + ", summary="
				+ summary + ", author=" + author + ", createDate=" + createDate
				+ ", comments=" + comments + "]";
	}

}
