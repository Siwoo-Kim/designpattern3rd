package decorator;

import com.sun.org.apache.regexp.internal.RE;

public abstract class Beverage {
    String description = "제목없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
