package cn.bdqn.service;

import java.util.List;

import cn.bdqn.bean.News_comment;
import cn.bdqn.bean.News_detail;
import cn.bdqn.dao.BaseDao;

public interface DetailService extends BaseDao<News_detail> {

	List<News_detail> findList();

	// 这个方法应该在News_comment service中书写
	List<News_comment> findComments(Integer id);

}
