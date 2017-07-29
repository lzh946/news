package cn.bdqn.bean;

import java.util.Date;

/**学如逆水行舟，不进则退。
 * @author lzh 2017-7-26下午8:58:17
 * 
 * 
 */
public class News_comment { // 新闻评论类
	private Integer id; // 编号
	private Integer newsId; // 新闻编号
	private String content; // 评论内容
	private String author; // 评论人
	private Date createDate; // 评论时间

	public News_comment() {
		super();
	}

	public News_comment(Integer id, Integer newsId, String content,
			String author, Date createDate) {
		super();
		this.id = id;
		this.newsId = newsId;
		this.content = content;
		this.author = author;
		this.createDate = createDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNewsId() {
		return newsId;
	}

	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	@Override
	public String toString() {
		return "News_comment [id=" + id + ", newsId=" + newsId + ", content="
				+ content + ", author=" + author + ", createDate=" + createDate
				+ "]";
	}

}
