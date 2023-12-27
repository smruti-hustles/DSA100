#finding common elements in two lists
l1=eval(input())
l2=eval(input())
l3=[]
for i in l1:
    for j in l2:
        if i==j:
            l3.append(j)
print(l3)            
