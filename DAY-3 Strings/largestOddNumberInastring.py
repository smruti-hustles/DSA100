#largest prime digit
s=input()
if(s.isdigit):
    l=list(s)
    m=sorted(l)
    a=[]
    flag=1
    for i in l:
        if int(i)%2!=0:
            flag=0
            a.append(i)
    b=sorted(a)       
    if flag==0:        
        print(b[-1])
    else:
        print("")