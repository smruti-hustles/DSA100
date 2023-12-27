s1=input()
s2=input()
s=""
for i in s1:
    c=0
    for j in s2:
        if i!=j:
          c=1
    if c==1:
       s+=i      
print(s)