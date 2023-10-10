package entities;

public final class ImportedProduct  extends Product{

    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }


    @Override
    public String priceTag() {

        return this.getName()
             + " "
             + String.format("%.2f",  this.totalPrice())
             + " ("
             + "Customs fee: $"
             + String.format("%.2f", this.getCustomsFee())
             + ")";
    }


    public Double totalPrice() {

        return this.getPrice() + this.getCustomsFee();
    }







}
