package busReserveProject;

public class Bus {
    private int busno;
    private boolean ac;
    private int capacity; //get and set

    Bus(int no,boolean ac,int cap){
        this.busno = no;
        this.ac = ac;
        this.capacity = cap;
    }

    public int getBusNo(){ //accessors
        return busno;
    }

    public boolean isAc(){
        return ac;
    }
    public int getCapacity(){ //accessor method
        return capacity;
    }

    public void setAc(boolean val) { //mutators
        ac = val;
    }

    public void setCapacity(int cap) { //mutator
        capacity = cap;
    }

    public void displayBusInfo(){
        System.out.println("Bus No:" + busno + " Ac:" + ac + " Total Capacity: " + capacity);
    }

}
