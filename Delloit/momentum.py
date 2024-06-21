n=int(input())
p=0
l=[]
for _ in range(n):
    m,v=map(int,input().split())
    mome=m*v
    l.append(mome)
print(sum(l))    