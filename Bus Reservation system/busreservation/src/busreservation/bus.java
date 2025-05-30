package busreservation;

public class bus {
    private int busno;
    private boolean ac;
    private int capacity;

   bus(int no, boolean ac,int capacity){
    this.busno = no;
    this.ac=ac;
    this.capacity = capacity;
   }   
   public int getBusno() {
       return busno;
   }
    public boolean isAc() {
     return ac;
    }
   public int getCapacity() {
       return capacity;
   }
   public void setAc(boolean ac) {
       this.ac = ac;
   }
   public void setcapacity(int cap){
        this.capacity = cap;
   }
}
