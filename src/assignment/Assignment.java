/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MsLetshwiti
 */
    import java.util.Scanner;

class Assignment
{

   
   public static void main(String[] args)
   {
       System.out.println("enter the size of array");
       Scanner t=new Scanner(System.in);
       int n=t.nextInt();
       int[] y=new int[n];
       for(int j=0;j<y.length;j++){
       y[j]=j+1;
       System.out.println("array is"+y[j]);
       }
       
             System.out.println("enter any number to search");
             Scanner u=new Scanner(System.in);
             int p=u.nextInt();
             
         binerySearch(y, p);  
         linearSearch( y, p);
          newSearch( y,p);

      //int[] testArr = new int[25]; //values of the array will vary depending on which test you are performing
      
      
   }
   
   public static int linearSearch(int[] y, int key)
   {
      int size = y.length;
      int b=0;
      for(int i=0; i< size; i++)
      {  
          //while(begin<=stop){}
          b=b+1;
         if(y[i] == key)
         {
          System.out.println("number of iteration for linear search is "+b);   
            //result[0] = i; //the matching value is assigned to the first slot 
            //return ; //terminate the operation to get the results
                     return i;

         }
      }
      
      return -1;
   }
   
   public static int binerySearch(int[]y, int key)
           
   {
       int c=0;
      int begin = 0;
      int stop = y.length -1; 
      while(begin <= stop)
      {
          c=c+1;
         int mid = (begin + stop )/ 2;
         //result[0] += 1; // increment the value of the number of comparisons by 1.
         
         if(key ==y[mid])
         {
            stop = mid - 1;
            System.out.println("number of iteration for binary search is "+c);
            
            
         }
         //terminate the loop 
                              //which does not meet the condition of the while loop execution ( while(begin <= stop) )
              if(key < y[mid])
              {
                  stop=mid-1;
              }
              else
         {
              begin = mid + 1; 
         }
      }
      
      return -1;
   }
   
   
   
   public static int newSearch(int[] y, int key)
   {
      int begin = 0;
      int stop = y.length -1;
      int g=0;
      //int[] result = new int[2];
      //result[0] = -1;
      
      while(begin <= stop)
      {
          g=g+1;
         int mid = begin + (stop -begin)/ 5;
         if(key==y[mid]){
             System.out.println("number of iteration for our new search method is "+g);
             
         }
         //result[0] += 1;
         
         if(key < y[mid])
         {
            stop = mid - 1;
            
         }
         else
         {
            begin = mid + 1;
            //result[0] = stop;
         }
      }
      
      return -1;

   }

}
    