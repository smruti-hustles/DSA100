
n=int(input())
t=n
rev=0
while(n>0):
    r=n%10
    rev=rev*10+r
    n=n//10
print("Reverse of the number is ")
print(rev) 
if t==rev:
    print("Palindrome") 
else:
    print("not a palindrome") 
    '''    
n=int(input())
n1=n
s=str(n)[::-1]
s1=int(s)
print(s)
if s1==n1:
    print("palindrome")
else:
    print("not a palindrome")    
'''