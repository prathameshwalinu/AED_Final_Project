package Model;

public class ServiceLocation {

    private String name;
    private BusinessCatalogueDirectory BusinessCatalogueDirectory;

    public ServiceLocation(String name) {
        this.name = name;
        BusinessCatalogueDirectory = new BusinessCatalogueDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BusinessCatalogueDirectory getBusinessCatalogueDirectory() {
        return BusinessCatalogueDirectory;
    }

    public void setBusinessCatalogueDirectory(BusinessCatalogueDirectory BusinessCatalogueDirectory) {
        this.BusinessCatalogueDirectory = BusinessCatalogueDirectory;
    }
   

    public String toString()

    {
        return name;
    }
}
