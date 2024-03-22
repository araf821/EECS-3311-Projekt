package objects;

public interface CompositeItem {
    int getId();
    String getTitle();
     int getRemainingCopies();
     void setRemainingCopies(int remainingCopies); 
     String getLocation();
     void setLocation(String location);
     boolean isCanPurchase() ;
     void setCanPurchase(boolean canPurchase) ;
     boolean isCanRent(); 
     void setCanRent(boolean canRent) ;
     double getValue() ; 
     void setValue(double value);
        
}
