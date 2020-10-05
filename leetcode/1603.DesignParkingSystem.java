class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big=big;
        this.medium=medium;
        this.small=small;
    }
    
    public boolean addCar(int carType) {
        if(carType==1 && big>0){
            big-=1;
        }
        else if(carType==2 && medium>0){
            medium-=1;
        }
        else if(carType==3 && small>0){
            small-=1;
        }
        else{
            return false;
        }
        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
//https://leetcode.com/problems/design-parking-system/