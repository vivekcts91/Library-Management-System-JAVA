package LMS;
import java.util.ArrayList;
public class HoldRequestOperations {
  static ArrayList <HoldRequest> holdRequests;
   public HoldRequestOperations()
   {
       holdRequests= new ArrayList<>();
   }
   // adding a hold req.
   public void addHoldRequest(HoldRequest holdRequest)
   {
       holdRequests.add(holdRequest);
   }
   // removing a hold req.
   public void removeHoldRequest()
   {
       if(!holdRequests.isEmpty())
       {
           holdRequests.remove(0);
       }
   }
}