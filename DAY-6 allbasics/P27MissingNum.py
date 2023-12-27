def missingNum(num):
    n=set(num)
    l=len(num)
    m=[]
    for i in range(1,num[-1]):
        if i not in n:
              m.append(i)
    return m          
num=[1,2,3,4,6,8]
print(missingNum(num))              
      
