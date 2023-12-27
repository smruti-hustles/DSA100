#leap year or not method1
'''y=int(input())
if(y%100==0):
    if(y%400==0):
        print("leap year")
elif(y%4==0):
        print("leap year") 
else:
    print("not a leap year") '''  
#leap years method2
'''
y=int(input())
if ((y%400==0) or (y%4==0 and y%100!=0)):
    print("leap year") 
else:
    print("not leap year")    '''  
#print leap years
for i in range(1000,3000):
    if((i%400==0) or (i%4==0 and i%100!=0)):
        print(i)    
           