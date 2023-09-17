package com.pool.master.observer.client;

import com.learn.master.observer.interfaces.Observer;
import com.learn.master.observer.model.EmailTopic;
import com.learn.master.observer.model.EmailTopicSubscriber;

public class ObserverClient {
    public static void main(String[] args) {
        EmailTopic emailTopic = new EmailTopic();

        Observer firstObservre = new EmailTopicSubscriber("First observer");
        Observer secondObservre = new EmailTopicSubscriber("Second observer");
        Observer thirdObservre = new EmailTopicSubscriber("Third observer");
        emailTopic.register(firstObservre);
        emailTopic.register(secondObservre);
        emailTopic.register(thirdObservre);

        firstObservre.setSubject(emailTopic);
        secondObservre.setSubject(emailTopic);
        thirdObservre.setSubject(emailTopic);

        firstObservre.update();

        emailTopic.postMessage("WHYATTTT");
    }
}
