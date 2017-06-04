package lapr.project.model;

import java.io.Serializable;

public class EventCenter implements Serializable {

    private static final long serialVersionUID = 1L;
    private EventRegistration eventRegistration;
    private UserRegistration userRegistration;
    private StandRegistration standRegistration;
    private AlgorithmRegistration algorithmRegistration;
    private ApplicationRegistration appRegistration;
    //    private AlgorithmRegistration algorithmRegistration;

    public EventCenter() {
        eventRegistration = new EventRegistration();
        userRegistration = new UserRegistration();
        algorithmRegistration = new AlgorithmRegistration(AlgorithmRegistration.initializeAlgorithmRegister());
    }

    public EventRegistration getEventRegistration() {
        return eventRegistration;
    }

    public UserRegistration getUserRegistration() {
        return userRegistration;
    }

    public StandRegistration getStandRegistration() {
        return standRegistration;
    }

    public ApplicationRegistration getApplicationRegistration() {

        return appRegistration;

    }

    /**
     * @return the algorithmRegistration
     */
    public AlgorithmRegistration getAlgorithmRegistration() {
        return algorithmRegistration;
    }
}

/*
 public AlgorithmRegistration getAlgorithmRegistration(){
 return algorithmRegistration;
 }

 public void setEventRegistration(EventRegistration eventRegistration) {
 this.eventRegistration = eventRegistration;
 }

 public void setUserRegistration(UserRegistration userRegistration) {
 this.userRegistration = userRegistration;
 }

 public void setAlgorithmRegistration(AlgorithmRegistration algorithmRegistration) {
 this.algorithmRegistration = algorithmRegistration;
 }
 */
