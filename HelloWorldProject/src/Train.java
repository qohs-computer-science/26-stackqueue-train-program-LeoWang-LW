public class Train {
    private String name, product, origin, destination;
    private int weight, miles;

    public String name(){
        return name;
    }

    public String contents(){
        return product; 
    }

    public String city(){
        return destination; 
    }

    public String from(){
        return origin; 
    }

    public int getWeight(){
        return weight; 
    }

    public int getMileage(){
        return miles; 
    }

    public String toString(){
        return name + " " +  product + " " + origin + " " +  destination + " " + weight + " " + miles + "\n"; 
    }

    public Train(String n, String p, String o, String d, int w, int m){
        this.name = n; 
        this.product = p; 
        this.origin = o; 
        this.destination = d; 
        this.weight = w; 
        this.miles = m; 
    }
}

