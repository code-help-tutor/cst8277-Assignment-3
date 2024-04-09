WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package org.cst8277.twitter.dao;

import java.util.UUID;

import org.cst8277.twitter.dtos.Subscription;

public interface SubscriptionRepository {
    public Subscription getSubscription(UUID subscriberId);
    public boolean createSubscription(Subscription subscription);
    public boolean updateSubscription(Subscription subscription);
    public boolean deleteSubscription(UUID subscriberId);
}
