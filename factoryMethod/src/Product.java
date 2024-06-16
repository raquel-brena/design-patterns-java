import java.math.BigDecimal;

public class Product {
    private String description;
    private BigDecimal price;
    private Boolean physicalDimensions;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getPhysicalDimensions() {
        return physicalDimensions;
    }

    public void setPhysicalDimensions(Boolean physicalDimensions) {
        this.physicalDimensions = physicalDimensions;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", physicalDimensions=" + physicalDimensions +
                '}';
    }
}
