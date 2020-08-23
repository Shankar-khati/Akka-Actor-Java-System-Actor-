/**
 * @author shankar
 *
 * This is the Actor sample
 */

package com.akka.recipe;

import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;

import com.akka.pojo.Message;

public class HelloWord  extends AbstractBehavior<Message> {
    public HelloWord(ActorContext<Message> context) {
        super(context);
    }

    @Override
    public Receive createReceive() {
        return newReceiveBuilder().onMessage(Message.class, this::onMessage).build();
    }

    public  static Behavior<Message> create() {
        return Behaviors.setup(context -> new HelloWord(context));
    }

    private Behavior<Message> onMessage(Message msg) {
        System.out.println(msg);
        return this;
    }
}
