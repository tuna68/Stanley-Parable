import java.util.*;

class util {

   static void wait(int x) {
         try {
            Thread.sleep(x);
         } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
         }
      
      }

}

