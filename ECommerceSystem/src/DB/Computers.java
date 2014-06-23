package DB;
 
import java.io.Serializable;

public class Computers implements Serializable{
   private String ID;
   private String name;
   private String brand;
   private Double price;
   private String description;
 
    /**
     * @return the custId
     */
    public String getID() {
        return ID;
    }
 
    /**
     * @param custId the custId to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }
 
    /**
     * @return the custName
     */
    public String getName() {
        return name;
    }
 
    /**
     * @param custName the custName to set
     */
    public void setName(String name) {
        this.name = name;
    }
 
    /**
     * @return the country
     */
    public String getBrand() {
        return brand;
    }
 
    /**
     * @param country the country to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
 
    /**
     * @return the phNo
     */
    public Double getPrice() {
        return price;
    }
 
    /**
     * @param phNo the phNo to set
     */
    public void setPrice(Double price) {
        this.price= price;
    }
    
    /**
     * @return the custName
     */
    public String getDescription() {
        return description;
    }
 
    /**
     * @param custName the custName to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}