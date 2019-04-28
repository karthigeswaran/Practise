class drumkit{
    boolean topHat= true;
    boolean Snare= true;
    void playSnare(){
        System.out.println("bang bang ba-bang");
    }
    void playTopHat(){
        System.out.println("ding ding da-ding");
    }
}
class DrumKitTestDrive{
    public static void main(String[] args) {
        drumkit d = new drumkit();
        if(d.Snare==true){
            d.playSnare();
        }
        d.Snare=false;
        d.playTopHat();        
    }
}