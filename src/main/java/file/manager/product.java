package file.manager;

public class product {
     String id;
     String name;
     String oldprice;
     String price;
     String mainphoto;
     String[] additionalphotos;
     String description;
     String specification;
    String[] availableColors;
    String[] availableSizes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String[] getAvailableColors() {
        return availableColors;
    }

    public void setAvailableColors(String[] availableColors) {
        this.availableColors = availableColors;
    }



    public String[] getAvailableSizes() {
        return availableSizes;
    }

    public void setAvailableSizes(String[] availableSizes) {
        this.availableSizes = availableSizes;
    }


    public String getName() {
        return name;
    }

    public void setName(String Productname) {
        this.name = Productname;
    }

    public String getOldprice() {
        return oldprice;
    }

    public void setOldprice(String oldprice) {
        this.oldprice = oldprice;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMainphoto() {
        return mainphoto;
    }

    public void setMainphoto(String mainphoto) {
        this.mainphoto = mainphoto;
    }

    public String[] getAdditionalphotos() {
        return additionalphotos;
    }

    public void setAdditionalphotos(String[] additionalphotos) {
        this.additionalphotos = additionalphotos;
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
