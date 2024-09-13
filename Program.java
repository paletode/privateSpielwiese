public class Program {
   public static void main(String[] args) {
      long startTime = System.currentTimeMillis(); // Zeit in Millisekunden erfassen
      long duration = 30000; // 20 Sekunden in Millisekunden
      
      for (int i = 0; ; i++) {
         if (System.currentTimeMillis() - startTime >= duration) {
            break; // Beende die Schleife nach 20 Sekunden
         }
      }
      
      System.out.println("Die Schleife hat mindestens 20 Sekunden gedauert.");
   }
}
