public class Valid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String,Integer> products=new HashMap<>();
       
     int amount;
     int sum=0;
        try{
             products.put("Bike",100);
        products.put("TV",200);
        products.put("Album",10);
        products.put("Book",5);
        products.put("Phone",500);
        products.put("Computer",1000);
        //find the cheapest product from map
            String minProduct=Collections.min(products.keySet());
            amount=Collections.min(products.values());
            System.out.println("the cheapest product is:"+minProduct+"\n"+"Cost:"+amount);
// find the expensive product from map            
            String theExp=Collections.max(products.keySet());
            amount=Collections.max(products.values());
            
            System.out.println("the Expensive product is:"+theExp+"\n"+"Cost:"+amount);
// find sum
for(Integer c:products.values()){
    sum+=c;
}
    System.out.println("Sum="+sum);
// find sum with amount above 10
Set<Map.Entry<String,Integer>> count=products.entrySet();
for(Map.Entry<String,Integer> c:count){
    if(c.getValue()<10){
        count.remove(c.getKey());
    }
    sum+=c.getValue();
}
        System.out.println("new Sum"+sum);
    }catch(NoSuchElementException e){e.getMessage();}
        
        
        
        
        
        
        
    }
}
