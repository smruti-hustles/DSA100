#removeConsecutiveCharacter
n=input()
s=""
pre=""
for i in n:
     if(len(s)==0):
         s+=i
         pre=i
     if i==pre:
         continue
     else:
         s+=i
         pre=i
print(s)         
         
  