package app.model;

import org.springframework.stereotype.Component;

@Component
public class TimerTwo {
    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
