#
n=int(input())
t=n
sum=0
s=str(n)
l=len(s)
while(n!=0):
    r=n%10
    sum=sum+pow(r,l)
    n=n//10
if sum==t:
    print("Armstrong")  
else:
    print("not armstrong")      

