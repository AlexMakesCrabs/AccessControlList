package ACL;
import java.util.ArrayList;

/*
 * 
 */

public class AccessControlList {
    
    private ArrayList<Entry> stack = new ArrayList<Entry>();
    private int end=0;
    
    public AccessControlList(){
    }
    
    public void push(Entry e){
        this.stack.add(this.end++,e);
    }
    
    public Entry pop(){
        return this.stack.get(--this.end);
    }
    
    public Entry peek(){
        return this.stack.get(this.end-1);
    }
    public Entry peek(int distance){
        if (distance>=this.end) return null;
        return this.stack.get(this.end-distance-1);
    }
    @Override
    public String toString(){
        String r = "";
        for (int i = 0; i < this.end;i++){
            r+= peek(i);
            
            r+= "\n";
        }
        return r;
    }
    
    
    
    public static void main(String[] args){
        AccessControlList a = new AccessControlList();
        
        a.push(new Entry(new Room("Room1"),new Employee("Jason"),true));
        
        
        
    }
    
    


}
