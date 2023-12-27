#remove duplictes from the list
l1=eval(input())
ll1=sorted(l1)
l=list(ll1)
l2=[]
for i in range(len(l)-1):
    if(l[i]!=l[i+1]):
        l2.append(l[i])
l2.append(l[-1])        
print(l2)            
