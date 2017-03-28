package org.androidpn.server.service;

import java.util.List;

import org.androidpn.server.model.Notification;

public interface NotificationService {
void saveNotification(Notification notification);
	
	List<Notification> findNotifications(String username);
	
	void deleteNotification(Notification notification);
	
	void deleteNotificationByUUID(String uuid);
}
