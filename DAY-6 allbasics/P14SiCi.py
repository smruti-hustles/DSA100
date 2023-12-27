#finding simle and compound interest
p=eval(input())
t=eval(input())
r=eval(input())
si=(p*t*r)/100
a1=p+si
print("simple interest = ",si)
print("amount after si= ",a1)
a2=p*((1+(r/100))**t)
ci=a2-p
print("compound interest = ",ci)
print("amount after ci= ",a2)
