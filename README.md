# Instructions

Using the **ArrayList** implementation discussed in class, finish the 3 TO-DOs. 

## TODO #1

Method **contains** should return true if the given value is in the array list (false otherwise). Since the elements of the array are object, make sure that you compare them using the **equals** method (don't use the equality operator). Reference variables should be compared by structure using **equals**.  

## TODO #2

Method **reverse** should do what its name suggests: reverse the order of the elements in the array list. For example, if the array list contains "1 4 10 5 8" then after a call to reverse the array should have the same elements but in the order "8 5 10 4 1". Your solution should avoid creating a new array. Instead, it should swap corresponding elements in the inwards direction. For example: 1<->8 and 4<->5.  

## TODO #3

Method **clear** should recreate the array list (with its initial capacity), essentially wiping out all of its elements. 

# Rubric 

```
+2 contains 
+2 reverse
+1 clear
```