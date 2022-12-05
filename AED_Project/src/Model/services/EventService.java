/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.services;

/**
 *
 * @author prathamesh
 */

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import Model.HallBooking;
import Model.Events;
import Model.services.EService;

public class EventService extends EService {

    private HallBooking id;

    public static enum EventServiceType {
        WEDDING,
        BIRTHDAYPARTY,
        MEETINGS
    }

    private Map<EventServiceType, Integer> EventServiceTypes;

    public EventService(Events business, Date eventDate) {
        super(business, ServiceType.EVENT, eventDate);
        this.EventServiceTypes = new HashMap<>();
    }

    public Map<EventServiceType, Integer> getEventServiceTypes() {
        return EventServiceTypes;
    }

    public void setEventServiceTypes(Map<EventServiceType, Integer> EventServiceTypes) {
        this.EventServiceTypes = EventServiceTypes;
    }

    public void addService(EventServiceType type, int cost) {
        EventServiceTypes.put(type, cost);
        totalCost += cost;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nEvent service details:");
        sb.append("\n").append(TAB).append("Organization conducting event: ").append(businessCatalogue);
        sb.append("\n").append(TAB).append("Date of event: ").append(getDate());
        sb.append("\n").append(TAB).append("Status: ").append(getStatus());

        if (EventServiceTypes == null || EventServiceTypes.isEmpty()) {
            sb.append("\n").append(TAB).append("No services selected for this booking.");
        } else {
            sb.append("\n").append(TAB).append("Below are the details of services included for the event:");
            for (Map.Entry<EventServiceType, Integer> entry : EventServiceTypes.entrySet()) {
                sb.append("\n").append(TAB).append(TAB)
                        .append(String.format("Service type: %s, Cost: $%d", entry.getKey(), entry.getValue()));
            }
            sb.append("\n").append(TAB).append("Total cost for event: $").append(totalCost);
        }
        return sb.toString();
    }
}
