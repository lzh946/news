package cn.bdqn.service.impl;

import java.util.List;

import cn.bdqn.bean.News_comment;
import cn.bdqn.bean.News_detail;
import cn.bdqn.dao.BaseDao;
import cn.bdqn.service.DetailService;

public class DetailServiceImpl implements DetailService {

	/**
	 * 不改变dao层代码
	 */

	private BaseDao<News_detail> dao;

	public void add(News_detail t) {
		dao.add(t);
	}

	@Override
	public void del(News_detail t) {
		dao.del(t);
	}

	@Override
	public void update(News_detail t) {
		dao.update(t);
	}

	@Override
	public List<News_detail> findList() {
		return dao.findList("from News_detail");
	}

	// 查询指定新闻下面的所有评论
	public List<News_comment> findComments(Integer id) {
		return dao.findComments(id);
	}

	public BaseDao<News_detail> getDao() {
		return dao;
	}

	public void setDao(BaseDao<News_detail> dao) {
		this.dao = dao;
	}

	public List<News_detail> findList(String hql) {
		return null;
	}

}
