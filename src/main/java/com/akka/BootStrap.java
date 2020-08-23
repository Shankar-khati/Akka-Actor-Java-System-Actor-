package com.akka;

import akka.actor.typed.ActorSystem;
import com.akka.pojo.Message;
import com.akka.recipe.HelloWord;

public class BootStrap {

    public static void main(String[] args) {
        ActorSystem<Message> myWorld = ActorSystem.create(HelloWord.create(), "myWorld");
        myWorld.tell(new Message("shankar singh", "shankar", "I'm sending you a message"));
    }
}
