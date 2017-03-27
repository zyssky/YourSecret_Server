package org.androidpn.server.dao;

import org.androidpn.server.model.Notification;

import java.util.List;

public interface NotificationDao {
	void saveNotification(Notification notification);
	
	List<Notification> findNotifications(String username);
	
	void deleteNotification(Notification notification);
}
