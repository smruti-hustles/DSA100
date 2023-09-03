#aligram
s=input()
t=input()
total=0
if len(t)==len(s):
    a=list(s)
    b=list(t)
    x=sorted(a)
    y=sorted(b)
    if(x==y):
        print("true")
    else:
        print("false")   