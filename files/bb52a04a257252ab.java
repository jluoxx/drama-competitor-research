    public final boolean b(StatusBarNotification statusBarNotification) {
        Notification notification = statusBarNotification.getNotification();
        c(statusBarNotification);
        NotificationListenerService.RankingMap currentRanking = getCurrentRanking();
        String key = statusBarNotification.getKey();
        NotificationListenerService.Ranking ranking = this.d;
        currentRanking.getRanking(key, ranking);
        if (!ranking.canShowBadge()) {
            return true;
        }
        if (!ranking.getChannel().getId().equals("miscellaneous") || (notification.flags & 2) == 0) {
            return (notification.flags & 512) != 0 || (TextUtils.isEmpty(notification.extras.getCharSequence(NotificationCompat.EXTRA_TITLE)) && TextUtils.isEmpty(notification.extras.getCharSequence(NotificationCompat.EXTRA_TEXT)));
        }
        return true;
    }