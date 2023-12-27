#sum of digits of a given number
n=int(input())
sum=0
while n!=0:
    r=n%10
    sum=sum+r
    n=n//10
print(sum)    
  