package file.manager;

public class product {
    private String ProductName;
    private String productOldPrice;
    private String ProductNewPrice;
    private String ProductImg1;
    private String[] product_images;
    private String description;
    private String specification;

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String Productname) {
        this.ProductName = Productname;
    }

    public String getProductOldPrice() {
        return productOldPrice;
    }

    public void setProductOldPrice(String productOldPrice) {
        this.productOldPrice = productOldPrice;
    }

    public String getProductNewPrice() {
        return ProductNewPrice;
    }

    public void setProductNewPrice(String productNewPrice) {
        this.ProductNewPrice = productNewPrice;
    }

    public String getProductImg1() {
        return ProductImg1;
    }

    public void setProductImg1(String productImg1) {
        this.ProductImg1 = productImg1;
    }

    public String[] getProduct_images() {
        return product_images;
    }

    public void setProduct_images(String[] product_images) {
        this.product_images = product_images;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }
}
