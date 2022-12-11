package Model;
/**
 *
 * @author himanshu
 */

import java.util.UUID;

public class Catering_Order {
    private String id;
    private String status;
    private String details;
    private String feedback;
    private Client client;
    private Catering catering;
    private ServiceAgent serviceAgent;

    public Catering_Order(String details) {
//        id = UUID.randomUUID().toString();
        this.details = details;
    }
      public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ServiceAgent getServiceAgent() {
        return serviceAgent;
    }

    public void setServiceAgent(ServiceAgent serviceAgent) {
        this.serviceAgent = serviceAgent;
    }

    public Catering getCatering() {
        return catering;
    }

    public void setCatering(Catering catering) {
        this.catering = catering;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String toString() {
        return details;
    }
}

   