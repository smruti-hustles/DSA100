#print all the duplicates
s=input()
l=list(s)
t=sorted(l)
total=1
i=0
while(i<len(t)):
    total=1
    while(i<len(t)-1 and t[i]==t[i+1]):
        total+=1
        i+=1
    if total>1:
        print(t[i],end=" ")
        print(total)
    i+=1