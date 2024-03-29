package Model.services;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author prathmeshw
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Model.BusinessCatalogue;
import Model.Organization;
import ui.main.DateUtils;

public abstract class Service {

    protected static final String TAB = "      ";

    static enum ServiceType {
        EVENT,
        CATERING,
        ENTERTAINMENT,
        RESORT,
    }

    public static enum Status {
        PENDING, CONFIRMED, REJECTED;
    }

    private ServiceType serviceType;
    private int cost;
    private Date date;
    protected BusinessCatalogue businessCatalogue;
    private Status status;
    protected int totalCost;
    private List<Organization> listOfOrganization;

    Service(BusinessCatalogue businessCatalogue, ServiceType serviceType, Date date) {
        this.businessCatalogue = businessCatalogue;
        this.serviceType = serviceType;
        this.date = (date == null) ? null : DateUtils.formatDate(date);
        this.status = Status.PENDING;
        this.listOfOrganization = new ArrayList<>();
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public BusinessCatalogue getBusinessCatalogue() {
        return businessCatalogue;
    }

    public void setBusinessCatalogue(BusinessCatalogue businessCatalogue) {
        this.businessCatalogue = businessCatalogue;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void addOrganization(Organization org) {
        listOfOrganization.add(org);
    }

    public List<Organization> getListOfOrganization() {
        return listOfOrganization;
    }

    public void setListOfOrganization(List<Organization> listOfOrganization) {
        this.listOfOrganization = listOfOrganization;
    }

    public abstract String toString();
}
