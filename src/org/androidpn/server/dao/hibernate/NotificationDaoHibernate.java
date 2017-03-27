package org.androidpn.server.dao.hibernate;

import org.androidpn.server.model.Notification;

import org.androidpn.server.dao.NotificationDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class NotificationDaoHibernate extends HibernateDaoSupport implements NotificationDao {

	@SuppressWarnings("unchecked")
	public void saveNotification(Notification notification) {
		getHibernateTemplate().saveOrUpdate(notification);
		getHibernateTemplate().flush();
		
	}

	@SuppressWarnings("unchecked")
	public List<Notification> findNotifications(String username) {
		// TODO Auto-generated method stub
		List<Notification> list = getHibernateTemplate().find("from Notification where username = ?",username);
		return list;
	}

	@SuppressWarnings("unchecked")
	public void deleteNotification(Notification notification) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(notification);
	}

}
