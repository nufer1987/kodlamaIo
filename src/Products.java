public class Products {
    public Products(){
        System.out.println("ben calıstim");
    }
    public Products(int id,String name,Double unitPrice,String detail) {
    this();
        this.id=id;
    this.name=name;
    this.detail=detail;
    this.unitPrice=unitPrice;

    }
        int id;
        String name;
        double unitPrice;
        String detail;


}
