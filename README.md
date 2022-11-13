# Patterns Output:
```
Pattern 1:
*
**
***
****
*****
Pattern 2:
*****
****
***
**
*
Pattern 3:
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
Pattern 4:
*
**
***
****
*****
****
***
**
*
Pattern 4:a bit change in the rows/inputs
*
**
***
****
*****
******
*******
********
*******
******
*****
****
***
**
*
Pattern 5:spaces
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********
 *********
  ********
   *******
    ******
     *****
      ****
       ***
        **
         *
Pattern 5:spaces-modified-diamond shape
         * 
        * * 
       * * * 
      * * * * 
     * * * * * 
    * * * * * * 
   * * * * * * * 
  * * * * * * * * 
 * * * * * * * * * 
* * * * * * * * * * 
 * * * * * * * * * 
  * * * * * * * * 
   * * * * * * * 
    * * * * * * 
     * * * * * 
      * * * * 
       * * * 
        * * 
         * 
Pattern 6:
        1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 
Pattern 7:
        1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 
  4 3 2 1 2 3 4 
    3 2 1 2 3 
      2 1 2 
        1 
Pattern 8:
4 4 4 4 4 4 4 4 4 
4 3 3 3 3 3 3 3 4 
4 3 2 2 2 2 2 3 4 
4 3 2 1 1 1 2 3 4 
4 3 2 1 0 1 2 3 4 
4 3 2 1 1 1 2 3 4 
4 3 2 2 2 2 2 3 4 
4 3 3 3 3 3 3 3 4 
4 4 4 4 4 4 4 4 4 

Process finished with exit code 0
```
## Substring in Java
A part of String is called substring. In other words, substring is a subset of another String. Java String class provides the built-in substring() method that extract a substring from the given string by using the index values passed as an argument. In case of substring() method startIndex is inclusive and endIndex is exclusive.
```
public String substring(int startIndex)
public String substring(int startIndex, int endIndex)
```
### startIndex: inclusive
### endIndex: exclusive

```
public class TestSubstring{    
 public static void main(String args[]){    
 String s="SachinTendulkar";    
 System.out.println("Original String: " + s);  
 System.out.println("Substring starting from index 6: " +s.substring(6));//Tendulkar    
 System.out.println("Substring starting from index 0 to 6: "+s.substring(0,6)); //Sachin  
 }  
}    
```
### OutPut
Original String: SachinTendulkar
Substring starting from index 6: Tendulkar
Substring starting from index 0 to 6: Sachin

