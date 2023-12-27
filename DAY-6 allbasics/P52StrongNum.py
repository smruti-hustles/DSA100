#sum of the factorial of its digits=number
def fact(num):
    f=1
    for i in range(1,num+1):
        f=f*i
    return f
n=int(input())
s=0
t=n
while(n!=0):
    r=n%10
    s=s+fact(r)
    n=n//10
if s==t:
    print("strong number")
else:
    print("not a strong number")    
     
