public class TesstToday{
	  
	  String productname;
	  String product_brand;
	  int product_id;
	  int total_no_products;


	  public TesstToday()
	  {
	  	System.out.println("no parmtzed constructor");
	  }

	  public TesstToday(String productname,String product_brand,int product_id,int total_no_products)
	  {
         this.productname = productname;
         this.product_brand = product_brand;
         this.product_id = product_id;
         this.total_no_products = total_no_products;
	  }

	  

	  public void displayProductDetails() { // Changed to non-static
        System.out.println("product name: " + productname);
        System.out.println("product brand: " + product_brand);
        System.out.println("product id: " + product_id);
        System.out.println("total_no_products: " + total_no_products);
    }
    public static void main(String args[])
    {
    	TesstToday product = new TesstToday("iphone 15","apple",1,100);
    	TesstToday product3 = new TesstToday("aaa 15","aa",1,100);
    	product.displayProductDetails();
    	product3.displayProductDetails();

}
}