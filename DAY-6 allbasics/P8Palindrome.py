#Palindrome
n=int(input())
t=n
rev=0
while n!=0:
    r=n%10
    rev=rev*10+r
    n=n//10
if(t==rev):
    print("palindrome") 
else:
    print("not a palindrome")       
 
  