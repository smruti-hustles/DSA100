a=int(input())
b=int(input())
if a>b:
    max=a
else:
    max=b    
for i in range(1,max+1):
    if a%i==0 and b%i==0:
        gcd=i
print("gcd is:")        
print(gcd)        