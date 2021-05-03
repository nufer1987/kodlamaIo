public class oopIntro {
    public static void main(String[] args) {
        Products products1=new Products(1,"lenovo",1500.0,"16 GB Ram");//referans -- instance

        Products products2=new Products();//referans -- instance
        products2.id=2;
        products2.name="lenovo 15";
        products2.unitPrice=1600;
        products2.detail="16 GB Ram";
        Products products3=new Products();//referans -- instance
        products3.id=3;
        products3.name="hp";
        products3.unitPrice=1700;
        products3.detail="32 GB Ram";

        Products[] products={products1,products2,products3
        };
        for(Products p:products){
        System.out.println(p.detail);

    }
        Category category1=new Category();
        category1.id=1;
        category1.name="bilgisayar";
        Category category2=new Category();
        category2.id=2;
        category2.name="ev Bahce";


        ProductsManager productsManager=new ProductsManager();
        productsManager.addToCart(products1 );
        productsManager.addToCart(products2 );
        productsManager.addToCart(products3 );


    }}
