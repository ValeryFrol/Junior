package soloTasks;

import java.time.LocalTime;

public class Request {

    public LocalTime timeOfCreation, timeOfProccessing;

    public Request(LocalTime timeOfCreation) {
        this.timeOfCreation = timeOfCreation;
    }

    @Override
    public String toString() {
        return "Request{" +
                "timeOfCreation='" + timeOfCreation.toString() + '\'' +
                ", timeOfProccessing='" + timeOfProccessing.toString() + '\'' +
                '}';
    }
}
