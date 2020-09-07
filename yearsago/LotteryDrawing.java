/*
 * Cay S. Horstmann & Gary Cornell, Core Java
 * Published By Sun Microsystems Press/Prentice-Hall
 * Copyright (C) 1997 Sun Microsystems Inc.
 * All Rights Reserved.
 *
 * Permission to use, copy, modify, and distribute this 
 * software and its documentation for NON-COMMERCIAL purposes
 * and without fee is hereby granted provided that this 
 * copyright notice appears in all copies. 
 * 
 * THE AUTHORS AND PUBLISHER MAKE NO REPRESENTATIONS OR 
 * WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE, EITHER 
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. THE AUTHORS
 * AND PUBLISHER SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED 
 * BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING 
 * THIS SOFTWARE OR ITS DERIVATIVES.
 */
 
/**
 * @version 1.00 07 Feb 1996 
 * @author Cay Horstmann
 */

import corejava.*;

public class LotteryDrawing
{  public static int[] drawing(int high, int number)
   {  int i;
      int numbers[] = new int[high];
      int result[] = new int[number];
      // fill an arrays with numbers 1 2 3 . . . high
      for (i = 0; i < high; i++) numbers[i] = i + 1;
      for (i = 0; i < number; i++)
      {  int j = (int)(Math.random() * (high - i));
         result[i] = numbers[j];
         numbers[j] = numbers[high - 1 - i];
      }
      return result;
   }
   
   public static void main(String[] args)
   {  int numbers = Console.readInt
         ("How many numbers do you need to draw?");
      int topNumber = Console.readInt
         ("What is the highest number you can draw?");
   
      int[] a = drawing(topNumber, numbers);
      ShellSort.sort(a);
      System.out.println
("Bet the following combination. It'll make you rich!");
      int i;
      for (i = 0; i < a.length; i++)
         System.out.println(a[i]);
   }
}
