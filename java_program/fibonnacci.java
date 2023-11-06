// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class fibonnacci {
   public fibonnacci() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("ENTER ANY NUMBER");
      int var2 = var1.nextInt();
      int var3 = 0;
      int var4 = 1;
      System.out.println(var3);
      System.out.println(var4);
      boolean var5 = false;

      for(int var6 = 1; var6 <= var2; ++var6) {
         int var7 = var3 + var4;
         System.out.println(var7);
         var3 = var4;
         var4 = var7;
      }

   }
}
