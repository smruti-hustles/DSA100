n,k=map(int,input().split())
count=0
for i in range(n):
    b=bin(i)
    if b.count('1')==k:
        count+=1
print(count)        
