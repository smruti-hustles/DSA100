def isUnique(ele):
    s=set(str(ele))
    if len(str(ele))==len(s):
        return True
    else:
        return False

#lower and upper limit
l=int(input())
u=int(input())
list=[]
for i in range(l,u+1):
    if isUnique(i):
        list.append(i)
print(f"no of ele with unique digits are = {len(list)}")    
print(list)    

'''

Description:
Write a Program to read the upper and lower limits dynamically and print the count of numbers having unique digits.


Constraints:
Input Format:

Integer – Lower Limit

Integer – Upper Limit

Output Format:

Integer


Example:
Input:

10

15

Output:

5


Explanation:
Explanation:

lower = 10

upper = 15

Numbers in this range are = 10, 11, 12, 13, 14, 15

In this numbers with unique digits are = 10, 12, 13, 14, 15

The count of which is 5

And that is our output.
'''








