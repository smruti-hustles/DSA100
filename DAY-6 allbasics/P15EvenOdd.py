#even or odd
n=int(input())
if n%2==0:
    print("even")
else:
    print("odd") 
#even and odd numbers from 1 to k
k=int(input())
print("even numbers are")
for i in range(1,k+1):   
    if(i%2==0):
        print(i)
print("odd numbers are")
for i in range(1,k+1):   
    if(i%2!=0):
        print(i)