package cn.bdqn.action;

import java.util.List;

import cn.bdqn.bean.News_comment;
import cn.bdqn.bean.News_detail;
import cn.bdqn.service.DetailService;

import com.opensymphony.xwork2.ActionSupport;

public class NewsDetailAction extends ActionSupport {
	/**
	 * 调用service层
	 */
	private DetailService service;
	private List<News_detail> detailList;
	private List<News_comment> comments;
	private Integer id; // 获取指定新闻的id

	// 查询所有
	public String newsList() {
		detailList = service.findList();
		return SUCCESS;
	}

	// 查询指定新闻下面的所有评论
	public String findComments() {
		comments = service.findComments(id);
		return SUCCESS;
	}

	public DetailService getService() {
		return service;
	}

	public void setService(DetailService service) {
		this.service = service;
	}

	public List<News_detail> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<News_detail> detailList) {
		this.detailList = detailList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<News_comment> getComments() {
		return comments;
	}

	public void setComments(List<News_comment> comments) {
		this.comments = comments;
	}

}
