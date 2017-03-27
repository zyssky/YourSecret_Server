package org.androidpn.server.service.impl;

import java.util.List;

import org.androidpn.server.dao.NotificationDao;
import org.androidpn.server.model.Notification;
import org.androidpn.server.service.NotificationService;

public class NotificationServiceImpl implements NotificationService {

	private NotificationDao notificationDao;
	
	public NotificationDao getNotificationDao() {
		return notificationDao;
	}

	public void setNotificationDao(NotificationDao notificationDao) {
		this.notificationDao = notificationDao;
	}

	public void saveNotification(Notification notification) {
		// TODO Auto-generated method stub
		notificationDao.saveNotification(notification);
	}

	public List<Notification> findNotifications(String username) {
		// TODO Auto-generated method stub
		return notificationDao.findNotifications(username);
	}

	public void deleteNotification(Notification notification) {
		// TODO Auto-generated method stub
		notificationDao.deleteNotification(notification);
	}

}
