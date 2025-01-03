class Product {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        if(newName == null){
            throw new IllegalArgumentException("Name cannot be empty.");
        }else{
            this.name = newName;
        }
       
    }

    private double price;
    public double getPrice(){
        return price;
    }
    public void setPrice(double newPrice){
        if(newPrice < 0){
            throw new IllegalArgumentException("Price can't be negative.");
        }else{
            this.price = newPrice;
        }
    }

    private int quantity;
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int newQuantity){
        if(newQuantity < 0){
            throw new IllegalArgumentException("Quantity can't be negative");
        }else{
            this.quantity = newQuantity;
        }
    }

    public static void main(String[] args) {
        Product obj = new Product();
        System.out.println("Enter the product name: ");
        obj.setName(System.console().readLine());
        System.out.println("Enter the price: ");
        obj.setPrice(Double.parseDouble(System.console().readLine()));
        System.out.println("Enter the quantity: ");
        obj.setQuantity(Integer.parseInt(System.console().readLine()));


        System.out.println("Product Name: " + obj.getName());
        System.out.println("Product Price: " + obj.getPrice());
        System.out.println("Product Quantity: " + obj.getQuantity());

    }
}