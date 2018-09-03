package com.piyush.springdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    /*
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */

    public TennisCoach(){
        System.out.println(">> TennisCoach: inside default constructor.");
    }

//    @Autowired
//    public void doSomeCrazyStuff(FortuneService theFortuneService) {
//        System.out.println(">> TennisCoach: inside doSomeCrazyStuff()  method.");
//        fortuneService = theFortuneService;
//    }

    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @PostConstruct
    private void postConstructMethodFoo() {
        System.out.println("Post Construct Called");
    }

    @PreDestroy
    private void preDestroyMethodBar() {
        System.out.println("Pre Destroy called");
    }
}
