/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Application;
import lapr.project.model.EventCenter;

/**
 *
 * @author RuiSL
 */
public class ListApplicationsController {
    private final EventCenter eventCenter;
    
    public ListApplicationsController(EventCenter eventCenter){
        this.eventCenter=eventCenter;
    }
    
    public List<Application> getGlobalApplicationList(){
        return eventCenter.getEventRegistration().getGlobalApplicationList();
    }
}
