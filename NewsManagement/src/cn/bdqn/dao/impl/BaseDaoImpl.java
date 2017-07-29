package cn.bdqn.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import cn.bdqn.bean.News_comment;
import cn.bdqn.dao.BaseDao;

/**
 * 学如逆水行舟，不进则退。
 * @author lzh 2017-7-26下午10:19:15
 * 不去继承HibernateTemplate！ 因为底层还是调用的getCurrentSession！
 *
 */
public class BaseDaoImpl<T> implements BaseDao<T> {

	private SessionFactory sessionFactory;

	/**
	 * 通过sessionFactory得创建会话
	 * 前提：必须在事务环境下执行！
	 * @return
	 */

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void add(T t) {
		getCurrentSession().save(t);
	}

	public void del(T t) {
		getCurrentSession().delete(t);
	}

	public void update(T t) {
		getCurrentSession().update(t);
	}

	public List<T> findList(String hql) {
		return getCurrentSession().createQuery(hql).list();
	}

	@Override
	public List<News_comment> findComments(Integer id) {
		return getCurrentSession().createCriteria(News_comment.class)
				.add(Restrictions.eq("newsId", id)).list();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
